package com.github.mobile.aspectj;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

/**
 * Created by Prateek on 2/12/2017.
 */
@Aspect
public class TraceAspect {
    private static final String POINTCUT_METHOD =
            "execution(@com.github.mobile.aspectj.DebugTrace * *(..))";

   //private static final String POINTCUT_CONSTRUCTOR =
    //        "execution(@com.github.mobile.aspectj.DebugTrace *.new(..))";

    @Pointcut(POINTCUT_METHOD)
    public void methodAnnotatedWithDebugTrace() {}

    //@Pointcut(POINTCUT_CONSTRUCTOR)
    //public void constructorAnnotatedDebugTrace() {}

    @After("methodAnnotatedWithDebugTrace()")
    public void weaveJoinPoint(ProceedingJoinPoint joinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        String className = methodSignature.getDeclaringType().getSimpleName();
        String methodName = methodSignature.getName();

        //final StopWatch stopWatch = new StopWatch();
        //stopWatch.start();
        //Object result = joinPoint.proceed();
        //stopWatch.stop();

        DebugLog.log(className,methodName);

        //return result;
    }
    private static String buildLogMessage(String methodName,String className) {
        StringBuilder message = new StringBuilder();
        message.append("Lab8 --> ");
        message.append(className);
        message.append("--> ");
        message.append(methodName);
        return message.toString();
    }
}

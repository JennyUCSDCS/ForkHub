package com.github.mobile.aspectj;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

@Aspect
public class TraceAspect {
    private static final String POINTCUT_METHOD =
            "execution(@com.github.mobile.aspectj.DebugTrace * *(..))";

    @Pointcut(POINTCUT_METHOD)
    public void methodAnnotatedWithDebugTrace() {}

    @After("methodAnnotatedWithDebugTrace()")
    public void weaveJoinPoint(ProceedingJoinPoint joinPoint, Exception ex) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        String className = methodSignature.getDeclaringType().getSimpleName();
        String message = ex.getCause().getMessage();
        DebugLog.log(className,message);

    }

}

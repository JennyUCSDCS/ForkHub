package com.github.mobile.ui.comment;
import com.github.mobile.ui.DialogFragment;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by riakira on 17/2/13.
 */

public class CommentTypeFactory {
    private static Map<Integer,CommentType>map;
    static {
        map = new HashMap<>();
        map.put(0,new RawCommentFragment());
        map.put(1,new RenderedCommentFragment());
    }
    public void createType(int x, CommentType type){
        map.put(x,type);
    }
    public CommentType getCommentType(int x){
        return map.get(x);
    }

}



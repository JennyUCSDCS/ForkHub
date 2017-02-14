package com.github.mobile.ui.comment;

import com.github.mobile.ui.DialogFragment;

/**
 * Created by riakira on 17/2/13.
 */

public class CommentTypeFactory {
    public CommentType getCommentType(int x)
    {
        if(x==0)
        {
            return  new RawCommentFragment();
        }else if(x==1)
        {
            return new RenderedCommentFragment();
        }
        return null;
    }
}

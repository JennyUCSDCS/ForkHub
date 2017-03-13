package com.github.mobile.ui.comment;

import android.app.Fragment;

import com.github.mobile.ui.DialogFragment;

/**
 * Created by riakira on 17/2/13.
 */

public interface CommentType {
    public void setText(String s);
    public abstract DialogFragment createObject();
}

package com.github.mobile.ui.issue;

import android.content.res.Resources;

import com.github.mobile.api.model.Issue;
import com.github.mobile.api.model.TimelineEvent;

/**
 * Created by jenniferhe on 3/13/17.
 */

public abstract class Event {
    public abstract String Message(Resources resources, TimelineEvent event);
    public abstract String Message(Issue issue, Resources resources, TimelineEvent event);
    public abstract String Message(int TextResource, Resources resources, TimelineEvent event);

}


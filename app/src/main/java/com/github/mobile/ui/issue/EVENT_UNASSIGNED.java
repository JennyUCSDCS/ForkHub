package com.github.mobile.ui.issue;

import android.content.res.Resources;

import com.github.mobile.api.model.Issue;
import com.github.mobile.api.model.TimelineEvent;

/**
 * Created by jenniferhe on 3/13/17.
 */

public class EVENT_UNASSIGNED extends Event {
    public String Message(Resources resources, TimelineEvent event) {
        return null;
    }

    public String Message(Issue issue, Resources resources, TimelineEvent event){
        return null;
    }

    public String Message(int TextResource, Resources resources, TimelineEvent event) {
        String message = String.format(resources.getString(TextResource), "<b>" + event.actor.login + "</b>");
        return message;
    }
}
package com.github.mobile.ui.issue;

import android.content.res.Resources;

import com.github.mobile.R;
import com.github.mobile.api.model.Issue;
import com.github.mobile.api.model.TimelineEvent;

/**
 * Created by jenniferhe on 3/13/17.
 */

public class EVENT_REFERENCED extends Event {
    public String Message(Resources resources, TimelineEvent event) {
        return String.format(resources.getString(R.string.issue_event_referenced), "<b>" + event.commit_id.substring(0,7) + "</b>");
    }

    public String Message(Issue issue, Resources resources, TimelineEvent event){
        return null;
    }

    public String Message(int TextResource, Resources resources, TimelineEvent event) {
        return null;
    }
}
package com.github.mobile.core.issue;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.egit.github.core.Issue;
import org.eclipse.egit.github.core.Label;
import org.eclipse.egit.github.core.Milestone;
import org.eclipse.egit.github.core.PullRequest;
import org.eclipse.egit.github.core.User;
import org.eclipse.egit.github.core.util.DateUtils;
import org.eclipse.egit.github.core.Repository;

/**
 * Created by jenniferhe on 2/13/17.
 */

public class InstoreIssue extends Issue {
    private static final long serialVersionUID = 6219926097588214812L;
    private long id;
    private Date closedAt;
    private Date createdAt;
    private Date updatedAt;
    private int comments;
    private int number;
    private List<Label> labels;
    private Milestone milestone;
    private PullRequest pullRequest;
    private String body;
    private String bodyHtml;
    private String bodyText;
    private String htmlUrl;
    private String state;
    private String title;
    private String url;
    private User assignee;
    private User user;
    private User closedBy;

    public static class UserBuilder {
        private long id;
        private Date closedAt;
        private Date createdAt;
        private Date updatedAt;
        private int comments;
        private int number;
        private List<Label> labels;
        private Milestone milestone;
        private PullRequest pullRequest;
        private String body;
        private String bodyHtml;
        private String bodyText;
        private String htmlUrl;
        private String state;
        private String title;
        private String url;
        private User assignee;
        private User user;
        private User closedBy;

        public UserBuilder id(long id) {
            this.id = id;
            return this;
        }

        public UserBuilder closedAt(Date closedAt) {
            this.closedAt = DateUtils.clone(closedAt);
            return this;
        }

        public UserBuilder createdAt(Date createdAt) {
            this.createdAt = DateUtils.clone(createdAt);
            return this;
        }

        public UserBuilder updatedAt(Date updatedAt) {
            this.updatedAt = DateUtils.clone(updatedAt);
            return this;
        }
        public UserBuilder comments(int comments) {
            this.comments = comments;
            return this;
        }

        public UserBuilder number(int number) {
            this.number = number;
            return this;
        }

        public UserBuilder labels(List<Label> labels) {
            this.labels = labels != null?new ArrayList(labels):null;
            return this;
        }

        public UserBuilder milestone(Milestone milestone) {
            this.milestone = milestone;
            return this;
        }

        public UserBuilder pullRequest(PullRequest pullRequest) {
            this.pullRequest = pullRequest;
            return this;
        }

        public UserBuilder body(String body) {
            this.body = body;
            return this;
        }

        public UserBuilder bodyHtml(String bodyHtml) {
            this.bodyHtml = bodyHtml;
            return this;
        }

        public UserBuilder bodyText(String bodyText) {
            this.bodyText = bodyText;
            return this;
        }

        public UserBuilder htmlUrl(String htmlUrl) {
            this.htmlUrl = htmlUrl;
            return this;
        }

        public UserBuilder state(String state) {
            this.state = state;
            return this;
        }

        public UserBuilder title(String title) {
            this.title = title;
            return this;
        }

        public UserBuilder url(String url) {
            this.url = url;
            return this;
        }

        public UserBuilder assignee(User assignee) {
            this.assignee = assignee;
            return this;
        }

        public UserBuilder user(User user) {
            this.user = user;
            return this;
        }

        public UserBuilder closedBy(User closedBy) {
            this.closedBy = closedBy;
            return this;
        }

    }

    public InstoreIssue(UserBuilder builder) {
        this.id = builder.id;
        this.closedAt = builder.closedAt;
        this.createdAt = builder.createdAt;
        this.updatedAt = builder.updatedAt;
        this.comments = builder.comments;
        this.number = builder.number;
        this.labels = builder.labels;
        this.milestone = builder.milestone;
        this.pullRequest = builder.pullRequest;
        this.body = builder.body;
        this.bodyHtml = builder.bodyHtml;
        this.bodyText = builder.bodyText;
        this.htmlUrl = builder.htmlUrl;
        this.state = builder.state;
        this.title = builder.title;
        this.url = builder.url;
        this.assignee = builder.assignee;
        this.user = builder.user;
        this.closedBy = builder.closedBy;
    }



    private Repository repository;

    public Repository getRepository() {
        return this.repository;
    }

    public InstoreIssue setRepository(Repository repository) {
        this.repository = repository;
        return this;
    }

    public String toString() {
        return "Issue " + this.number;
    }

}



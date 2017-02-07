package com.github.mobile.util;

/**
 * Created by jenniferhe on 2/6/17.
 */
import android.webkit.WebView;

import  com.github.mobile.util.SourceEditor;
import org.eclipse.egit.github.core.Blob;

import java.io.Serializable;

public interface Editor extends Serializable{
    public void init();
    public void setCodeView(final WebView codeView);
    public SourceEditor setWrap(final boolean wrap);
    public boolean getWrap();
    public SourceEditor toggleWrap();
    public boolean isMarkdown();
    public SourceEditor toggleMarkdown();
    public SourceEditor setSource(final String name, final Blob blob);
    public SourceEditor setSource(final String name, final String content, final boolean encoded);
    public SourceEditor setMarkdown(final boolean markdown);
}

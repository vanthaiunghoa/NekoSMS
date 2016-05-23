package com.crossbowffs.nekosms.data;

import android.text.TextUtils;

public class SmsFilterPatternData {
    private final SmsFilterField mField;
    private SmsFilterMode mMode;
    private String mPattern;
    private boolean mCaseSensitive;

    public SmsFilterPatternData(SmsFilterField field) {
        reset();
        mField = field;
    }

    public boolean hasData() {
        return !TextUtils.isEmpty(mPattern);
    }

    public void reset() {
        mMode = null;
        mPattern = null;
        mCaseSensitive = false;
    }

    public SmsFilterPatternData setMode(SmsFilterMode mode) {
        mMode = mode;
        return this;
    }

    public SmsFilterPatternData setPattern(String pattern) {
        mPattern = pattern;
        return this;
    }

    public SmsFilterPatternData setCaseSensitive(boolean caseSensitive) {
        mCaseSensitive = caseSensitive;
        return this;
    }

    public SmsFilterField getField() {
        return mField;
    }

    public SmsFilterMode getMode() {
        return mMode;
    }

    public String getPattern() {
        return mPattern;
    }

    public boolean isCaseSensitive() {
        return mCaseSensitive;
    }
}
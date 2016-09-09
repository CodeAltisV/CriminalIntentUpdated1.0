package com.codealtis.varun.criminalintent;

import java.util.UUID;

/**
 * Created by SPARSH on 06-09-2016.
 */
public class Crime {
    private UUID mId;
    private String mTitle;

    public Crime() {
        //Generate unique identifier
        mId = UUID.randomUUID();
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public UUID getId() {
        return mId;
    }

    }


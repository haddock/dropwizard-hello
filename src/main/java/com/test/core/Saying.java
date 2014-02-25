package com.test.core;

/**
 * Created by fredrik.bergljung on 25/02/14.
 */
public class Saying {
    private final long id;
    private final String content;

    public Saying(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}

package com.twentyfifth.workshop.domain;

public enum Validity {
    UNKNOWN ("glyphicon-minus"),
    VALID ("glyphicon-ok"),
    INVALID ("glyphicon-remove");

    private final String cssClass;

    Validity(String cssClass) {
        this.cssClass = cssClass;
    }

    public String getCssClass() {
        return cssClass;
    }
}

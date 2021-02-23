package com.example.i18n.i18n;

public enum MessagesProperties {

    MSG_EXCEPTION_100("100");

    MessagesProperties(String ms) {
        this.ms = ms;
    }

    private String ms;

    public String getMs() {
        return ms;
    }
}

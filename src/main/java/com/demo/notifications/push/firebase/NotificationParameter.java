package com.demo.notifications.push.firebase;


public enum NotificationParameter {
    SOUND("default"),
    COLOR("#2E2EFE"),
    IMAGE("src/main/resources/templates/icon.jpg");

    private String value;

    NotificationParameter(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}

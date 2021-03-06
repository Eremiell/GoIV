package com.kamron.pogoiv.updater;


public class AppUpdateEvent {
    public static final int OK = 1;
    public static final int FAILED = 2;
    public static final int UPTODATE = 3;


    AppUpdate appUpdate;
    int status;

    public AppUpdateEvent(int status) {
        this.status = status;
    }

    public AppUpdateEvent(int status, AppUpdate update) {
        this.status = status;
        this.appUpdate = update;
    }

    public int getStatus() {
        return status;
    }

    public AppUpdate getAppUpdate() {
        return appUpdate;
    }
}

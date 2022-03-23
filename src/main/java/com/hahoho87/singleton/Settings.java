package com.hahoho87.singleton;

public class Settings {

    // double check locking
    // 코드 복잡도 증가
    private static volatile Settings instance;

    private Settings() {
    }

    public static synchronized Settings getInstance() {
        if (instance == null) {
            synchronized (Settings.class) {
                if (instance == null) {
                    instance = new Settings();
                }
            }
        }
        return instance;
    }
}

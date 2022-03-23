package com.hahoho87.singleton;

public class Settings {

    // double check locking
    // 코드 복잡도 증가
    private static volatile Settings instance;

    private Settings() {
    }

    // static inner class 활용
    private static class SettingsHolder {
        private static final Settings SETTINGS = new Settings();
    }

    public static synchronized Settings getInstance() {
        return SettingsHolder.SETTINGS;
    }
}

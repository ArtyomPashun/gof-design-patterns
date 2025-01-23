package com.pashuna.patterns.creational.singleton;

public class ProgramLogger {

    private static ProgramLogger instance;

    private String logFile = "This is logFile. \n\n";

    private ProgramLogger() {
    }

    public static ProgramLogger getInstance() {
        if (instance == null) {
            synchronized (ProgramLogger.class) {
                if (instance == null) {
                    instance = new ProgramLogger();
                }
            }
        }
        return instance;
    }

    public void addLogInfo(String logInfo) {
        logFile += logInfo + "\n";
    }

    public void showLogFile() {
        System.out.println(logFile);
    }
}

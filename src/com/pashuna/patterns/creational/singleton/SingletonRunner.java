package com.pashuna.patterns.creational.singleton;

public class SingletonRunner {
    public static void main(String[] args) {
        ProgramLogger.getInstance().addLogInfo("First log...");
        ProgramLogger.getInstance().addLogInfo("Second log...");
        ProgramLogger.getInstance().addLogInfo("Third log...");

        ProgramLogger.getInstance().showLogFile();
    }
}

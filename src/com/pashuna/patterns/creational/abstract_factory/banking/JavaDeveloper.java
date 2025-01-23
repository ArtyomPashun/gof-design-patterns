package com.pashuna.patterns.creational.abstract_factory.banking;

import com.pashuna.patterns.creational.abstract_factory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code...");
    }
}

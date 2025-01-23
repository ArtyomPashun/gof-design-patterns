package com.pashuna.patterns.creational.abstract_factory.banking;

import com.pashuna.patterns.creational.abstract_factory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("ManualTester tests banking code...");
    }
}

package com.pashuna.patterns.creational.factory_method;

public class FactoryMethodRunner {

    public static void main(String[] args) {
        DeveloperFactory developerFactory = new JavaDeveloperFactory();
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }
}

package com.pashuna.patterns.creational.factory_method;

public class JavaDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}

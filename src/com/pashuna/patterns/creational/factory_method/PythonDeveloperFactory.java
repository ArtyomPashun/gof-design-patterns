package com.pashuna.patterns.creational.factory_method;

public class PythonDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new PythonDeveloper();
    }
}

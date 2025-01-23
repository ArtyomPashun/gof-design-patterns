package com.pashuna.patterns.creational.abstract_factory.banking;

import com.pashuna.patterns.creational.abstract_factory.Manager;

public class ProjectManager implements Manager {
    @Override
    public void manageProject() {
        System.out.println("ProjectManager manages banking project...");
    }
}

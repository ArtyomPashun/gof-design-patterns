package com.pashuna.patterns.creational.prototype;

public class PrototypeRunner {
    public static void main(String[] args) {
        Project master = new Project(1, "first", "source code = smth");
        System.out.println(master);

        ProjectFactory projectFactory = new ProjectFactory(master);
        Project masterClone = projectFactory.cloneProject();
        System.out.println(masterClone);

    }
}

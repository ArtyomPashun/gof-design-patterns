package com.pashuna.patterns.creational.abstract_factory;

import com.pashuna.patterns.creational.abstract_factory.banking.BankingTeamFactory;

public class AbstractFactoryRunner {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        Manager manager = projectTeamFactory.getmanager();

        System.out.println("Creating banking project...");
        developer.writeCode();
        tester.testCode();
        manager.manageProject();
    }
}

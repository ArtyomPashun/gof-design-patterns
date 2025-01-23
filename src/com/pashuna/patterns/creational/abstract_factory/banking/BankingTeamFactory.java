package com.pashuna.patterns.creational.abstract_factory.banking;

import com.pashuna.patterns.creational.abstract_factory.Developer;
import com.pashuna.patterns.creational.abstract_factory.Manager;
import com.pashuna.patterns.creational.abstract_factory.ProjectTeamFactory;
import com.pashuna.patterns.creational.abstract_factory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public Manager getmanager() {
        return new ProjectManager();
    }
}

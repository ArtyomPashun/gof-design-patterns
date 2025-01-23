package com.pashuna.patterns.creational.abstract_factory;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    Manager getmanager();
}

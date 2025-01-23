package com.pashuna.patterns.creational.abstract_factory.website;

import com.pashuna.patterns.creational.abstract_factory.Developer;
import com.pashuna.patterns.creational.abstract_factory.Manager;
import com.pashuna.patterns.creational.abstract_factory.ProjectTeamFactory;
import com.pashuna.patterns.creational.abstract_factory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QaTester();
    }

    @Override
    public Manager getmanager() {
        return new WebsiteProjectManager();
    }
}

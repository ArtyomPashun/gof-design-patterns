package com.pashuna.patterns.creational.abstract_factory.website;

import com.pashuna.patterns.creational.abstract_factory.Manager;

public class WebsiteProjectManager implements Manager {
    @Override
    public void manageProject() {
        System.out.println("WebsiteProjectManager manages website project...");
    }
}

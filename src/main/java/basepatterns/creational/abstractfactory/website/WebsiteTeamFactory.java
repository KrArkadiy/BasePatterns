package main.java.basepatterns.creational.abstractfactory.website;

import main.java.basepatterns.creational.abstractfactory.Developer;
import main.java.basepatterns.creational.abstractfactory.ProjectManager;
import main.java.basepatterns.creational.abstractfactory.ProjectTeamFactory;
import main.java.basepatterns.creational.abstractfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}

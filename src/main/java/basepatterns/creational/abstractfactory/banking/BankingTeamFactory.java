package main.java.basepatterns.creational.abstractfactory.banking;

import main.java.basepatterns.creational.abstractfactory.Developer;
import main.java.basepatterns.creational.abstractfactory.ProjectManager;
import main.java.basepatterns.creational.abstractfactory.ProjectTeamFactory;
import main.java.basepatterns.creational.abstractfactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}

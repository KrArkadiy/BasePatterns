package main.java.basepatterns.creational.abstractfactory.banking;

import main.java.basepatterns.creational.abstractfactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PB manages banking project");
    }
}

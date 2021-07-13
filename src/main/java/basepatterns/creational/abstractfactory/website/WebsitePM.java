package main.java.basepatterns.creational.abstractfactory.website;

import main.java.basepatterns.creational.abstractfactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website...");
    }
}

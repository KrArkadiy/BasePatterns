package main.java.basepatterns.creational.abstractfactory.banking;

import main.java.basepatterns.creational.abstractfactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java Developer writes Java code...");
    }
}

package main.java.basepatterns.creational.abstractfactory.website;

import main.java.basepatterns.creational.abstractfactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual Tester tests website code...");
    }
}

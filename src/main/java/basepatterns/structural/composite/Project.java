package main.java.basepatterns.structural.composite;

import main.java.basepatterns.structural.bridge.Developer1;

public class Project {
    public static void main(String[] args) {
        Team team = new Team();

        Developer2 fistJavaDeveloper = new JavaDeveloper1();
        Developer2 secondJavaDeveloper = new JavaDeveloper1();
        Developer2 cppDeveloper = new CppDeveloper1();

        team.addDeveloper(fistJavaDeveloper);
        team.addDeveloper(secondJavaDeveloper);
        team.addDeveloper(cppDeveloper);

        team.createProject();
    }
}

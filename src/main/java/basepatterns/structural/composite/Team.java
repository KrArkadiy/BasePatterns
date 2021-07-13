package main.java.basepatterns.structural.composite;

import main.java.basepatterns.creational.abstractfactory.Developer;

import java.util.ArrayList;
import java.util.List;

public class Team implements Developer2{
    private List<Developer2> developers = new ArrayList<Developer2>();

    public void addDeveloper(Developer2 developer){
        developers.add(developer);
    }

    public void removeDeveloper(Developer2 developer){
        developers.remove(developer);
    }

    public void createProject(){
        writeCode();
    }

    @Override
    public void writeCode() {
        System.out.println("Team creates project...\n");
        for(Developer2 developer : developers) {
            developer.writeCode();
        }
    }
}

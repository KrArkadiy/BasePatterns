package main.java.basepatterns.structural.bridge;

import main.java.basepatterns.creational.abstractfactory.Developer;

public abstract class Program1 {
    protected Developer1 developer;

    protected Program1(Developer1 developer){
        this.developer = developer;
    }

    public abstract void developProgram();

}

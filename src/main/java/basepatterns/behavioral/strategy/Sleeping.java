package main.java.basepatterns.behavioral.strategy;

public class Sleeping implements Activity{
    @Override
    public void justDoIt() {
        System.out.println("Sleeping...");
    }
}
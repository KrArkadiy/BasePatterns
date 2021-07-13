package main.java.basepatterns.structural.bridge;

public class BankSystem extends Program1{

    protected BankSystem(Developer1 developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Bank system development in progress...");
        developer.writecode();
    }
}

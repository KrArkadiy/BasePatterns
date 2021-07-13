package main.java.basepatterns.structural.bridge;

public class StockExchange extends Program1{
    protected StockExchange(Developer1 developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock exchange development in progress...");
        developer.writecode();
    }
}

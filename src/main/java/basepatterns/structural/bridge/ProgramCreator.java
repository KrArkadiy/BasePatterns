package main.java.basepatterns.structural.bridge;

public class ProgramCreator {
    public static void main(String[] args) {
        Program1[] programs = {
                new BankSystem(new CppDeveloper()),
                new StockExchange(new JavaDeveloper())
        };

        for(Program1 program : programs){
            program.developProgram();
        }
    }
}

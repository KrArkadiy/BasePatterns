package main.java.basepatterns.structural.bridge;

public class CppDeveloper implements Developer1{
    @Override
    public void writecode() {
        System.out.println("C++ developer writes C++ code...");
    }
}

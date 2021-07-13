package main.java.basepatterns.structural.adapter;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new AdapterJavaToDatabase();

        database.update();
        database.insert();
        database.remove();
        database.select();
    }
}

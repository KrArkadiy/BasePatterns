package main.java.basepatterns.creational.factory;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpeciality("java");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
        DeveloperFactory developerFactory1 = createDeveloperBySpeciality("c++");
        Developer developer1 = developerFactory1.createDeveloper();
        developer1.writeCode();
        DeveloperFactory developerFactory2 = createDeveloperBySpeciality("php");
        Developer developer2 = developerFactory2.createDeveloper();
        developer2.writeCode();
    }

    static DeveloperFactory createDeveloperBySpeciality(String speciality) {
        if (speciality.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else if (speciality.equalsIgnoreCase("php")) {
            return new PHPDeveloperFactory();
        } else {
            throw new RuntimeException(speciality + " is unknown speciality");
        }
    }
}

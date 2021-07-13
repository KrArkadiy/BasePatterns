package main.java.basepatterns.behavioral.observer;

public class JobSearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancies("First Java position");
        jobSite.addVacancies("Second Java position");

        Observer firstSubscriber = new Subscriber("Arkadiy Krylosov");
        Observer secondSubscriber = new Subscriber("Artem Vlasov");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

        jobSite.addVacancies("Third Java posotion");
    }
}

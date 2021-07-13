package main.java.basepatterns.structural.facade;

public class Workflow {
    Developer developer = new Developer();
    BugTracker bugTracker = new BugTracker();
    Job job = new Job();

    public void solveProblems(){
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadLine(bugTracker);
    }
}

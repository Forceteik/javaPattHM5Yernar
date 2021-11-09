package Facade;

public class WorkFlow {
    SoftwareEngineer softwareEngineer = new SoftwareEngineer();
    Work work = new Work();
    BugTracker bugTracker = new BugTracker();

    public void solveProblem(){
        work.doWork();
        bugTracker.startSprint();
        softwareEngineer.doWorkBeforeDeadline(bugTracker);
    }
}

package Facade;

public class SoftwareEngineer {
    public void doWorkBeforeDeadline(BugTracker bugTracker){
        if(bugTracker.isActiveSprint()){
            System.out.println("Software engineer is working...");
        }else {
            System.out.println("Software engineer is resting...");
        }
    }
}

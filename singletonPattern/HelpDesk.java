package singletonPattern;

public class HelpDesk {
    private String deskName;
    private QueueSystem queueSystem;
    
    public HelpDesk(String deskName) {
        this.deskName = deskName;
        this.queueSystem = QueueSystem.getInstance();
    }

    public void serveCurrent() {
        int current = queueSystem.getCurrentNumber();
        System.out.println(deskName + " is now serving Queue Number: " + current);
    }

    public void showNextInLine() {
        int next = queueSystem.getNextNumber();
        System.out.println("Next Queue Number to be Served: " + next);
    }

    public void resetQueue(int newNumber) {
        System.out.println(deskName + " is resetting the queue...");
        queueSystem.resetQueue(newNumber);
    }
}
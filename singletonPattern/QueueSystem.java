package singletonPattern;

public class QueueSystem {
    private static QueueSystem instance;
    private int currentNumber;
    
    private QueueSystem() {
        currentNumber = 0;
    }
    
    public static synchronized QueueSystem getInstance() {
        if (instance == null) {
            instance = new QueueSystem();
        }
        return instance;
    }

    public synchronized int getCurrentNumber() {
        currentNumber++;
        System.out.println("Now Serving Queue Number: " + currentNumber);
        return currentNumber;
    }

    public synchronized int getNextNumber() {
        return currentNumber + 1;
    }
    
    public void resetQueue(int newNumber) {
        currentNumber = newNumber;
        System.out.println("Queue has been reset to: " + currentNumber);
    }
}
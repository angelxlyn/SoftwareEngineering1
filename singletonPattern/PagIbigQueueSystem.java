package singletonPattern;

public class PagIbigQueueSystem {
    public static void main(String[] args) {
        HelpDesk desk1 = new HelpDesk("Help Desk 1");
        HelpDesk desk2 = new HelpDesk("Help Desk 2");
        HelpDesk desk3 = new HelpDesk("Help Desk 3");

        desk1.serveCurrent();
        desk2.serveCurrent();
        desk3.serveCurrent();

        System.out.println("-------------------------------------");
        desk2.showNextInLine();

        System.out.println("-------------------------------------");
        desk2.resetQueue(0);

        System.out.println("-------------------------------------");
        desk1.serveCurrent();
        desk3.serveCurrent();

        System.out.println("-------------------------------------");
        desk1.showNextInLine();
    }
}

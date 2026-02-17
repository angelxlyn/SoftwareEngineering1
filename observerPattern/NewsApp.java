import java.util.Set;

public class NewsApp {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        Subscriber alice = new NewsReader("Alice", Set.of("Sports", "Tech"));
        Subscriber bob = new NewsReader("Bob", Set.of("Politics"));
        Subscriber charlie = new NewsReader("Charlie", Set.of("All"));

        agency.subscribe(alice);
        agency.subscribe(bob);
        agency.subscribe(charlie);

        agency.publishNews("Sports", "Local team wins championship!");
        agency.publishNews("Politics", "New policy announced by government.");
        agency.publishNews("Tech", "New smartphone model released.");

        bob.setPreferences(Set.of("Tech"));

        agency.publishNews("Tech", "AI breakthrough in healthcare.");
        agency.publishNews("Sports", "Olympics postponed due to weather.");

        agency.unsubscribe(alice);

        agency.publishNews("Politics", "Election debate highlights.");
    }
}

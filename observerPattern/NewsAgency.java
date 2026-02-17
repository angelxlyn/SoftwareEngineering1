import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class NewsAgency {
    private List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber s) {
        subscribers.add(s);
    }

    public void unsubscribe(Subscriber s) {
        subscribers.remove(s);
        System.out.println(((NewsReader) s).getName() + " unsubscribed.");
    }

    public void publishNews(String category, String news) {
        System.out.println("\n[NewsAgency] Breaking News (" + category + "): " + news);
        notifySubscribers(category, news);
    }

    private void notifySubscribers(String category, String news) {
        for (Subscriber s : subscribers) {
            Set<String> prefs = s.getPreferences();
            if (prefs.contains("All") || prefs.contains(category)) {
                s.update(news);
            }
        }
    }
}
import java.util.Set;

public class NewsReader implements Subscriber {
    private String name;
    private Set<String> preferences;
    
    public NewsReader(String name, Set<String> preferences) {
        this.name = name;
        this.preferences = preferences;
        System.out.println(name + " subscribed with preferences: " + preferences);
    }

    @Override
    public void update(String news) {
        System.out.println(name + " received update: " + news);
    }

    @Override
    public void setPreferences(Set<String> preferences) {
        this.preferences = preferences;
        System.out.println(name + " updated preferences to: " + preferences);
    }

    @Override
    public Set<String> getPreferences() {
        return preferences;
    }

    public String getName() {
        return name;
    }
}
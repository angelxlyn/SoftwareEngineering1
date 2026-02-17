import java.util.Set;

public interface Subscriber {
    void update(String news);
    void setPreferences(Set<String> preferences);
    Set<String> getPreferences();
}
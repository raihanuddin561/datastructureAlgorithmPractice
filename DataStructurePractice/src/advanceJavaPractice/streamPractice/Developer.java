package advanceJavaPractice.streamPractice;

import java.util.HashSet;
import java.util.Set;

public class Developer {
    private String name;
    private Set<String> language;

    public Developer(String name) {
        this.language = new HashSet<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void add(String language){
        this.language.add(language);
    }
    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getLanguage() {
        return language;
    }

    public void setLanguage(Set<String> language) {
        this.language = language;
    }
}

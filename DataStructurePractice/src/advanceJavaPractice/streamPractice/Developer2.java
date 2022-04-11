package advanceJavaPractice.streamPractice;

import java.util.ArrayList;
import java.util.List;

public class Developer2 {
    private int age;
    private String name;
    private List<String> languages;

    public Developer2(String name) {
        this.name = name;
        this.languages = new ArrayList<>();
    }

    public Developer2(int age, String name) {
        this.age = age;
        this.name = name;
        this.languages = new ArrayList<>();
    }

    public void add(String language){
        languages.add(language);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Developer2{" +
                "name='" + name + '\'' +
                ", languages=" + languages +
                '}';
    }
}

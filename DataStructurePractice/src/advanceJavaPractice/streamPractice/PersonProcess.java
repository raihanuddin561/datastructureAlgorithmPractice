package advanceJavaPractice.streamPractice;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class PersonProcess {
    public void process(){
        List<Person> personList = List.of(
                new Person(26, "Raihan", Gender.MALE),
                new Person(24,"Afsana",Gender.FEMALE),
                new Person(15,"Sayeem",Gender.MALE),
                new Person(12,"Tamanna",Gender.FEMALE),
                new Person(23,"Eram",Gender.MALE),
                new Person(20,"Rifat",Gender.MALE),
                new Person(8,"Saif",Gender.MALE),
                new Person(8,"Omio",Gender.FEMALE)
        );
/*
        personList.stream().sorted((p1,p2)->{
             if(p1.getAge()>p2.getAge()){
                return 1;
            }else if(p1.getAge()<p2.getAge()){
                return -1;
            }else  return p1.getName().compareTo(p2.getName());
        }).forEach(person -> System.out.println(person.getAge()+" "+person.getName()));*/

        personList.stream().sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getName))
                .forEach(this::print);
    }

    int comparedByAgeThenName(Person p1,Person p2){
        if(p1.getAge()>p2.getAge()) return 1;
        else if(p1.getAge()<p2.getAge()) return -1;
        else return p1.getName().compareTo(p2.getName());
    }
    public void print(Person person){
        System.out.println(person.getAge()+" "+person.getName());
    }

    public static void forEach(List<Person> lists, Consumer<Person> func){
        for(Person person:lists){
            func.accept(person);
        }
    }
}

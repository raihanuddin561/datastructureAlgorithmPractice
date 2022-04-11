package advanceJavaPractice.streamPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BookProcess {
    public static String findingBooks(List<Book> books){
        List<Book> englishBooks = new ArrayList<>();
        for (Book book: books){
            if(book.getLanguage().equals("English") && book.getPrice()>=500 && book.getPrice()<=1000){
                englishBooks.add(book);
            }
        }
        Collections.sort(englishBooks, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return Double.compare(o1.getPrice(),o2.getPrice());
            }
        });
        final String comma =",";
        StringBuilder bookBuilder = new StringBuilder();
        for(Book englishBook:englishBooks){
            bookBuilder.append(englishBook.toString()).append(comma);
        }
        return bookBuilder.toString();
    }
    public static String findingsBook(List<Book> books){
        return books.stream()
                .filter(book -> book.getPrice()>=500 && book.getPrice()<=1000)
                .filter(book -> book.getLanguage().equals("English"))
                .sorted(Comparator.comparingDouble(Book::getPrice))
                .map(Book::toString)
                .collect(Collectors.joining(", "));
    }

    public static void process(){
        /*List<String> list = new ArrayList<>();
        list.add("I");
        list.add("love");
        list.add("Java");
        Stream<String> stream = list.stream();
        System.out.println(stream.collect(Collectors.toList()));*/
        /*Stream<Integer> stream = Stream.iterate(2,v->v<100,v->v*2);
        stream.forEach(val-> System.out.println("value: "+val));
        *//*
        Stream<UUID> uuidStream = Stream.generate(UUID::randomUUID).limit(100);
        System.out.println(uuidStream.collect(Collectors.toList()));*/
      /*  try {
            URL url = new URL("https://www.javatpoint.com/");
            URLConnection connection = url.openConnection();
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(connection.getInputStream())
            );
            reader.lines().limit(10).forEach(val-> System.out.println(val));
        }catch (IOException e){
            System.out.println(e.getMessage());
        }*/
       /* Stream<Person> personStream = Stream.of(new Person(10,"Rana",Gender.MALE),
        new Person(14,"Sofiq",Gender.MALE),
        new Person(21,"Karim",Gender.MALE),
                new Person(23,"Rahima",Gender.FEMALE)
        );
        Stream<String> personOlderthan15 = personStream.filter(person->person.getAge()>15)
                .map(person -> person.getName());
        personOlderthan15.forEach(v-> System.out.println(v));*/
        List<Developer> team = new ArrayList<>();
        Developer me = new Developer("Raihan");
        me.add("Java");
        me.add("JavaScript");
        Developer you = new Developer("Afsana");
        you.add("JavaScript");
        you.add("NodeJS");
        you.add("ReactJS");

        team.add(me);
        team.add(you);

        Stream<Set<String>> setStream=team.stream().map(developer -> developer.getLanguage());
        Stream<String> stream = setStream.flatMap(language->language.stream());
        List<String> s = stream.distinct().collect(Collectors.toList());
        s.forEach(i-> System.out.println(i));

        Stream<Developer> dev = team.stream().map(developer -> developer);
        List<Developer> ldev = dev.collect(Collectors.toList());
        ldev.forEach(i-> System.out.println(i.toString()));

    }
}

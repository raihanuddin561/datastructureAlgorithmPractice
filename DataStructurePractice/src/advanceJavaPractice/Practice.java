
package advanceJavaPractice;

import advanceJavaPractice.genericsPractice.Holder;
import advanceJavaPractice.genericsPractice.WildCardPractice;
import advanceJavaPractice.streamPractice.*;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice {
    public static void main(String[] args) {
       /* List<Integer> list = List.of(1,2,3,4);
        int sum =0;
        list.forEach(value->sum+=value);*/
       // String msg = "";
       // Consumer<String> consumer = (String msg)-> System.out.println(msg);
      /*  Holder<String> stringHolder = new Holder<>();
        stringHolder.setObject("Love java");
        Holder<Integer> integerHolder = new Holder<>();
        integerHolder.setObject(2000000);
        int a =integerHolder.getObject();
        String msg = stringHolder.getObject();
        System.out.println("int : "+a);
        System.out.println("String  : "+msg);*/
       /* List<Integer> n = List.of(1,2,3,4);
        List<Double> d = List.of(3.4,5.5,6.8);
        List<Number> n2 = List.of(1,2,3,4);
        List<String> s = List.of("I","Love","Java");
        WildCardPractice.process(n);
        WildCardPractice.process(d);
        WildCardPractice.process(n2);
        WildCardPractice.process(s);
        System.out.println(WildCardPractice.sum(n));
        System.out.println(WildCardPractice.sum(d));*/
      /*  List<Book> books = new ArrayList<>();
        books.add(new Book("English","J Barrel",650));
        books.add(new Book("English","J cari",750));
        books.add(new Book("English","Jack",850));
        books.add(new Book("English","pari Barrel",1000));
        books.add(new Book("Bangla","Johir Raihan",650));
        String book = BookProcess.findingsBook(books);
        System.out.println(book);*/

        //BookProcess.process();
      /*  PersonProcess pp = new PersonProcess();
        List<Person> lists = List.of(
                new Person(65,"Jahanara Imam","jahanaraimam@gmail.com"),
                new Person(36,"Jahir Raihan","jahirraihan@gmail.com")

                );

        pp.process();*/
        //MethodRefDemo m = new MethodRefDemo();
      /*  String hello = "Hello$world";
        StringUtils stringUtils = new StringUtils();
        MethodRefDemo.check(hello,s->stringUtils.isNotEmpty(s));
        MethodRefDemo.check(hello,s->stringUtils.isEmpty(s));
        MethodRefDemo.check(hello,s->stringUtils.hasNotSpecialCharacter(s));


        String hello2 = "HelloWorld";
        MethodRefDemo.check(hello2,stringUtils::hasNotSpecialCharacter);
        MethodRefDemo.check(hello2,stringUtils::isEmpty);
        MethodRefDemo.check(hello2,stringUtils::isNotEmpty);*/

       /* List<Developer2> team = new ArrayList<>();
        Developer2 dev2 = new Developer2(26,"Raihan");
        dev2.add("Java");
        dev2.add("Groovy");
        dev2.add("Javascript");

        Developer2 dev3 = new Developer2(27,"Rahim");
        dev3.add("PHP");
        dev3.add("word press");

        team.add(dev2);
        team.add(dev3);

       *//* Stream<List<String>> devstream = team.stream().map(developer2 -> developer2.getLanguages());
        devstream.collect(Collectors.toList()).forEach(dev-> System.out.println(dev));
       *//*
        List<String> setStream = team.stream().map(developer2 -> developer2.getLanguages()).flatMap(language -> language.stream()).collect(Collectors.toList());
        setStream.forEach(l-> System.out.println(l));*/

        List<Person> personList = List.of(new Person(15,"Sayeem",Gender.MALE),
                new Person(12,"Tamanna",Gender.FEMALE),
                new Person(23,"Eram",Gender.MALE),
                new Person(20,"Rifat",Gender.MALE),
                new Person(8,"Saif",Gender.MALE),
                new Person(8,"Omio",Gender.FEMALE));

        List<Person> personStream = personList.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());
        personStream.forEach(person -> System.out.println(person));
    }
}

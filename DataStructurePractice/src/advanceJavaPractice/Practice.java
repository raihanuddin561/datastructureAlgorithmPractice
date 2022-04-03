
package advanceJavaPractice;

import advanceJavaPractice.genericsPractice.Holder;
import advanceJavaPractice.genericsPractice.WildCardPractice;
import advanceJavaPractice.streamPractice.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

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
        PersonProcess pp = new PersonProcess();
        List<Person> lists = List.of(
                new Person(65,"Jahanara Imam","jahanaraimam@gmail.com"),
                new Person(36,"Jahir Raihan","jahirraihan@gmail.com")

                );

        pp.process();
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

    }
}

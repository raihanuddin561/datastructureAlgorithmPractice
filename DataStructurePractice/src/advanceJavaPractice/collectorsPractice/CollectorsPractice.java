package advanceJavaPractice.collectorsPractice;

import java.util.*;

import static java.util.stream.Collectors.*;

public class CollectorsPractice {
    public static void main(String[] args) {
        List<Book> bookList = createBooks();
        /*Long totalBooks  = bookList.stream().count();
        //Long totalBooks  = bookList.stream().collect(Collectors.counting());
        System.out.println("Total books: "+totalBooks);*/
        Long refBook = bookList.stream().filter(book->book.getBookGenres()==BookGenres.REFERENCE_BOOK)
                .collect(counting());
        System.out.println("Reference Boook: "+refBook);
        Long totalPrice = bookList.stream().filter(book -> book.getBookGenres()==BookGenres.REFERENCE_BOOK)
                .collect(summingLong(Book::getPrice));
        System.out.println("Total price: "+totalPrice);

        IntSummaryStatistics statistics = bookList.stream().collect(summarizingInt(Book::getPrice));
        System.out.println(statistics);

        Optional<Book> book = bookList.stream().collect(maxBy(Comparator.comparing(Book::getPrice)));
        System.out.println(book.get());

        String bookNames = bookList.stream().map(Book::getName).collect(joining(","));
        System.out.println(bookNames);

        Map<BookGenres,List<Book>> bookGenresListMap = bookList.stream().collect(groupingBy(Book::getBookGenres));
        System.out.println(bookGenresListMap);

        Map<Rating, List<Book>> bookByRating = bookList.stream().collect(groupingBy(books->getRating(books)));
        bookByRating.forEach((k,val)->{
            System.out.println(k+":"+val);
        });

        Map<BookGenres, Map<Rating,List<Book>>> groupingRateAndGenere = bookList.stream()
                .collect(groupingBy(Book::getBookGenres,groupingBy(b->getRating(b))));

        System.out.println(groupingRateAndGenere);

        Map<Rating, Long> bookGenresLongMap = bookList.stream().collect(groupingBy(book1 -> getRating(book1),counting()));
        System.out.println(bookGenresLongMap.get(Rating.HIGH));

        Map<Author,Optional<Book>> maxPricedBook = bookList.stream().collect(groupingBy(Book::getAuthor,maxBy(Comparator.comparing(Book::getPrice))));
        System.out.println(maxPricedBook);
     }

     private static Rating getRating(Book book){
        if(book.getRating()<=2){
            return Rating.LOW;
        }else if(book.getRating()>2 && book.getRating()<=4){
            return Rating.MEDIUM;
        }else return Rating.HIGH;
     }
    private static List<Book> createBooks(){
        Author hAhmed = new Author("Humayun","Ahmed");
        Author zIqbal = new Author("Zafor","Iqbal");

        return List.of(
          new Book("Nondito Noroke",90,hAhmed,true,BookGenres.REALISTIC_FICTION),
          new Book("Deyal",323,hAhmed,true,BookGenres.HISTORICAL_FICTION),
          new Book("Hijibiji",213,hAhmed,true,BookGenres.HUMOR),
          new Book("Elebele",90,hAhmed,true,BookGenres.HUMOR),
          new Book("Misir Ali Unsolved",114,hAhmed,true,BookGenres.MYSTERY),
          new Book("Nat Baltu",132,zIqbal,true,BookGenres.YOUNG_ADULT_FICTION),
          new Book("Ami topu",132,zIqbal,true,BookGenres.HISTORICAL_FICTION),
          new Book("Amar Bondhu Rashed",141,zIqbal,true,BookGenres.HISTORICAL_FICTION),
          new Book("Theory of Relativity",154,zIqbal,false,BookGenres.REFERENCE_BOOK),
          new Book("Quantam Mechanics",141,zIqbal,false,BookGenres.REFERENCE_BOOK)

        );

    }
}

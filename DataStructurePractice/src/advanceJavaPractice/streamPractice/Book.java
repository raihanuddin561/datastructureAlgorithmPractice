package advanceJavaPractice.streamPractice;

public class Book {
    private String language;
    private String author;
    private double price;

    public Book() {
    }

    public Book(String language, String author, double price) {
        this.language = language;
        this.author = author;
        this.price = price;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "language='" + language + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Dan", "Abnett", 7);
        Book book = new Book("Horus Rising", 2006, 480, author);

        System.out.println(book.isBig());
        System.out.println(book.matches("Horus"));
        System.out.println(book.matches("Dan"));
        System.out.println(book.matches("Abnett"));
        System.out.println(book.estimatePrice());
    }
}
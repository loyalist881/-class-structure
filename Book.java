public class Book {
    public String title;
    public int releaseYear;
    public int pages;
    public Author author;

    public Book(String title, int releaseYear, int pages, Author author) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.pages = pages;
        this.author = author;
    }

    public boolean isBig() {
        return pages > 500;
    }

    public boolean matches(String word) {
        return title.contains(word) || author.name.contains(word) || author.surname.contains(word);
    }

    public int estimatePrice() {
        double basePrice = pages * 3 * Math.sqrt(author.rating);
        int price = (int) Math.floor(basePrice);
        return price < 250 ? 250 : price;
    }
}

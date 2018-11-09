package bookshelf;

public class TextBook {

    private String title;
    private String author;
    private int version;
    private double price;
    private static int bookCount = 0;

    public TextBook(String title, String author, int version, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.version = version;
        bookCount++;

    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getVersion() {
        return version;
    }

    public double getPrice() {
        return price;
    }

    public static int getBookCount() {
        return bookCount;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean equals(TextBook b) {
        return b.getAuthor() == this.getAuthor()
                && b.getTitle() == this.getTitle()
                && b.getVersion() == this.getVersion();
    }

    public String toString() {
        String b = "TextBook: " + getTitle() + getVersion() + " by " + getAuthor() + " selling for " + getPrice();
        return b;
    }
}

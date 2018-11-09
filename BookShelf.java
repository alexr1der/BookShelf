package bookshelf;

import java.util.ArrayList;

/**
 *
 * @author alexhord_workdesk
 */
public class BookShelf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int minIndex =0;
        double total0 = 0.0;
        double total1 = 0.0;
        double total;

        TextBook[] bookshelf1 = new TextBook[3];
        bookshelf1[0] = new TextBook("Java", "Gaddis", 6, 89.99);
        bookshelf1[1] = new TextBook("C++", "Gaddis", 2, 80.00);
        bookshelf1[2] = new TextBook("C#", "Gaddis", 3, 90.99);

        ArrayList<TextBook> bookshelf2 = new ArrayList<>();
        bookshelf2.add(new TextBook("Head First Java", "Sierra", 2, 36.82));
        bookshelf2.add(new TextBook("Core Java Vol 1", "Horstmann", 10, 41.39));

        System.out.println("The number on both shelves is: " + (TextBook.getBookCount()) + ";");

        System.out.println("The number of books on shelf 1 is: " + bookshelf1.length + "; ");
        for (int i = 0; i < bookshelf1.length; i++) {

            System.out.println("Information on books shelf 1 is " + bookshelf1[i].toString());

        }

        System.out.println("The number of books on shelf 2 is: " + bookshelf2.size() + "; ");
        for (int i = 0; i < bookshelf2.size(); i++) {

            System.out.println("Information on books shelf 2 is " + bookshelf2.get(i).toString());
        }

        System.out.println("The First book on bookshelf is " + bookshelf1[0].toString());
        for (int i = 0; i < bookshelf1.length; i++) {
            if (bookshelf1[minIndex].getPrice() > bookshelf1[i].getPrice()) {
                minIndex = i;
            }
            
            
        }

        System.out.println("The least expensive book on shelf 1 is " + bookshelf1[minIndex]);

        for (int j = 0; j < bookshelf2.size(); j++) {
            total0 = +(bookshelf2.get(j).getPrice());
        }
        for (int i = 0; i < bookshelf1.length; i++) {
            total1 = +bookshelf1[i].getPrice();
        }
        total = total0 + total1;
        System.out.println("Prices for all books from shelf 1 and 2  " + total1);
        System.out.println(bookshelf1[0].getAuthor() + " " + bookshelf1[0].getVersion() + " " + bookshelf1[0].getTitle());

        TextBook b = new TextBook("C++", "Gaddis", 2, 80.00);

        if (bookshelf1[0].equals(b)) {
            System.out.println("Book is here");
        } else {
            System.out.println("It is not first book I am sorry");
        }
        if (bookshelf1[1].equals(b)) {
            System.out.println("This book is second");
        }
        
       // System.out.println("Book Count is " + (bookshelf1[0].getBookCount(bookshelf1) +  bookshelf2.size()));
        
    }
}

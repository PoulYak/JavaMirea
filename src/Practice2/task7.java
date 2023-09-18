package Practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

//todo доделать
class BookTest{
    public static void main(String[] args) {
        Book book = new Book("Pushkin", "Капитанская дочка", 1699);
        Book book2 = new Book("Гоголь", "Вий", 1629);
        Book book3 = new Book("Гоголь", "Тарас Бульба", 1669);
        ArrayList<Book> arr = new ArrayList<>();
        arr.add(book);
        arr.add(book2);
        arr.add(book3);
        BookShelf bs = new BookShelf(arr);
        System.out.println(bs.getOldest());
        System.out.println(bs.getEarliest());
    }
}

class Book{
    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                '}';
    }

    private String author, title;
    private int year;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}


class BookShelf{
    ArrayList<Book> shelf;

    public BookShelf(ArrayList<Book> shelf) {
        this.shelf = shelf;
    }

    public Book getOldest(){

        Book result = new Book("-", "3", 0);
        for (Book book: shelf){
            if (result.getYear()<book.getYear()){
               result = book;
            }
        }
        return result;
    }

    public Book getEarliest(){

        Book result = new Book("-", "3", 200000000);
        for (Book book: shelf){
            if (result.getYear()>book.getYear()){
                result = book;
            }
        }
        return result;
    }

    public void sort(){
        this.shelf.sort((o1, o2) -> {
            if (o1.getYear()> o2.getYear())
                return 1;
            else if (o2.getYear()> o1.getYear())
                return -1;
            else
                return 0;
        });
    }



}
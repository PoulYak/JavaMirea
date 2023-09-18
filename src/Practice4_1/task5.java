package Practice4_1;

import java.util.ArrayList;

class Reader{

    public Reader(String fullName, long ticketNumber, String faculty, String birthday, String phoneNumber) {
        this.fullName = fullName;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.birthday = birthday;
        this.phoneNumber = phoneNumber;
    }

    protected String fullName;
    protected long ticketNumber;
    protected String faculty;
    protected String birthday;
    protected String phoneNumber;
    public void takeBook(){

    };
    public void returnBook(){

    };

    public void takeBook(int n){
        System.out.printf("%1$s взял книг: %2$d\n",fullName, n);

    };

    public void takeBook(String[] titles){
        System.out.printf("%1$s взял книги: %2$s\n",fullName, String.join(", ", titles));
    }

    public void takeBook(Book2[] books){
        ArrayList<String> titles = new ArrayList<>();
        for (Book2 book2: books){
            titles.add(book2.getTitle());
        }
        System.out.printf("%1$s взял книги: %2$s\n",fullName, String.join(", ", titles));
    }

    public void returnBook(int n){
        System.out.printf("%1$s вернул книг: %2$d\n",fullName, n);

    };

    public void returnBook(String[] titles){
        System.out.printf("%1$s вернул книги: %2$s\n",fullName, String.join(", ", titles));
    }

    public void returnBook(Book2[] books){
        ArrayList<String> titles = new ArrayList<>();
        for (Book2 book2: books){
            titles.add(book2.getTitle());
        }
        System.out.printf("%1$s вернул книги: %2$s\n",fullName, String.join(", ", titles));
    }


}

class Book2{
    private String title;
    private String author;

    public Book2(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

class Tester{
    public static void main(String[] args) {
        Reader r1 = new Reader("Петров Е.Н.", 23231, "Химический", "23.04.2000", "+7(999)234-45-56");
        r1.takeBook(2);
        String[] mass = {"Энциклопедия", "Приключения"};
        r1.returnBook(mass);
        Book2[] books = {new Book2("Капитанская Дочка", "Пушкин А.С."),
        new Book2("Тарас Бульба", "Гоголь Н.В.")};
        r1.returnBook(books);

    }
}
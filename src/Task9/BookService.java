package Task9;

public class BookService {
    Book[] books;

    public void setBook(Book[] books) {
        this.books = books;
    }

    //список книг заданного автора;
    public int numberOfBooksByAGivenAuthor(Book[] books, String str) {
        int t = 0;
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].getAuthor().equals(str)) {
                t++;
            }
        }
        return t;
    }

    public Book[] getListOfBooksByAuthor(String str) {              // входит строка с автором для проверки!

        Book[] books1 = new Book[numberOfBooksByAGivenAuthor(this.books, str)];
        int a = 0;
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].getAuthor().equals(str)) {
                books1[a] = this.books[i];
                a++;
            }
        }
        return books1;
    }

    //список книг, выпущенных заданным издательством;

    public int numberOfBooksPublishedByAGivenPublisher(Book[] books, String str) {
        int t = 0;
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].getPublishingHouse().equals(str)) {
                t++;
            }
        }
        return t;
    }

    public Book[] getListOfBooksByPublishing(String str) {
        Book[] books1 = new Book[numberOfBooksPublishedByAGivenPublisher(this.books, str)];
        int a = 0;
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].getPublishingHouse().equals(str)) {
                books1[a] = this.books[i];
                a++;
            }
        }
        return books1;
    }

    //c) список книг, выпущенных после заданного года.
    public int numberOfBooks(Book[] books, int year) {
        int t = 0;
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].getTheYearOfPublishing() > year) {
                t++;
            }
        }
        return t;
    }

    public Book[] getListOfBooksAfterYear(int year) {

        Book[] books1 = new Book[numberOfBooks(this.books, year)];
        int a = 0;
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].getTheYearOfPublishing() > year) {
                books1[a] = this.books[i];
                a++;
            }
        }
        return books1;
    }

    //метод который возвращает издателсства
    public String[] getpublishingHouse() {
        String[] array = new String[this.books.length];
        int a = 0;
        for (int i = 0; i < this.books.length; i++) {
            array[a] = this.books[i].getPublishingHouse();
            a++;
        }
        return array;
    }

    //метод который возвращает авторов
    public String[] getAuthor() {
        String[] array = new String[this.books.length];
        int a = 0;
        for (int i = 0; i < this.books.length; i++) {
            array[a] = this.books[i].getAuthor();
            a++;
        }
        return array;
    }
}

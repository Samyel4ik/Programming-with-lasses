package Task9;

import java.util.Arrays;
import java.util.Scanner;

public class Class9 {
    //Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод  toString().
    // Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
    // Задать критерии выбора данных и вывести эти данные на консоль.
    //Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
    //a) список книг заданного автора;
    //b) список книг, выпущенных заданным издательством;
    //c) список книг, выпущенных после заданного года.
    //
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Book[] books = new Book[]{
                new Book(10, "Мастер и маргарита", 1966, 1000, 250, "solid", "Булгаков", "Дом1"),
                new Book(11, "Манах", 1796, 1000, 250, "solid", "Петров", "Дом2"),
                new Book(12, "Буратино", 1936, 1000, 250, "solid", "Сидоров", "Дом3"),
                new Book(13, "Собачье сердце", 1925, 1000, 250, "solid", "Булгаков", "Дом1")
        };
        BookService bookService = new BookService();
        bookService.setBookService(books);

        System.out.println("Выберите пункт меню:" + "\n" +
                "1.список книг заданного автора." + "\n" +
                "2.список книг, выпущенных заданным издательством." + "\n" +
                "3.список книг, выпущенных после заданного года.");
        System.out.print("Ваш выбор - ");
        int t = scanner.nextInt();

        if (t == 1) {
            System.out.println("список авторов: Булгаков,Петров,Сидоров.");
            System.out.println("Книги какого автора вы бы хотели видеть?");
            String str = scanner.nextLine();                                     // чет не пашет сканер с вводом фамилии.

            Book[] books1 = bookService.getListOfBooksByAuthor("Булгаков");
            System.out.println(Arrays.toString(books1));
        }
        if (t == 2) {
            Book[] books1 = bookService.getListOfBooksByPublishing("Дом1");
            System.out.println(Arrays.toString(books1));
        }
        if (t == 3) {
            System.out.print("Введите год издания - ");
            int r = scanner.nextInt();
            Book[] books1 = bookService.getListOfBooksAfterYear(r);
            System.out.println(Arrays.toString(books1));
        }

    }
}

class Book {
    int id, theYearOfPublishing, numberOfPages, price;
    String bindingType, name, author, publishingHouse;

    public Book(int id, String name, int theYearOfPublishing, int numberOfPages, int price, String bindingType, String author, String publishingHouse) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.bindingType = bindingType;
        this.numberOfPages = numberOfPages;
        this.publishingHouse = publishingHouse;
        this.theYearOfPublishing = theYearOfPublishing;
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTheYearOfPublishing() {
        return theYearOfPublishing;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getPrice() {
        return price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setTheYearOfPublishing(int theYearOfPublishing) {
        this.theYearOfPublishing = theYearOfPublishing;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name=" + name +
                ",  author=" + author +
                ", bindingType=" + bindingType +
                ", numberOfPages=" + numberOfPages +
                ", publishingHouse=" + publishingHouse +
                ", theYearOfPublishing=" + theYearOfPublishing +
                ", price=" + price +
                '}';
    }
}

class BookService {
    Book[] books;

    public void setBookService(Book[] books) {
        this.books = books;
    }

    //список книг заданного автора;
    public Book[] getListOfBooksByAuthor(String str) {              // входит строка с автором для проверки!
        int t = 0;
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].getAuthor() == str) {
                t++;
            }
        }
        Book[] books1 = new Book[t];
        int a = 0;
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].getAuthor() == str) {
                books1[a] = this.books[i];
                a++;
            }
        }
        return books1;
    }

    //список книг, выпущенных заданным издательством;
    public Book[] getListOfBooksByPublishing(String str) {
        int t = 0;
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].getPublishingHouse() == str) {
                t++;
            }
        }
        Book[] books1 = new Book[t];
        int a = 0;
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].getPublishingHouse() == str) {
                books1[a] = this.books[i];
                a++;
            }
        }
        return books1;
    }

    //c) список книг, выпущенных после заданного года.
    public Book[] getListOfBooksAfterYear(int year) {
        int t = 0;
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].getTheYearOfPublishing() > year) {
                t++;
            }
        }
        Book[] books1 = new Book[t];
        int a = 0;
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].getTheYearOfPublishing() > year) {
                books1[a] = this.books[i];
                a++;
            }
        }
        return books1;
    }
}

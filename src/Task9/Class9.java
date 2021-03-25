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


        BookService bookService = new BookService();
        bookService.setBook(arrayBooks());
        System.out.println("Начнем работу? да или нет ?");
        String str = scanner.nextLine();

        while (str.equals("да")) {
            finish(scanner, bookService);
        }
    }

    public static Book[] arrayBooks() {
        return new Book[]{
                new Book(10, "Мастер и маргарита", 1966, 1000, 250, "solid", "Булгаков", "Дом1"),
                new Book(11, "Манах", 1796, 1000, 250, "solid", "Петров", "Дом2"),
                new Book(12, "Буратино", 1936, 1000, 250, "solid", "Сидоров", "Дом3"),
                new Book(13, "Собачье сердце", 1925, 1000, 250, "solid", "Булгаков", "Дом1")
        };
    }


    public static void finish(Scanner scanner, BookService bookService) {
        System.out.println("Выберите пункт меню:" + "\n" +
                "1.список книг заданного автора." + "\n" +
                "2.список книг, выпущенных заданным издательством." + "\n" +
                "3.список книг, выпущенных после заданного года." + "\n" +
                "4.Добавить книгу.");
        System.out.print("Ваш выбор - ");
        int t = Integer.parseInt(scanner.nextLine());

        if (t == 1) {
            System.out.println("список авторов:");
            listAuthor(bookService);
            System.out.print("Книги какого автора вы бы хотели видеть? - ");
            String str = scanner.nextLine();

            arrayPrint(listOfBooksByAuthor(bookService, str));
        }
        if (t == 2) {
            System.out.println("Книги какого издательства вы бы хотели видеть - ");
            listPublishingHouse(bookService);
            System.out.print("Ваш выбор - ");

            String str = scanner.nextLine();
            arrayPrint(listOfBooksByPublishing(bookService, str));
        }
        if (t == 3) {
            System.out.print("Введите год после которого были изданы книги - ");
            int r = scanner.nextInt();

            arrayPrint(listOfBooksAfterYear(bookService, r));
        }
        if (t == 4) {
            System.out.print("Введите id книги: ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.print("Введите имя книги: ");
            String name = scanner.nextLine();
            System.out.print("Введите год издания книги: ");
            int theYearOfPublishing = Integer.parseInt(scanner.nextLine());
            System.out.print("Введите количество страниц книги: ");
            int numberOfPages = Integer.parseInt(scanner.nextLine());
            System.out.print("Введите стоимость книги: ");
            int price = Integer.parseInt(scanner.nextLine());
            System.out.print("Введите тип переплета книги: ");
            String bindingType = scanner.nextLine();
            System.out.print("Введите автора книги: ");
            String author = scanner.nextLine();
            System.out.print("Введите издательство книги: ");
            String publishingHouse = scanner.nextLine();

            Book[] books = bookService.addBook(id, name, theYearOfPublishing, numberOfPages, price, bindingType, author, publishingHouse);
            BookService bookService1 = new BookService();
            bookService1.setBook(books);
            System.out.println(bookService1);
        }
    }

    public static void listAuthor(BookService bookService) {
        String[] array = bookService.getAuthor();
        System.out.println(Arrays.toString(array));

    }

    public static void listPublishingHouse(BookService bookService) {
        String[] array = bookService.getpublishingHouse();
        System.out.println(Arrays.toString(array));

    }

    public static void arrayPrint(Book[] books) {
        System.out.println(Arrays.toString(books));
    }

    public static Book[] listOfBooksByAuthor(BookService bookService, String str) {
        return bookService.getListOfBooksByAuthor(str);
    }

    public static Book[] listOfBooksByPublishing(BookService bookService, String str) {
        return bookService.getListOfBooksByPublishing(str);
    }

    public static Book[] listOfBooksAfterYear(BookService bookService, int r) {
        return bookService.getListOfBooksAfterYear(r);
    }
}



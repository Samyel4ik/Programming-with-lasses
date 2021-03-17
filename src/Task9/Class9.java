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
        bookService.setBook(books);

        System.out.println("Выберите пункт меню:" + "\n" +
                "1.список книг заданного автора." + "\n" +
                "2.список книг, выпущенных заданным издательством." + "\n" +
                "3.список книг, выпущенных после заданного года.");
        System.out.print("Ваш выбор - ");
        int t = Integer.parseInt(scanner.nextLine());

        if (t == 1) {
            System.out.println("список авторов:" + Arrays.toString(bookService.getAuthor()));
            System.out.print("Книги какого автора вы бы хотели видеть? - ");
            String str = scanner.nextLine();

            Book[] books1 = bookService.getListOfBooksByAuthor(str);
            System.out.println(Arrays.toString(books1));
        }
        if (t == 2) {
            System.out.println("Книги какого издательства вы бы хотели видеть - " + Arrays.toString(bookService.getpublishingHouse()));
            System.out.print("Ваш выбор - ");

            String str = scanner.nextLine();
            Book[] books1 = bookService.getListOfBooksByPublishing(str);
            System.out.println(Arrays.toString(books1));
        }
        if (t == 3) {
            System.out.print("Введите год после которого были изданы книги - ");
            int r = scanner.nextInt();
            Book[] books1 = bookService.getListOfBooksAfterYear(r);
            System.out.println(Arrays.toString(books1));
        }
    }
}



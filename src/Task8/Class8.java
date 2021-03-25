package Task8;

import java.util.Arrays;
import java.util.Scanner;

public class Class8 {
    //Создать класс Customer, спецификация которого приведена ниже.
    // Определить конструкторы, set- и get- методы и метод toString().
    // Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
    // Задать критерии выбора данных и вывести эти данные на консоль.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Customers customersObject = new Customers();    //обьект класса "  сс парамертрами масссива " .изначально пустой
        customersObject.setCustomers(arrayCustomers());       // массив обьекта класса == наполненному масссиву с помощью сеттера
        System.out.println("Начнем работу? да или нет ?");

        String str = scanner.nextLine();
        while (str.equals("да")) {
            finish(scanner, customersObject);
        }
    }

    public static void finish(Scanner scanner, Customers customersObject) {
        System.out.println("\"Выберете пункт меню:" + "\n" +
                "1. сортировка фамилии покупателей." + "\n" +
                "2. список покупателей, у которых номер кредитной карточки находится в заданном интервале." + "\n" +
                "3.добавить покупателя.");
        System.out.print("Ваш выбор - ");
        int t = Integer.parseInt(scanner.nextLine());

        if (t == 1) {
            arrayPrint(customersSortedAlphabetically(customersObject));
        }
        if (t == 2) {
            customersWithCreditCardIn(scanner, customersObject);

        }
        if (t == 3) {
            System.out.print("Введите id покупателя: ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.print("Введите surname покупателя: ");
            String surname = scanner.nextLine();
            System.out.print("Введите name покупателя: ");
            String name = scanner.nextLine();
            System.out.print("Введите patronymic покупателя: ");
            String patronymic = scanner.nextLine();
            System.out.print("Введите creditCardNumber покупателя: ");
            int creditCardNumber = Integer.parseInt(scanner.nextLine());
            System.out.print("Введите bankAccountNumber покупателя: ");
            int bankAccountNumber = Integer.parseInt(scanner.nextLine());

            Customers customers = newCustomers(customersObject, id, surname, name, patronymic, creditCardNumber, bankAccountNumber);
            System.out.println(customers);
        }
    }

    public static Customers newCustomers(Customers customers, int id, String surname, String name, String patronymic, int creditCardNumber, int bankAccountNumber) {

        Customers customers1 = new Customers();
        customers1.setCustomers(customers.newCustomers(id, surname, name, patronymic, creditCardNumber, bankAccountNumber));
        return customers1;
    }

    public static void customersWithCreditCardIn(Scanner scanner, Customers customersObject) {
        System.out.print("Введите начало диопазона - ");
        int x = scanner.nextInt();
        System.out.print("Введите конец диопазона - ");
        int y = scanner.nextInt();

        arrayPrint(customersWithCreditCardIn(customersObject, x, y));
    }

    public static Customer[] arrayCustomers() {

        return new Customer[]{
                new Customer(1, "Petrov", "Ivan", "Ivanovich", 123, 3451),
                new Customer(2, "Sidorov", "Dmitrii", "Sergeevich", 501, 5698),
                new Customer(3, "Pushkin", "Alexei", "Victorovich", 299, 3000)
        };
    }

    public static void arrayPrint(Customer[] customers) {
        System.out.println(Arrays.toString(customers));
    }

    public static Customer[] customersWithCreditCardIn(Customers customers, int x, int y) {
        return customers.getCustomersWithCreditCardIn(x, y);
    }

    public static Customer[] customersSortedAlphabetically(Customers customers) {
        return customers.getCustomersSortedAlphabetically();
    }
}










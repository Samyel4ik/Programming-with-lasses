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

        Customer customer1 = new Customer(1, "Petrov", "Ivan", "Ivanovich", 123, 3451);

        Customer[] customers1 = new Customer[]{
                customer1,
                new Customer(2, "Sidorov", "Dmitrii", "Sergeevich", 501, 5698),
                new Customer(3, "Pushkin", "Alexei", "Victorovich", 299, 3000)
        };
        Customers customersObject = new Customers();    //обьект класса "  сс парамертрами масссива " .изначально пустой
        customersObject.setCustomers(customers1);       // массив обьекта класса == наполненному масссиву
        System.out.println("\"Выберете пункт меню:" + "\n" +
                "1. сортировка фамилии покупателей." + "\n" +
                "2. список покупателей, у которых номер кредитной карточки находится в заданном интервале.");
        System.out.print("Ваш выбор - ");
        int t = scanner.nextInt();

        if (t == 2) {
            System.out.print("Введите начало диопазона - ");
            int x = scanner.nextInt();
            System.out.print("Введите конец диопазона - ");
            int y = scanner.nextInt();

            Customer[] customersWithCreditCardIn = customersObject.getCustomersWithCreditCardIn(x, y);    //
            System.out.println(Arrays.toString(customersWithCreditCardIn));
        }
        if (t == 1) {
            Customer[] sortedCustomers = customersObject.getCustomersSortedAlphabetically();
            System.out.println(Arrays.toString(sortedCustomers));
        }

    }
}










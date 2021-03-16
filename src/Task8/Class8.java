package Task8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Class8 {
    //Создать класс Customer, спецификация которого приведена ниже.
    // Определить конструкторы, set- и get- методы и метод toString().
    // Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
    // Задать критерии выбора данных и вывести эти данные на консоль.
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        Customer customer1 = new Customer(1, "Petrov", "Ivan", "Ivanovich", 123, 3451);

        Customer[] customers1 = new Customer[]{
                customer1,
                new Customer(2, "Sidorov", "Dmitrii", "Sergeevich", 501, 5698),
                new Customer(3, "Pushkin", "Alexei", "Victorovich", 299, 3000)
        };
        Customers customersObject = new Customers();    //обьект класса "  сс парамертрами масссива " .изначально пустой
        customersObject.setCustomers(customers1);       // массив обьекта класса == наполненному масссиву
        System.out.println("\"Выберете пункт меню:" +"\n" +
                "1. сортировка фамилии покупателей." + "\n" +
                "2. список покупателей, у которых номер кредитной карточки находится в заданном интервале.");
        System.out.print("Ваш выбор - ");
        int t = scanner.nextInt();

        if (t==2) {
            System.out.println("Введите начало диопазона - ");
            int x = scanner.nextInt();
            System.out.println("Введите конец диопазона - ");
            int y = scanner.nextInt();

            Customer[] customersWithCreditCardIn = customersObject.getCustomersWithCreditCardIn(x, y);    //
            System.out.println(Arrays.toString(customersWithCreditCardIn));
        }
        if (t==1) {
            Customer[] sortedCustomers = customersObject.getCustomersSortedAlphabetically();
            System.out.println(Arrays.toString(sortedCustomers));
        }

    }
}

class Customer {
    int id, creditCardNumber, bankAccountNumber;
     String surname, name, patronymic;


    public Customer(int id, String surname, String name, String patronymic, int creditCardNumber, int bankAccountNumber) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.creditCardNumber = creditCardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", creditCardNumber=" + creditCardNumber +
                ", bankAccountNumber=" + bankAccountNumber +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                '}';
    }

}

class CustomerNameComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        String str1 = o1.getSurname();
        String str2 = o2.getSurname();
        return str1.compareTo(str2);
    }
}

class Customers {
    Customer[] customers;

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    //список покупателей, у которых номер кредитной карточки находится в заданном интервале
    public Customer[] getCustomersWithCreditCardIn(int x, int y) {       //100 i 300
        int a = 0;
        for (int i = 0; i < this.customers.length; i++) {
            if (this.customers[i].getCreditCardNumber() > x && this.customers[i].getCreditCardNumber() < y) {
                a++;
            }
        }
        Customer[] customersWithCreditCardIn = new Customer[a];
        int t = 0;
        for (int i = 0; i < this.customers.length; i++) {
            if (this.customers[i].getCreditCardNumber() > x && this.customers[i].getCreditCardNumber() < y) {
                customersWithCreditCardIn[t] = this.customers[i];
                t++;
            }
        }
        return customersWithCreditCardIn;
    }

    //покупатели в алфавитном порядке
    public Customer[] getCustomersSortedAlphabetically() {
        Customer[] customers1 = Arrays.copyOf(this.customers, this.customers.length);
        Arrays.sort(customers1,new CustomerNameComparator());
        return customers1;
    }
    
}




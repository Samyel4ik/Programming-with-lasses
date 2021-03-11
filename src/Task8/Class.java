package Task8;

public class Class {
    //Создать класс Customer, спецификация которого приведена ниже.
    // Определить конструкторы, set- и get- методы и метод toString().
    // Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
    // Задать критерии выбора данных и вывести эти данные на консоль.
    public static void main(String[] args) {



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

}

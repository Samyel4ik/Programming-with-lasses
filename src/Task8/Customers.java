package Task8;

import java.util.Arrays;

public class Customers {
    Customer[] customers;

    public void setCustomers(Customer[] customers) {
        this.customers = customers;
    }

    //список покупателей, у которых номер кредитной карточки находится в заданном интервале
    //-количесвво таких покупателей

    public int numberOfBuyers(int x, int y) {
        int a = 0;
        for (int i = 0; i < this.customers.length; i++) {
            if (this.customers[i].getCreditCardNumber() > x && this.customers[i].getCreditCardNumber() < y) {
                a++;
            }
        }
        return a;
    }

    public Customer[] getCustomersWithCreditCardIn(int x, int y) {       //100 i 300

        Customer[] customersWithCreditCardIn = new Customer[numberOfBuyers(x, y)];
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
        Arrays.sort(customers1, new CustomerNameComparator());
        return customers1;
    }
}

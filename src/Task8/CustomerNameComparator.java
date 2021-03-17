package Task8;

import java.util.Comparator;

class CustomerNameComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        String str1 = o1.getSurname();
        String str2 = o2.getSurname();
        return str1.compareTo(str2);
    }
}

package Task1;
//Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных. 
// Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение из этих двух переменных.

public class Test1 {
    int x = 3;
    int y = 5;

    public static void printOut(int x, int y) {
        Test1 myObj1 = new Test1();
        Test1 myObj2 = new Test1();
        System.out.println(myObj1.x);
        System.out.println(myObj2.y);
    }

    public static void changeTheNumber(int x, int y) {
        Test1 myObj1 = new Test1();
        Test1 myObj2 = new Test1();
        myObj1.x = 30;
        myObj2.y = 50;
    }

    public static int sumOfNumbers(int x, int y) {
        return x + y;
    }

    public static int greatestNumber(int x, int y) {
        int max = 0;
        if (x > y) {
            max = x;
        } else {
            max = y;
        }
        return max;
    }

    public static void main(String[] args) {

    }
}

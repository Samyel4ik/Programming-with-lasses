package Task1;
//Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных. 
// Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение из этих двух переменных.


public class Test1 {
    public static void main(String[] args) {
        Numbers num = new Numbers();
        num.setX(15);
        num.setY(20);
        System.out.println(num.getX());
        System.out.println(num.getY());
        System.out.println("Заменили Х на - " + num.getReplacementX(5));
        System.out.println("Заменили Y на - " + num.getReplacementY(10));
        System.out.println("Сумма данных чисел: " + num.getSum());
        System.out.println("Наибольшее и двух чисел: " + num.getMaxNum());
    }
}

class Numbers {
    private int x, y;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int getReplacementX(int a) {
        return this.x = a;
    }

    public int getReplacementY(int b) {
        return this.y = b;
    }

    public int getSum() {
        return x + y;
    }

    public int getMaxNum() {
        int max = 0;
        if (x > y) {
            max = x;
        } else {
            max = y;
        }
        return max;
    }
}


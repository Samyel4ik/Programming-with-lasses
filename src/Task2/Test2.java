package Task2;
//M4-T2.Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами.
// Добавьте конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра класса.


public class Test2 {
    public static void main(String[] args) {
        Numbers num = new Numbers(5, 20);
        System.out.println("x = " + num.getX());
        System.out.println("y = " + num.getY());
        System.out.println("------------");

        num = new Numbers();

        System.out.println("x = " + num.getX());
        System.out.println("y = " + num.getY());
        System.out.println("------------");

        num.setX(111);
        num.setY(222);

        System.out.println("x = " + num.getX());
        System.out.println("y = " + num.getY());
        System.out.println("------------");

    }
}

class Numbers {
    private int x, y;

    public Numbers() {
        x = 1;
        y = 3;
    }

    public Numbers(int x, int y) {
        this.x = x;
        this.y = y;
    }

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
}



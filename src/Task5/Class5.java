package Task5;

public class Class5 {
    // Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение на единицу в заданном диапазоне.
    // Предусмотрите инициализацию счетчика значениями по умолчанию и произвольными значениями.
    // Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее получить его текущее состояние.
    // Написать код, демонстрирующий все возможности класса.

    public static void main(String[] args) {

        Counter counter = new Counter();
        //counter.setNum(4);
        while (counter.getState() < 10) {
            System.out.println(counter.getState());
            counter.increment();
        }
        while (counter.getState() > 0) {
            System.out.println(counter.getState());
            counter.decrement();
        }
    }
}

class Counter {
    int num;

    public Counter() {
        this.num = num;

    }

    public void setNum(int num) {
        this.num = num;
    }

    public void increment() {
        num++;
    }

    public void decrement() {
        num--;
    }

    int getState() {
        return num;
    }
}
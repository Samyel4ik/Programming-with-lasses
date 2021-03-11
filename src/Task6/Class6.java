package Task6;

public class Class6 {
    //.Составьте описание класса для представления времени.
    // Предусмотрте возможности установки времени и изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений.
    // В случае недопустимых значений полей поле устанавливается в значение 0.
    // Создать методы изменения времени на заданное количество часов, минут и секунд.
    public static void main(String[] args) {
        Time a = new Time(1, 20, 50);
        Time b = new Time();
        Time c = new Time(0, 20);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("--------");

        a.setHour(25);
        a.setMinute(15);
        a.setSecond(100);
        System.out.println(a);

    }
}

class Time {
    int hour, minute, second;

    public Time() {
        this(0, 0, 0);
    }

    public Time(int hour, int minute) {
        this(hour, minute, 0);
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            this.hour = 0;
        } else {
            this.hour = hour;
        }
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) {
            this.minute = 0;
        } else {
            this.minute = minute;
        }
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59) {
            this.second = 0;
        } else {
            this.second = second;
        }
    }

    public String toString() {
        return hour + "hh" + " " + minute + "mm" + " " + second + "ss";
    }
}

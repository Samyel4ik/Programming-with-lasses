package Task6;

public class Class6 {
    //.Составьте описание класса для представления времени.
    // Предусмотрте возможности установки времени и изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений.
    // В случае недопустимых значений полей поле устанавливается в значение 0.
    // Создать методы изменения времени на заданное количество часов, минут и секунд.
    public static void main(String[] args) {

    }

}
class  Time{
    int hour ,minute,second;

    public void setHour(int hour)
    {
        hour = hour;
    }

    public void setMinute(int minute)
    {
        minute = minute;
    }

    public void setSecond(int second)
    {
        second = second;
    }

    public void SetTime(int hour, int minute, int second)
    {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }


}

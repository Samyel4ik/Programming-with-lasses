package Task10;

import java.util.Arrays;
import java.util.Scanner;

public class Class10 {
    //Создать класс Airline, спецификация которого приведена ниже.
    // Определить конструкторы, set- и get- методы и метод  toString().
    // Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами.
    // Задать критерии выбора данных и вывести эти данные на консоль.

    public static void main(String[] args) {

        Airline[] airlines = new Airline[]{
                new Airline("Minsk", 123, "passenger", 9.10, "Monday"),
                new Airline("Brest", 124, "cargo", 12.30, "Wednesday"),
                new Airline("Moscow", 125, "passenger", 17.55, "Friday"),
                new Airline("Kiev", 126, "cargo", 22.10, "Sunday"),
                new Airline("Minsk", 111, "passenger", 15.00, "Sunday")
        };
        AirlineService airlineService = new AirlineService();
        airlineService.setAirlines(airlines);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите пункт меню:" + "\n" +
                "1.список рейсов для заданного пункта назначения." + "\n" +
                "2.список рейсов для заданного дня недели." + "\n" +
                "3.список рейсов для заданного дня недели, время вылета для которых больше заданного.");
        System.out.print("Ваш выбор - ");
        int t = Integer.parseInt(scanner.nextLine());

        if (t == 1) {
            System.out.println("Список рейсов по пункту назначения: " + Arrays.toString(airlineService.getDestinationList()));
            System.out.print("Ваш выбор - ");
            String str = scanner.nextLine();

            Airline[] airlines1 = airlineService.getListOfFlightsByDestination(str);
            System.out.println(Arrays.toString(airlines1));
        }
        if (t == 2) {
            System.out.println("Список рейсов по пунтку назначения: " + Arrays.toString(airlineService.getDaysOfTheWeekList()));
            System.out.print("Ваш выбор - ");
            String str = scanner.nextLine();

            Airline[] airlines1 = airlineService.flightListForTeDay(str);
            System.out.println(Arrays.toString(airlines1));
        }
        if (t == 3) {
            System.out.println("Список рейсов по пунтку назначения: " + Arrays.toString(airlineService.getDaysOfTheWeekList()));
            System.out.print("Ваш выбор - ");
            String str = scanner.nextLine();
            System.out.println("Введите время, вылет рейсов  которых пожзе - ");
            int ttt = scanner.nextInt();
            Airline[] airlines1 = airlineService.flightListForTeDay(str);

            AirlineService airlineService1 = new AirlineService();
            airlineService1.setAirlines(airlines1);

            Airline[] airlines2 = airlineService1.getListOfFlightsFlightsByTime(ttt);

            System.out.println(Arrays.toString(airlines2));

        }
    }


}

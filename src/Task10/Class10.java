package Task10;

import java.util.Arrays;
import java.util.Scanner;

public class Class10 {
    //Создать класс Airline, спецификация которого приведена ниже.
    // Определить конструкторы, set- и get- методы и метод  toString().
    // Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами.
    // Задать критерии выбора данных и вывести эти данные на консоль.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AirlineService airlineService = new AirlineService();
        airlineService.setAirlines(arrayAirlines());
        System.out.println("Начнем работу? да или нет ?");
        String str = scanner.nextLine();

        while (str.equals("да")) {
            finish(scanner, airlineService);
        }

    }

    public static Airline[] arrayAirlines() {
        return new Airline[]{
                new Airline("Minsk", 123, "passenger", 9.10, "Monday"),
                new Airline("Brest", 124, "cargo", 12.30, "Wednesday"),
                new Airline("Moscow", 125, "passenger", 17.55, "Friday"),
                new Airline("Kiev", 126, "cargo", 22.10, "Sunday"),
                new Airline("Minsk", 111, "passenger", 15.00, "Sunday")
        };
    }

    public static void finish(Scanner scanner, AirlineService airlineService) {
        System.out.println("Выберите пункт меню:" + "\n" +
                "1.список рейсов для заданного пункта назначения." + "\n" +
                "2.список рейсов для заданного дня недели." + "\n" +
                "3.список рейсов для заданного дня недели, время вылета для которых больше заданного." + "\n" +
                "4.Добавить Airline.");
        System.out.print("Ваш выбор - ");
        int t = Integer.parseInt(scanner.nextLine());

        if (t == 1) {

            System.out.println("Список рейсов по пункту назначения: ");
            destinationList(airlineService);
            System.out.print("Ваш выбор - ");
            String str = scanner.nextLine();
            arrayPrint(listOfFlightsByDestination(airlineService, str));
        }
        if (t == 2) {
            System.out.println("Список рейсов по пунтку назначения: ");
            destinationList(airlineService);
            System.out.print("Ваш выбор - ");
            String str = scanner.nextLine();

            arrayPrint(flightListForTeDay(airlineService, str));
        }
        if (t == 3) {
            System.out.println("Список рейсов по пунтку назначения: ");
            destinationList(airlineService);
            System.out.print("Ваш выбор - ");
            String str = scanner.nextLine();
            System.out.println("Введите время, вылет рейсов  которых пожзе - ");
            int ttt = scanner.nextInt();

            AirlineService airlineService1 = new AirlineService();

            airlineService1.setAirlines(flightListForTeDay(airlineService, str));

            arrayPrint(listOfFlightsFlightsByTime(airlineService1, ttt));
        }
        if (t == 4) {
            System.out.print("Введите номер рейса: ");
            int flightNumber = Integer.parseInt(scanner.nextLine());
            System.out.print("Введите пункт назначения: ");
            String destination = scanner.nextLine();
            System.out.print("Введите тип самолета: ");
            String aircraftType = scanner.nextLine();
            System.out.print("Введите время отправления рейса: ");
            double departureTime = Double.parseDouble(scanner.nextLine());
            System.out.print("Введите день отправления рейса: ");
            String daysOfTheWeek = scanner.nextLine();

            Airline[] airlines = airlineService.addAirlines(destination, flightNumber, aircraftType, departureTime, daysOfTheWeek);
            AirlineService airlineService1 = new AirlineService();
            airlineService1.setAirlines(airlines);
            System.out.println(airlineService1);
        }
    }

    public static void destinationList(AirlineService airlineService) {
        String[] array = airlineService.getDestinationList();
        System.out.println(Arrays.toString(array));
    }

    public static void arrayPrint(Airline[] airlines) {
        System.out.println(Arrays.toString(airlines));
    }

    public static Airline[] listOfFlightsByDestination(AirlineService airlineService, String str) {
        return airlineService.getListOfFlightsByDestination(str);
    }

    public static Airline[] flightListForTeDay(AirlineService airlineService, String str) {
        return airlineService.flightListForTeDay(str);
    }

    public static Airline[] listOfFlightsFlightsByTime(AirlineService airlineService, int ttt) {
        return airlineService.getListOfFlightsFlightsByTime(ttt);

    }
}

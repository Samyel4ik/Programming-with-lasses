package Task4;

import java.util.Scanner;

public class Classs4 {
    //Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
    // Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов.
    // Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
    // Добавьте возможность сортировки массив по пункту назначения,
    // причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Train[] trains = new Train[5];

        trains[0] = new Train("MINSK", 123, 9.45);
        trains[1] = new Train("BREST", 999, 8.45);
        trains[2] = new Train("MANSK", 431, 21.55);
        trains[3] = new Train("BARST", 28, 15.35);
        trains[4] = new Train("BREST", 17, 17.25);

        System.out.println("Выберете пункт меню:" + "\n" +
                "1. сортировка по номерам поездов." + "\n" +
                "2. вывод информации о поезде по номеру." + "\n" +
                "3. сортировка по пункту назначения." + "\n" +
                "4. вывод всех поездов." + "\n");
        System.out.print("Ваш выбор - ");
        int x = scanner.nextInt();

        if (x == 1) {
            sortingByTrainNumbers(trains);
            writeArray(trains);

        }
        if (x == 2) {
            System.out.print("Введите номер поезда -");
            int num = scanner.nextInt();
            trainInformation(trains, num);
        }
        if (x == 3) {
            sortingByTrainEndStationAndDepartureTime(trains);
            writeArray(trains);
        }
        if (x == 4) {
            writeArray(trains);
        }
    }

    public static int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }

    public static Object[] sortingByTrainEndStationAndDepartureTime(Train[] trains) {

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < trains.length - 1; i++) {

                if (compare(trains[i].getEndStation(), trains[i + 1].getEndStation()) > 0) {
                    Train zamena = trains[i];
                    trains[i] = trains[i + 1];
                    trains[i + 1] = zamena;
                    isSorted = false;
                }

                if (compare(trains[i].getEndStation(), trains[i + 1].getEndStation()) == 0) {
                    if (trains[i].getDepartureTime() > trains[i + 1].getDepartureTime()) {
                        Train zamena = trains[i];
                        trains[i] = trains[i + 1];
                        trains[i + 1] = zamena;
                        isSorted = false;
                    }
                }
            }
        }

        return trains;
    }

    public static void trainInformation(Train[] trains, int num) {

        for (int i = 0; i < trains.length; i++) {
            if (num == trains[i].getTrainNumber()) {
                System.out.println(trains[i]);

            }
        }
    }

    public static void writeArray(Train[] trains) {
        for (int i = 0; i < trains.length; i++) {
            System.out.println(trains[i]);
        }
    }

    public static Object[] sortingByTrainNumbers(Train[] trains) {

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < trains.length - 1; i++) {
                if (trains[i].getTrainNumber() > trains[i + 1].getTrainNumber()) {
                    Train zamena = trains[i];
                    trains[i] = trains[i + 1];
                    trains[i + 1] = zamena;
                    isSorted = false;
                }
            }
        }
        return trains;
    }
}

class Train {
    private String endStation;
    private int trainNumber;
    private double departureTime;

    public Train(String endStation, int trainNumber, double departureTime) {
        this.endStation = endStation;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    public String toString() {
        return "Пункт назначения " + endStation + ";" + " " + "номер поезда " + trainNumber + ";" + " " + "время отправления " + departureTime + ".";
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public String getEndStation() {
        return endStation;
    }

    public double getDepartureTime() {
        return departureTime;
    }
}

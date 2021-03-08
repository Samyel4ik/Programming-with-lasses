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
        trains[2] = new Train("MINSK", 431, 21.55);
        trains[3] = new Train("MINSK", 28, 15.35);
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
            System.out.println("Список поедов:" + 17 + "," + 28 + "," + 123 + "," + 431 + "," + 999);
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

    public static char firstLetter(String str) {
        char[] array = str.toCharArray();
        return array[0];
    }

    public static void sortingByTrainEndStationAndDepartureTime(Train[] trains) {

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < trains.length - 1; i++) {
                if (firstLetter(trains[i].getEndStation()) > firstLetter(trains[i + 1].getEndStation())) {
                    Train zamena = trains[i];
                    trains[i] = trains[i + 1];
                    trains[i + 1] = zamena;
                    isSorted = false;
                }
                if (firstLetter(trains[i].getEndStation()) == firstLetter(trains[i + 1].getEndStation())) {
                    if (trains[i].getDepartureTime() > trains[i + 1].getDepartureTime()) {
                        Train zamena = trains[i];
                        trains[i] = trains[i + 1];
                        trains[i + 1] = zamena;
                        isSorted = false;
                    }
                }
            }
        }
    }

    public static void trainInformation(Train[] trains, int num) {

        for (int i = 0; i < trains.length; i++) {
            if (num == 17) {
                System.out.println(trains[4]);
                break;
            }
            if (num == 28) {
                System.out.println(trains[3]);
                break;
            }
            if (num == 431) {
                System.out.println(trains[2]);
                break;
            }
            if (num == 999) {
                System.out.println(trains[1]);
                break;
            }
            if (num == 123) {
                System.out.println(trains[0]);
                break;
            }
        }
    }

    public static void writeArray(Train[] trains) {
        for (int i = 0; i < trains.length; i++) {
            System.out.println(trains[i]);
        }
    }

    public static void sortingByTrainNumbers(Train[] trains) {

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

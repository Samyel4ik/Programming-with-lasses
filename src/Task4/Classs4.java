package Task4;

import java.util.Arrays;
import java.util.Comparator;
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

        trains[0] = new Train("MINSK", 123, 21.45);
        trains[1] = new Train("BREST", 999, 17.25);
        trains[2] = new Train("MINSK", 431, 8.55);
        trains[3] = new Train("BREST", 28, 15.35);
        trains[4] = new Train("BREST", 17, 8.45);

        System.out.println("Выберете пункт меню:" + "\n" +
                "1. сортировка по номерам поездов." + "\n" +
                "2. вывод информации о поезде по номеру." + "\n" +
                "3. сортировка по пункту назначения." + "\n" +
                "4. вывод всех поездов." + "\n");
        System.out.print("Ваш выбор - ");
        int x = scanner.nextInt();

        if (x == 1) {

            writeArray(sortingByTrainNumbers(trains));
        }
        if (x == 2) {

            System.out.print("Введите номер поезда -");
            int num = scanner.nextInt();
            trainInformation(trains, num);
        }
        if (x == 3) {

            Train[] copy = Arrays.copyOf(trains, trains.length);
            Arrays.sort(copy, new Train.EndStationComparator());
            writeArray(copy);
        }
        if (x == 4) {
            
            writeArray(trains);
        }
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

    public static Train[] sortingByTrainNumbers(Train[] trains) {

        int newLength = trains.length;
        Train[] trains1 = Arrays.copyOf(trains, newLength);

        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;

            for (int i = 0; i < trains1.length - 1; i++) {
                if (trains1[i].getTrainNumber() > trains1[i + 1].getTrainNumber()) {
                    Train zamena = trains1[i];
                    trains1[i] = trains1[i + 1];
                    trains1[i + 1] = zamena;
                    isSorted = false;
                }
            }
        }
        return trains1;
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

    static class EndStationComparator implements Comparator<Train> {

        @Override
        public int compare(Train o1, Train o2) {
            String str1 = o1.getEndStation();
            String str2 = o2.getEndStation();

            double t1 = o1.getDepartureTime();
            double t2 = o2.getDepartureTime();

            int flag = str1.compareTo(str2);

            if (flag == 0) {
                flag = (int) (t1 - t2);
            }
            return flag;
        }
    }
}

package Task10;

import java.util.Arrays;

//a)список рейсов для заданного пункта назначения
//b) список рейсов для заданного дня недели;
//c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
public class AirlineService {
    Airline[] airlines;

    public void setAirlines(Airline[] airlines) {
        this.airlines = airlines;
    }

    public Airline[] addAirlines(String destination, int flightNumber, String aircraftType, double departureTime, String daysOfTheWeek) {
        Airline[] airlines1 = Arrays.copyOf(this.airlines, this.airlines.length + 1);
        airlines1[airlines1.length - 1] = new Airline(destination, flightNumber, aircraftType, departureTime, daysOfTheWeek);
        return airlines1;
    }

    //список рейсов для заданного пункта назначения
    public int numberOfFlightsByDestination(String str) {
        int t = 0;
        for (int i = 0; i < this.airlines.length; i++) {
            if (this.airlines[i].getDestination().equals(str)) {
                t++;
            }
        }
        return t;
    }

    public Airline[] getListOfFlightsByDestination(String str) {
        Airline[] airlines1 = new Airline[numberOfFlightsByDestination(str)];
        int a = 0;
        for (int i = 0; i < this.airlines.length; i++) {
            if (this.airlines[i].getDestination().equals(str)) {
                airlines1[a] = this.airlines[i];
                a++;
            }
        }
        return airlines1;
    }

    //список рейсов для заданного дня недели
    public int numberOfFlightsForTheDay(String str) {
        int t = 0;
        for (int i = 0; i < this.airlines.length; i++) {
            if (this.airlines[i].getDaysOfTheWeek().equals(str)) {
                t++;
            }
        }
        return t;
    }

    public Airline[] flightListForTeDay(String str) {
        Airline[] airlines1 = new Airline[numberOfFlightsForTheDay(str)];
        int a = 0;
        for (int i = 0; i < this.airlines.length; i++) {
            if (this.airlines[i].getDaysOfTheWeek().equals(str)) {
                airlines1[a] = this.airlines[i];
                a++;
            }
        }
        return airlines1;
    }

    // время вылета для которых больше заданного.
    public int numberOfFlightsByTime(double ttt) {
        int t = 0;
        for (int i = 0; i < this.airlines.length; i++) {
            if (this.airlines[i].getDepartureTime() > (ttt)) {
                t++;
            }
        }
        return t;
    }

    public Airline[] getListOfFlightsFlightsByTime(double ttt) {
        Airline[] airlines1 = new Airline[numberOfFlightsByTime(ttt)];

        for (int i = 0; i < this.airlines.length; i++) {
            if (this.airlines[i].getDepartureTime() > (ttt)) {
                airlines1[i] = this.airlines[i];
            }
        }
        return airlines1;
    }

    //вовращает список пунктов назначения
    public String[] getDestinationList() {
        String[] array = new String[this.airlines.length];

        for (int i = 0; i < this.airlines.length; i++) {
            array[i] = this.airlines[i].getDestination();
        }
        return array;
    }

    //возвращает список рейсов для дня недели
    public String[] getDaysOfTheWeekList() {
        String[] array = new String[this.airlines.length];

        for (int i = 0; i < this.airlines.length; i++) {
            array[i] = this.airlines[i].getDaysOfTheWeek();
        }
        return array;
    }

    @Override
    public String toString() {
        return "AirlineService{" +
                "airlines=" + Arrays.toString(airlines) +
                '}';
    }
}

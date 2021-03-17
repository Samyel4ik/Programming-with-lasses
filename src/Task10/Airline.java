package Task10;

//Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
public class Airline {
    String destination;
    int flightNumber;
    String aircraftType;
    double departureTime;
    String daysOfTheWeek;

    public Airline(String destination, int flightNumber, String aircraftType, double departureTime, String daysOfTheWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.aircraftType = aircraftType;
        this.departureTime = departureTime;
        this.daysOfTheWeek = daysOfTheWeek;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public void setDepartureTime(double departureTime) {
        this.departureTime = departureTime;
    }

    public void setDaysOfTheWeek(String daysOfTheWeek) {
        this.daysOfTheWeek = daysOfTheWeek;
    }

    public String getDestination() {
        return destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public double getDepartureTime() {
        return departureTime;
    }

    public String getDaysOfTheWeek() {
        return daysOfTheWeek;
    }

    @Override
    public String toString() {
        return "Airline{" +
                "destination='" + destination + '\'' +
                ", flightNumber=" + flightNumber +
                ", aircraftType='" + aircraftType + '\'' +
                ", departureTime=" + departureTime +
                ", daysOfTheWeek='" + daysOfTheWeek + '\'' +
                '}';
    }

}

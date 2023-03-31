public class Main {
    public static void main(String[] args) {
        Vehicle miniVan = new Vehicle(9, 100, 10);
        Vehicle sportsCar = new Vehicle(2, 60, 15);
        miniVan.fuelNeeded("Minivan", 220);
        sportsCar.fuelNeeded("Auto sportowe", 322);
    }
}

class Vehicle {
    private int passengers;
    private int fuelcap;
    private double fuelconsumption;

    Vehicle(int p, int f, double c) {
        passengers = p;
        fuelcap = f;
        fuelconsumption = c;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int p) {
        passengers = p;
    }

    public int getFuelcap() {
        return fuelcap;
    }

    public void setFuelcap(int f) {
        fuelcap = f;
    }

    public double getFuelconsumption() {
        return fuelconsumption;
    }

    public void setFuelconsumption(double c) {
        fuelconsumption = c;
    }

    public void range(String nazwa) {
        double range = fuelcap * 100.0 / fuelconsumption;
        int roundedRange = (int) Math.round(range);
        System.out.println(nazwa + " Dowiezie  " + passengers + " osoby do " + roundedRange + " kilometrów");
    }

    public void fuelNeeded(String nazwa, int distance) {
        double fuelNeed = fuelconsumption * distance / 100.0;
        System.out.println(nazwa + " potrzebne jest " + fuelNeed + " litrów paliwa");
    }
}
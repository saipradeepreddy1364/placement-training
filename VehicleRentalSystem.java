import java.util.Scanner;
abstract class Vehicle {
    abstract double calculateRent();
}
class Car extends Vehicle {
    private int km;
    private int ratePerKm;
    Car(int km, int ratePerKm) 
    {
        this.km = km;
        this.ratePerKm = ratePerKm;
    }
    
    @Override
    double calculateRent() {
        return km * ratePerKm;
    }
}

class Bike extends Vehicle {
    private int hours;
    private int ratePerHour;
    
    Bike(int hours, int ratePerHour) {
        this.hours = hours;
        this.ratePerHour = ratePerHour;
    }
    
    @Override
    double calculateRent() {
        return hours * ratePerHour;
    }
}
class Truck extends Vehicle {
    private int load;
    private int ratePerLoad;
    Truck(int load, int ratePerLoad) {
        this.load = load;
        this.ratePerLoad = ratePerLoad;
    }
    @Override
    double calculateRent() {
        return load * ratePerLoad;
    }
}
public class VehicleRentalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Vehicle[] vehicles = new Vehicle[n];
        for (int i = 0; i < n; i++) {
            String type = sc.next();
            switch(type.toLowerCase())
            {
                case "car":
                    vehicles[i] = new Car(sc.nextInt(), sc.nextInt());
                    break;
                case "bike":
                    vehicles[i] = new Bike(sc.nextInt(), sc.nextInt());
                    break;
                case "truck":
                    vehicles[i] = new Truck(sc.nextInt(), sc.nextInt());
                    break;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print((int)vehicles[i].calculateRent());
            if (i < n - 1) {
                System.out.println(" ");
            }
        } 
        sc.close();
    }
}
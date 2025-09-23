package Inheritance;

class Vehicle {
    int maxSpeed; String fuelType;
    Vehicle(int s,String f){maxSpeed=s;fuelType=f;}
    void displayInfo(){System.out.println("Speed:"+maxSpeed+" Fuel:"+fuelType);}
}
class Car extends Vehicle {
    int seatCapacity;
    Car(int s,String f,int c){super(s,f);seatCapacity=c;}
    void displayInfo(){super.displayInfo();System.out.println("Seats:"+seatCapacity);}
}
class Truck extends Vehicle {
    int loadCapacity;
    Truck(int s,String f,int l){super(s,f);loadCapacity=l;}
    void displayInfo(){super.displayInfo();System.out.println("Load:"+loadCapacity);}
}
class Motorcycle extends Vehicle {
    String type;
    Motorcycle(int s,String f,String t){super(s,f);type=t;}
    void displayInfo(){super.displayInfo();System.out.println("Type:"+type);}
}
public class TransportSystem {
    public static void main(String[] args){
        Vehicle[] v={
            new Car(180,"Petrol",5),
            new Truck(120,"Diesel",10000),
            new Motorcycle(150,"Petrol","Sport")
        };
        for(Vehicle veh:v) veh.displayInfo();
    }
}

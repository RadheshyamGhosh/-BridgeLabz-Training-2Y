package Inheritance;

class Device {
    String deviceId, status;
    Device(String id,String st){deviceId=id;status=st;}
    void displayStatus(){System.out.println("Device "+deviceId+" | Status: "+status);}
}
class Thermostat extends Device {
    int temperatureSetting;
    Thermostat(String id,String st,int temp){super(id,st);temperatureSetting=temp;}
    void displayStatus(){
        super.displayStatus();
        System.out.println("Temperature: "+temperatureSetting+"°C");
    }
}
public class SmartHome {
    public static void main(String[] args){
        Thermostat t=new Thermostat("TH101","ON",24);
        t.displayStatus();
    }
}

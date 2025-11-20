package datalogger;

import java.util.ArrayList;

public class SensorLogger {

    private ArrayList<Double> readings = new ArrayList<>();

    public void log(double tempValue) {
	        readings.add(tempValue);  
	    }

    public void log(Double tempValue) {
	        readings.add(tempValue); 
	    }

	    public double getReading(int index) {
	        return readings.get(index); 
	    }

	    public ArrayList<Double> getAllReadings() {
	        return readings;
	    }

	    public static void main(String[] args) {

	        SensorLogger logger = new SensorLogger();

	        double primitiveTemp = 36.5;
	        Double wrapperTemp = 37.2;

	        logger.log(primitiveTemp);  
	        logger.log(wrapperTemp);    

	        double r1 = logger.getReading(0);
	        double r2 = logger.getReading(1);

	        System.out.println("Reading 1: " + r1);
	        System.out.println("Reading 2: " + r2);

	        System.out.println("All Readings: " + logger.getAllReadings());
	    }
	}

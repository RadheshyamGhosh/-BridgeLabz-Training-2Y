public class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378.0;  // radius in kilometers
        double kmToMile = 0.621;   // conversion factor

        // Volume formula: (4/3) * π * r³
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);

        // Convert radius to miles
        double radiusMiles = radiusKm * kmToMile;
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 +
                           " and cubic miles is " + volumeMiles3);
    }
}

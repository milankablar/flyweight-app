package application;

import java.util.HashMap;

public class FieldFactory {
    // initializes the HashMaps that will work with the factories to limit memory use
    private static final HashMap cityMap = new HashMap();
    private static final HashMap countryMap = new HashMap();
    private static final HashMap provinceMap = new HashMap();
    private static final HashMap vehicleMap = new HashMap();

    /**
     * Factory for City objects
     * @param name
     * @return
     */
    public static Field getCity(String name){
        City city = (City)cityMap.get(name);

        if(city == null) {
            city = new City(name);
            cityMap.put(name, city);
        }
        return city;
    }

    /**
     * Factory for Country objects
     * @param name
     * @return
     */
    public static Field getCountry(String name){
        Country country = (Country)countryMap.get(name);

        if(country == null) {
            country = new Country(name);
            countryMap.put(name, country);
        }
        return country;
    }

    /**
     * Factory for Province objects
     * @param name
     * @return
     */
    public static Field getProvince(String name){
        Province province = (Province)provinceMap.get(name);

        if(province == null) {
            province = new Province(name);
            provinceMap.put(name, province);
        }
        return province;
    }

    /**
     *
     * @param make
     * @param modelName
     * @param year
     * @return
     */
    public static Field getVehicle(String make, String modelName, String year){
        String fullVehicleString = make + modelName + year;
        Vehicle vehicle = (Vehicle)vehicleMap.get(fullVehicleString);

        if(vehicle == null){
            vehicle = new Vehicle(make, modelName, year);
            vehicleMap.put(fullVehicleString, vehicle);
        }
        return vehicle;
    }
}

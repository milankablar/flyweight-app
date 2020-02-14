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

    }

    /**
     * Factory for Country objects
     * @param name
     * @return
     */
    public static Field getCountry(String name){

    }

    /**
     * Factory for Province objects
     * @param name
     * @return
     */
    public static Field getProvince(String name){

    }

    /**
     * Factory for Vehicle objects
     * @param modelName
     * @return
     */
    public static Field getVehicle(String make, String modelName, String year){

    }
}

/*
 * Course: SE2811-051
 * Winter 2019-2020
 * FieldFactory - Final Presentation
 * Name: Nathan DuPont, Jonas Cira, Milan Kablar
 * Created: 2/12/2020
 */

package application;

import java.util.HashMap;

/**
 * Creates the HashMaps used by the factory methods, and implements said factory methods
 */
public class FieldFactory {
    // initializes the HashMaps that will work with the factories to limit memory use
    private static final HashMap cityMap = new HashMap();
    private static final HashMap countryMap = new HashMap();
    private static final HashMap provinceMap = new HashMap();
    private static final HashMap vehicleMap = new HashMap();
    private static final HashMap makeMap = new HashMap();
    private static final HashMap modelMap = new HashMap();
    private static final HashMap yearMap = new HashMap();

    /**
     * Factory for City objects
     * @param name name of city
     * @return reference to City object
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
     * @param name name of country
     * @return reference to Country object
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
     * @param name name of province
     * @return reference to Province object
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
     * Factory for Make objects
     * @param makeName name of make
     * @return reference to Make object
     */
    public static Field getMake(String makeName){
        Make make = (Make)makeMap.get(makeName);

        if(make == null){
            make = new Make(makeName);
            makeMap.put(makeName, make);
        }

        return make;
    }

    /**
     * Factory for Model
     * @param modelName name of Model
     * @return reference to Model object
     */
    public static Field getModel(String modelName){
        Model model = (Model)modelMap.get(modelName);

        if(model == null){
            model = new Model(modelName);
            modelMap.put(modelName, model);
        }

        return model;
    }

    /**
     * Factory for Year
     * @param yearName year
     * @return reference to Year object
     */
    public static Field getYear(String yearName){
        Year year = (Year)yearMap.get(yearName);

        if(year == null){
            year = new Year(yearName);
            yearMap.put(yearName, year);
        }

        return year;
    }
}

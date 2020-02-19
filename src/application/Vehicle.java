/*
 * Course: SE2811-051
 * Winter 2019-2020
 * Vehicle - Final Presentation
 * Name: Nathan DuPont, Jonas Cira, Milan Kablar
 * Created: 2/12/2020
 */

package application;

/**
 * SE2811-051 Winter 2019-2020
 * Vehicle purpose: Hold details for a vehicle object
 *
 * @author dupontn
 * @version created on 2/12/2020 at 2:20 PM
 */
public class Vehicle implements Field {
    private String make;
    private String model;
    private String year;

    /**
     * Constructor for a Vehicle object
     * @param make make of car
     * @param model model of car
     * @param year year of car
     */
    public Vehicle(String make, String model, String year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }
}

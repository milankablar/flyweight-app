/*
 * Course: SE2811-051
 * Winter 2019-2020
 * Customer - Final Presentation
 * Name: Nathan DuPont, Jonas Cira, Milan Kablar
 * Created: 2/12/2020
 */

package application;

/**
 * SE2811-051 Winter 2019-2020
 * Customer purpose:
 *
 * @author dupontn
 * @version created on 2/9/2020 at 8:40 PM
 */
public class Customer {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Country country;
    private Vehicle vehicle;

    /**
     * Constructor for Customer object
     * @param id id of customer
     * @param firstName first name of customer
     * @param lastName last name of customer
     * @param phone phone number of customer
     * @param country country of customer
     * @param vehicle vehicle that customer purchased
     */
    public Customer(int id, String firstName, String lastName, String phone,
                    Country country, Vehicle vehicle) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.country = country;
        this.vehicle = vehicle;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public Country getCountry() {
        return country;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}

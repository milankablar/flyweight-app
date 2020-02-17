/*
 * Course: SE2811-051
 * Winter 2019-2020
 * CustomerFactory - Final Presentation
 * Name: Milan Kablar, Jonas Cira, Nathan DuPont
 * Created: 2/9/2020
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

    public Customer(int id, String firstName, String lastName, String email,
                    String phone, Country country, Vehicle vehicle) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
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

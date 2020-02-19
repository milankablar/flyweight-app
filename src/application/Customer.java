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
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Field city;
    private Field province;
    private Field country;
    private Field make;
    private Field model;
    private Field year;

    /**
     * Constructor for Customer object
     * @param id id of customer
     * @param firstName first name of customer
     * @param lastName last name of customer
     * @param email email of the customer
     * @param phone phone number of customer
     * @param country country of customer
     * @param make make of the vehicle
     * @param model model of the vehicle
     * @param year year of the vehicle
     */
    public Customer(long id, String firstName, String lastName, String email,
                    String phone, Field city, Field province, Field country,
                    Field make, Field model, Field year) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.city = city;
        this.province = province;
        this.country = country;
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public long getId() {
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

    public Field getCity() {
        return city;
    }

    public Field getProvince() {
        return province;
    }

    public Field getCountry() {
        return country;
    }

    public Field getMake() {
        return make;
    }

    public Field getModel() {
        return model;
    }

    public Field getYear() {
        return year;
    }
}

/*
 * Course: SE2811-051
 * Winter 2019-2020
 * Country - Final Presentation
 * Name: Nathan DuPont, Jonas Cira, Milan Kablar
 * Created: 2/12/2020
 */

package application;


/**
 * Creates Country objects
 */
public class Country implements Field {
    private String name;

    /**
     * Constructor for a Country object with only contains a name property
     * @param name name of city
     */
    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

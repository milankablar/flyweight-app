/*
 * Course: SE2811-051
 * Winter 2019-2020
 * Country - Final Presentation
 * Name: Nathan DuPont, Jonas Cira, Milan Kablar
 * Created: 2/12/2020
 */

package application;

/**
 * SE2811-051 Winter 2019-2020
 * Country purpose:
 *
 * @author dupontn
 * @version created on 2/12/2020 at 2:18 PM
 */

public class Country implements Field {
    private String name;

    /**
     * Constructor for a Country object, only assigns the name initially, other properties are assigned later
     * @param name name of country
     */
    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

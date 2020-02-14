/*
 * Course: SE2811-051
 * Winter 2019-2020
 * Country - Final Presentation
 * Name: Nathan DuPont
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
public class Country{
    private String name;
    private String isoCode;
    private String countryCode;

    public Country(String name, String isoCode, String countryCode) {
        this.name = name;
        this.isoCode = isoCode;
        this.countryCode = countryCode;
    }

    public String getName() {
        return name;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public String getCountryCode() {
        return countryCode;
    }
}

/*
 * Course: SE2811-051
 * Winter 2019-2020
 * City - Final Presentation
 * Name: Nathan DuPont, Jonas Cira, Milan Kablar
 * Created: 2/12/2020
 */

package application;

/**
 * SE2811-051 Winter 2019-2020
 * City purpose:
 *
 * @author dupontn
 * @version created on 2/9/2020 at 8:40 PM
 */
public class City implements Field{
    private String cityName;
    private String zipCode;
    private String addOn;

    /**
     * Constructor for a City object, only assigns the name initially, other properties are assigned later
     * @param cityName name of city
     */
    public City(String cityName){
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getAddOn() {
        return addOn;
    }

    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }

    public void setAddOn(String addOn){
        this.addOn = addOn;
    }
}


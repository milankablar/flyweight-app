/*
 * Course: SE2811-051
 * Winter 2019-2020
 * Province - Final Presentation
 * Name: Nathan DuPont, Jonas Cira, Milan Kablar
 * Created: 2/12/2020
 */

package application;

/**
 * SE2811-051 Winter 2019-2020
 * Province purpose: Hold data for a specific province
 *
 * @author dupontn
 * @version created on 2/9/2020 at 8:40 PM
 */
public class Province implements Field {
    private String name;

    /**
     * Constructor for a Province object
     * @param name name of country
     */
    public Province(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

/*
 * Course: SE2811-051
 * Winter 2019-2020
 * City - Final Presentation
 * Name: Nathan DuPont, Jonas Cira, Milan Kablar
 * Created: 2/12/2020
 */

package application;

/**
 * Creates Year objects
 */
public class Year implements Field{
    private String year;

    /**
     * Constructor for a Year object with only contains a year property
     * @param year year
     */
    public Year(String year){
        this.year = year;
    }

    public String getYear(){
        return year;
    }
}

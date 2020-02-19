/*
 * Course: SE2811-051
 * Winter 2019-2020
 * Province - Final Presentation
 * Name: Nathan DuPont, Jonas Cira, Milan Kablar
 * Created: 2/12/2020
 */

package application;

/**
 * Creates Province objects
 */
public class Province implements Field {
    private String name;

    /**
     * Constructor for a Province object
     * @param name name of province
     */
    public Province(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

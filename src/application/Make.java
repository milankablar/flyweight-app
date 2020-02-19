/*
 * Course: SE2811-051
 * Winter 2019-2020
 * City - Final Presentation
 * Name: Nathan DuPont, Jonas Cira, Milan Kablar
 * Created: 2/12/2020
 */

package application;

/**
 * Creates Make objects
 */
public class Make implements Field{
    private String makeName;

    /**
     * Constructor for a Make object with only contains a name property
     * @param makeName make
     */
    public Make(String makeName){
        this.makeName = makeName;
    }

    public String getMakeName(){
        return makeName;
    }
}

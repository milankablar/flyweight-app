/*
 * Course: SE2811-051
 * Winter 2019-2020
 * City - Final Presentation
 * Name: Nathan DuPont, Jonas Cira, Milan Kablar
 * Created: 2/12/2020
 */

package application;

/**
 * Creates Model objects
 */
public class Model implements Field{
    private String modelName;

    /**
     * Constructor for a Model object with only contains a name property
     * @param modelName model
     */
    public Model(String modelName){
        this.modelName = modelName;
    }

    public String getModelName(){
        return modelName;
    }
}

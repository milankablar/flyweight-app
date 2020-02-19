package application;

public class Model implements Field{
    private String modelName;

    public Model(String modelName){
        this.modelName = modelName;
    }

    public String getModelName(){
        return modelName;
    }
}

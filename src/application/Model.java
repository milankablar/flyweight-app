package application;

public class Model implements Field{
    private String modelName;

    public Model(String modelName){
        this.modelName = modelName;
    }

    private String getModelName(){
        return modelName;
    }
}

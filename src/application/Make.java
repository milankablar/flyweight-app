package application;

public class Make implements Field{
    private String makeName;

    public Make(String makeName){
        this.makeName = makeName;
    }

    private String getMakeName(){
        return makeName;
    }
}

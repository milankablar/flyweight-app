package application;

public class Make implements Field{
    private String makeName;

    public Make(String makeName){
        this.makeName = makeName;
    }

    public String getMakeName(){
        return makeName;
    }
}

package application;

public class Province implements Field{
    private String name;
    private String abbr;

    public Province(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getAbbr(){
        return abbr;
    }

    public void setAbbr(String abbr){
        this.abbr = abbr;
    }

    public String toString(){
        return "province:" +name;
    }
}

package application;

public class Province implements Field{
    private String name;
    private String abbr;

    public Province(String name, String abbr){
        this.name = name;
        this.abbr = abbr;
    }

    public String getName(){
        return name;
    }

    public String getAbbr(){
        return abbr;
    }

    public String toString(){
        return "province:" +name;
    }
}

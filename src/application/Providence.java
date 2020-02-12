package application;

public class Providence {
    private String name;
    private String abbr;

    public Providence(String name, String abbr){
        this.name = name;
        this.abbr = abbr;
    }

    public String getName(){
        return name;
    }

    public String getAbbr(){
        return abbr;
    }
}

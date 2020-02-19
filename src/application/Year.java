package application;

public class Year implements Field{
    private String year;

    public Year(String year){
        this.year = year;
    }

    private String getYear(){
        return year;
    }
}

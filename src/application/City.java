package application;

public class City implements Field{
    private String cityName;
    private String zipCode;
    private String addOn;

    public City(String cityName){
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getAddOn() {
        return addOn;
    }

    public void setZipCode(String zipCode){
        this.zipCode = zipCode;
    }

    public void setAddOn(String addOn){
        this.addOn = addOn;
    }
}


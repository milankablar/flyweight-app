package application;

public class City {
    private String cityName;
    private String zipCode;
    private String addOn;

    public City(String cityName, String zipCode, String addOn){
        this.cityName = cityName;
        this.zipCode = zipCode;
        this.addOn = addOn;
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
}

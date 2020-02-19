/*
 * Course: SE2811-051
 * Winter 2019-2020
 * JSONUtil - Final Presentation
 * Name: Nathan DuPont
 * Created: 2/14/2020
 */

package application;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.*;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SE2811-051 Winter 2019-2020
 * JSONUtil purpose: Provide utilities for parsing JSON, as well as transcribing
 * it to customer objects to store the data
 *
 * @author dupontn
 * @version created on 2/14/2020 at 12:25 AM
 */
public class JSONUtil {
    public JSONObject readFileToJSONObject(String uri) throws IOException, ParseException {
        return (JSONObject)(new JSONParser().parse(new FileReader(uri)));
    }

    public List<Customer> getCustomers(JSONObject json, boolean isOptimized) {
        List<Customer> customerList = new ArrayList<>();
        // Get the "data" content
        JSONObject data = (JSONObject)json.get("data");

        // Get the "posts" content
        JSONArray posts = (JSONArray)data.get("posts");

        for (Object customer : posts) {
            Customer customerObj;

            JSONObject c = (JSONObject)customer;
            long id = (Long)c.get("id");
            String firstName = (String)c.get("first_name");
            String lastName = (String)c.get("last_name");
            String email = (String)c.get("email");
            String phoneNumber = (String)c.get("phone_number");

            JSONObject loc = (JSONObject)c.get("location");

            JSONObject country = (JSONObject)loc.get("country");
            String countryName = (String)country.get("name");

            JSONObject province = (JSONObject)loc.get("province");
            String provinceName = (String)province.get("name");

            JSONObject city = (JSONObject)loc.get("city");
            String cityName = (String)city.get("name");

            JSONObject vehicle = (JSONObject)c.get("vehicle");
            String vehicleMake = (String)vehicle.get("make");
            String vehicleModel = (String)vehicle.get("model");
            String vehicleYear = (String)vehicle.get("year");

            Field cityObj;
            Field provinceObj;
            Field countryObj;
            Field vehicleObj;

            if (isOptimized) {
                cityObj = FieldFactory.getCity(cityName);
                provinceObj = FieldFactory.getProvince(provinceName);
                countryObj = FieldFactory.getCountry(countryName);
                vehicleObj = FieldFactory.getVehicle(vehicleMake, vehicleModel, vehicleYear);
            } else {
                cityObj = new City(cityName);
                provinceObj = new Province(provinceName);
                countryObj = new Country(countryName);
                vehicleObj = new Vehicle(vehicleMake, vehicleModel, vehicleYear);
            }

            customerObj = new Customer(id,
                    firstName,
                    lastName,
                    email,
                    phoneNumber,
                    cityObj,
                    provinceObj,
                    countryObj,
                    vehicleObj);

            customerList.add(customerObj);
        }

        return customerList;
    }
}

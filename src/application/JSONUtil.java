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

/**
 * SE2811-051 Winter 2019-2020
 * JSONUtil purpose:
 *
 * @author dupontn
 * @version created on 2/14/2020 at 12:25 AM
 */
public class JSONUtil {
    public JSONUtil() {

    }

    private JSONObject readFileToJSONObject(String uri) throws IOException, ParseException {
        return (JSONObject)(new JSONParser().parse(new FileReader(uri)));
    }

    public static void main(String[] args) {
        JSONUtil jsonUtil = new JSONUtil();
        try {
            JSONObject jo = jsonUtil.readFileToJSONObject("src/resources/response.json");
            // Get the "data" content
            JSONObject data = (JSONObject)jo.get("data");

            // Get the "posts" content
            JSONArray posts = (JSONArray)data.get("posts");

            for (Object customer : posts) {
                JSONObject c = (JSONObject)customer;
                long id = (Long)c.get("id");
                String firstName = (String)c.get("first_name");
                String lastName = (String)c.get("last_name");
                String phoneNumber = (String)c.get("phone_number");
                System.out.println(id + ": " + firstName + " " + lastName);
            }
        } catch (IOException | ParseException e) {
            System.out.println(e.getClass());
        }
    }
}

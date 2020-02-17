/*
 * Course: SE2811-051
 * Winter 2019-2020
 * Application - Final Presentation
 * Name: Milan Kablar, Jonas Cira, Nathan DuPont
 * Created: 2/9/2020
 */

package application;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.text.NumberFormat;

/**
 * SE2811-051 Winter 2019-2020
 * Application purpose: // TODO
 *
 * @author // TODO
 * @version created on 2/9/2020 at 8:11 PM
 */
public class Application {
    public static void main(String[] args) {
        // TODO write testing code here
        /*
        Runtime runtime = Runtime.getRuntime();
        NumberFormat format = NumberFormat.getInstance();
        StringBuilder sb = new StringBuilder();
        long freeMemory = runtime.freeMemory();
        sb.append("Free memory: " + format.format(freeMemory / 1024));
        System.out.println(sb);
         */

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
                String email = (String)c.get("email");
                String phoneNumber = (String)c.get("phone_number");

            }
        } catch (IOException | ParseException e) {
            System.out.println(e.getClass());
        }
    }
}

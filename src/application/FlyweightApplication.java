/*
 * Course: SE2811-051
 * Winter 2019-2020
 * Application - Final Presentation
 * Name: Milan Kablar, Jonas Cira, Nathan DuPont
 * Created: 2/9/2020
 */

package application;

import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.List;

/**
 * SE2811-051 Winter 2019-2020
 * Application purpose: Based off of the arguments in the Application Interface,
 * search through a provided list of customers (in JSON format) and email customers
 * which have a vehicle currently being recalled
 *
 * @author Nathan DuPont
 * @version created on 2/9/2020 at 8:11 PM
 */
public class FlyweightApplication implements Application {
    public static void main(String[] args) {
        long startingMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();

        JSONUtil jsonUtil = new JSONUtil();
        try {
            JSONObject json = jsonUtil.readFileToJSONObject("../response.json");

            List<Customer> customerList = jsonUtil.getCustomers(json, APPLY_FLYWEIGHT);

            int counter = 0;

            for (Customer customer : customerList) {
                Vehicle vehicle = (Vehicle)customer.getVehicle();

                if (vehicle.getMake().equals(RECALL_MAKE) &&
                    vehicle.getModel().equals(RECALL_MODEL) &&
                    vehicle.getYear().equals(RECALL_YEAR)) {
                    System.out.println("Emailing " + customer.getFirstName() + " " +
                            customer.getLastName() + " at " + customer.getEmail());
                    counter++;
                }
            }

            System.out.println("Total customer(s) affected: " + counter);
        } catch (IOException | ParseException e) {
            System.out.println(e.getClass());
        }

        long endingMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        long actualMemUsed = endingMemory - startingMemory;

        if (APPLY_FLYWEIGHT) {
            System.out.println("With the Flyweight Pattern Applied: ");
        } else {
            System.out.println("Without the Flyweight Pattern Applied: ");
        }
        System.out.println("Total Memory Used: " + (actualMemUsed/1E9) + "GB");
    }
}

/*
 * Course: SE2811-051
 * Winter 2019-2020
 * CustomerJSONParser - Final Presentation
 * Name: Nathan DuPont
 * Created: 2/12/2020
 */

package application;

import java.io.*;

/**
 * SE2811-051 Winter 2019-2020
 * CustomerJSONParser purpose:
 *
 * @author dupontn
 * @version created on 2/12/2020 at 3:08 PM
 */
public class CustomerJSONParser {
    private File jsonFile;
    private String fileData;
    private BufferedReader bf;

    public CustomerJSONParser(File jsonFile) throws FileNotFoundException {
        this.jsonFile = jsonFile;
        bf = new BufferedReader(new FileReader(jsonFile));
    }

    public void parseStatus() {

    }

    public static void main(String[] args) {
        File file = new File("src/resources/response.json");
        CustomerJSONParser customerJSONParser;

        try {
            customerJSONParser = new CustomerJSONParser(file);
            customerJSONParser.parseStatus();

        } catch (FileNotFoundException e) {
            System.out.println(e.getClass());
        }
    }
}

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

    public CustomerJSONParser(File jsonFile) {
        this.jsonFile = jsonFile;
    }

    public void parseStatus() {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader(jsonFile));

            String st = bufferedReader.readLine();
            System.out.println(st);
        } catch (FileNotFoundException e) {
            System.out.println(e.getClass());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        File file = new File("file:response.json");

        CustomerJSONParser customerJSONParser = new CustomerJSONParser(file);

        customerJSONParser.parseStatus();
        customerJSONParser.parseStatus();
    }
}

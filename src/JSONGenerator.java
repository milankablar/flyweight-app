package application;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

// https://howtodoinjava.com/library/json-simple-read-write-json-examples/
public class JSONGenerator {
    public static void main(String[] args) throws IOException {

        String[] lastNames = {"Smith","Johnson","Williams","Jones","Brown","Davis","Miller","Wilson","Moore","Taylor",
                "Anderson","Thomas","Jackson","White","Harris","Martin","Thompson","Garcia","Martinez","Clark"};
        String[] firstNames = {"James","John","Robert","Michael","William","David","Richard","Charles","Joseph","Chris",
                "Mary","Patricia","Linda","Barbara","Elizabeth","Jennifer","Maria","Susan","Margaret","Lisa"};
        String[] countryNames = {"China","India","United States","Mexico","Brazil","Russia","Germany","France","Italy","Poland"};
        String[][] provinceNames = {{"Gansu","Fujian","Henan"},{"Bihar","Goa","Assam"},{"California","Illinois","Wisconsin"},
                {"Campeche","Guerrero","Sonora"},{"Para","Amapa","Bahia"},{"Moscow","Vladmi","Penza"},{"Bavaria","Saarland","Hamburg"},
                {"Normandy","Picardy","Brittany"},{"Asti","Bari","Grosseto"},{"Opole","Masovia","Lubusz"}};
        String[] cityNames = {"Jonastown","Nathantopia","Milanville"};
        String[] vehicleMakes = {"Ford","Chevy","Toyota","Nissan","Lincoln","Honda","Dodge","Volkswagen","Fiat","Tesla"};
        String[] vehicleModels = {"Mustang","Silverado","Camry","Skyline GTR","MKZ","Civic","Challenger","Beetle","500","Roadster"};


        PrintWriter out = new PrintWriter(new FileWriter("response.json"));

        StringBuilder sb = new StringBuilder("{\n" +
                "  \"status\": \"\",\n" +
                "\n" +
                "  \"data\": {\n" +
                "    \"posts\": ["
        );

        for(int i = 0; i < 200000; i++) {
            System.out.println(i);
            String lastName = lastNames[((int) (Math.random()*20))];
            String firstName = firstNames[(int) (Math.random()*20)];
            String phoneNumber = Double.toString((int) (Math.random()*1000000000));
            int countryNum = (int) (Math.random()*10);
            String countryName = countryNames[countryNum];
            String provinceName = provinceNames[countryNum][(int) (Math.random()*3)];
            String cityName = cityNames[(int) (Math.random()*3)];
            int vehicleNum = (int) (Math.random()*10);
            String vehicleMake = vehicleMakes[vehicleNum];
            String vehicleModel = vehicleModels[vehicleNum];
            String vehicleYear = Integer.toString((int) (Math.random()*70 + 1950));

            sb.append("{\n" +
                    "        \"id\": 1,\n" +
                    "        \"last_name\": \""+lastName+"\",\n" +
                    "        \"first_name\": \""+firstName+"\",\n" +
                    "        \"phone_number\": \""+phoneNumber+"\",\n" +
                    "        \"location\": {\n" +
                    "          \"country\": {\n" +
                    "            \"name\": \""+countryName+"\",\n" +
                    "          },\n" +
                    "          \"state\": {\n" +
                    "            \"name\": \""+provinceName+"\",\n" +
                    "          },\n" +
                    "          \"city\": {\n" +
                    "            \"name\": \""+cityName+"\",\n" +
                    "          }\n" +
                    "        },\n" +
                    "        \"vehicle\": {\n" +
                    "          \"make\": \""+vehicleMake+"\",\n" +
                    "          \"model\": \""+vehicleModel+"\",\n" +
                    "          \"year\": \""+vehicleYear+"\"\n" +
                    "        }\n" +
                    "      },"
            );
        }

        out.write(sb.toString());
        out.close();
    }
}

package application;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class JSONGenerator {
    private static final int CUSTOMER_OBJECTS = 1252354;

    private static int getSingleDigitInt() {
        return (int)(Math.random() * 10) % 10;
    }

    private static String getPhoneNumber() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            sb.append(getSingleDigitInt());
        }

        return sb.toString();
    }

    private static String getEmailAddress(String firstName, String lastName) {
        return firstName + "_" + lastName + "@gmail.com";
    }

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
                "  \"status\": \"success\",\n" +
                "  \"data\": {\n" +
                "    \"posts\": [\n"
        );

        for(int i = 0; i < CUSTOMER_OBJECTS; i++) {
            System.out.println(i);
            String lastName = lastNames[((int) (Math.random()*20))];
            String firstName = firstNames[(int) (Math.random()*20)];
            String phoneNumber = getPhoneNumber();
            int countryNum = (int) (Math.random()*10);
            String countryName = countryNames[countryNum];
            String provinceName = provinceNames[countryNum][(int) (Math.random()*3)];
            String cityName = cityNames[(int) (Math.random()*3)];
            int vehicleNum = (int) (Math.random()*10);
            String vehicleMake = vehicleMakes[vehicleNum];
            String vehicleModel = vehicleModels[vehicleNum];
            String vehicleYear = Integer.toString((int) (Math.random()*20 + 2000));

            sb.append("      {\n" +
                    "        \"id\": " + i + ",\n" +
                    "        \"last_name\": \""+lastName+"\",\n" +
                    "        \"first_name\": \""+firstName+"\",\n" +
                    "        \"email\": \"" + getEmailAddress(firstName, lastName) + "\",\n" +
                    "        \"phone_number\": \""+phoneNumber+"\",\n" +
                    "        \"location\": {\n" +
                    "          \"country\": {\n" +
                    "            \"name\": \""+countryName+"\"\n" +
                    "          },\n" +
                    "          \"province\": {\n" +
                    "            \"name\": \""+provinceName+"\"\n" +
                    "          },\n" +
                    "          \"city\": {\n" +
                    "            \"name\": \""+cityName+"\"\n" +
                    "          }\n" +
                    "        },\n" +
                    "        \"vehicle\": {\n" +
                    "          \"make\": \""+vehicleMake+"\",\n" +
                    "          \"model\": \""+vehicleModel+"\",\n" +
                    "          \"year\": \""+vehicleYear+"\"\n" +
                    "        }\n");

            if (i == CUSTOMER_OBJECTS - 1) {
                sb.append("      }\n");
            } else {
                sb.append("      },\n");
            }
        }

        sb.append("    ]\n");
        sb.append("  }\n");
        sb.append("}");

        out.write(sb.toString());
        out.close();
    }
}

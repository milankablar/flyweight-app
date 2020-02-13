import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

public class JSONGenerator {
    public static void main(String[] args) throws IOException {

        ArrayList<String> lastNames = new ArrayList<>(
                Arrays.asList("Smith","Johnson","Williams","Jones","Brown","Davis","Miller","Wilson","Moore","Taylor",
                        "Anderson","Thomas","Jackson","White","Harris","Martin","Thompson","Garcia","Martinez","Clark"));
        ArrayList<String> firstNames = new ArrayList<>(
                Arrays.asList("James","John","Robert","Michael","William","David","Richard","Charles","Joseph","Chris",
                        "Mary","Patricia","Linda","Barbara","Elizabeth","Jennifer","Maria","Susan","Margaret","Lisa"));
        ArrayList<String> countryNames = new ArrayList<>(
                Arrays.asList("China","India","United States","Mexico","Brazil","Russia","Germany","France","Italy","Poland"));
        ArrayList<String> provinceNames = new ArrayList<>(
                Arrays.asList(new ArrayList("California", ),"India","United States","Mexico","Brazil","Russia","Germany","France","Italy","Poland"));

        PrintWriter out = new PrintWriter(new FileWriter("response.json"));
        StringBuilder sb = new StringBuilder("{\n" +
                "  \"status\": \"\",\n" +
                "\n" +
                "  \"data\": {\n" +
                "    \"posts\": [");

        for(int i = 0; i < 200000; i++) {
            String lastName;
            String firstName;
            String phoneNumber;
            String countryName;
            String countryISO;
            String countryCode;
            String province;
            String city;
            String vehicleMake;
            String vehicleModel;
            String vehicleYear;



            sb.append("{\n" +
                    "        \"id\": 1,\n" +
                    "        \"last_name\": \"LastName\",\n" +
                    "        \"first_name\": \"FirstName\",\n" +
                    "        \"phone_number\": \"1234567890\",\n" +
                    "        \"location\": {\n" +
                    "          \"country\": {\n" +
                    "            \"name\": \"United States\",\n" +
                    "            \"iso_code\": \"US\"\n" +
                    "          },\n" +
                    "          \"state\": {\n" +
                    "            \"name\": \"Wisconsin\",\n" +
                    "            \"abbr\": \"WI\"\n" +
                    "          },\n" +
                    "          \"city\": {\n" +
                    "            \"name\": \"Milwaukee\",\n" +
                    "            \"zip_code\": \"53202\"\n" +
                    "          }\n" +
                    "        },\n" +
                    "        \"vehicle\": {\n" +
                    "          \"make\": \"Ford\",\n" +
                    "          \"model\": \"Escape\",\n" +
                    "          \"year\": \"2020\"\n" +
                    "        }\n" +
                    "      },")
        }
    }
}

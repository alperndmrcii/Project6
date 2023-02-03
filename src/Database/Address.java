package Database;

import java.util.ArrayList;
import java.util.Arrays;

public class Address {

    private static ArrayList<String> cityList = new ArrayList<>(Arrays.asList("New York", "New Jersey", "Ohio", "Pennsylvania", "Washington", "Atlanta"));

    public static ArrayList<String> getCityList() {
        return cityList;
    }
}

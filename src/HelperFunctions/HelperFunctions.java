package HelperFunctions;

import Database.Address;
import Models.User;

public class HelperFunctions {

    public static String checkCity(String city) {
   //    for (String a:Address.getCityList())
   //    {
   //        if (city.equals(a)){
   //            return a;
   //        }
   //    }
   //    return null;
        if (Address.getCityList().contains(city))
            return city;
        else
            throw new RuntimeException("We can not continue your process because, there is no shipping that location.");
    }


    public static String generateShippingTrackingNumber(String fullname, String city, String zipCode) {
        String city3chars = city.substring(0, 3);
        String namefirstletter = String.valueOf(fullname.charAt(0));
        for (int i = 0; i < fullname.length(); i++) {
            if (fullname.charAt(i) == ' ') {
                namefirstletter = namefirstletter.concat(String.valueOf(fullname.charAt(i + 1)));
            }
        }

        return (city3chars + zipCode + namefirstletter).toUpperCase();
    }

    public static String checkZipCode(String zipCode) {
        if (zipCode.length() != 5) {
            throw new RuntimeException("Please enter valid Zip Code");
        } else return zipCode;

    }
}

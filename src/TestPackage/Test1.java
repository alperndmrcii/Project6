package TestPackage;

import Database.Items;
import Models.User;
import org.junit.Assert;
import org.junit.Test;

public class Test1 {




    @Test
    public void test1() {

        User user = new User("Jackie Chan", "123 main", "New York", "12345");

        user.setMyPrice(Items.ItemName("Monitor"));
        user.setMyPrice(Items.colorPrice("Red"));
        user.setMyPrice(Items.customText("I love my monitor"));


        System.out.println(user);

        User user2 = new User("Tony Stark", "123 main", "Atlanta", "66443");

        user2.setMyPrice(Items.ItemName("Rose teddy bear"));
        user2.setMyPrice(Items.colorPrice("Blue"));
        user2.setMyPrice(Items.customText("for u"));

        System.out.println(user2);

        double totalPrice = user.getMyPrice() + user2.getMyPrice();

        System.out.println("Total users price : " + totalPrice);

        Assert.assertEquals("144.23000000000002", String.valueOf(totalPrice));

    }

    @Test
    public void test2() {

        User user = new User("James Bond", "1 Second", "New Jersey", "00981");

        user.setMyPrice(Items.ItemName("Monitor"));
        user.setMyPrice(Items.colorPrice("White"));

        System.out.println(user);

        User user2 = new User("Arnold Schwarzenegger", "3099 glass street", "Pennsylvania", "99212");

        user2.setMyPrice(Items.ItemName("mug"));
        user2.setMyPrice(Items.colorPrice("Blue"));
        user2.setMyPrice(Items.customText("Happy Birthday"));

        System.out.println(user2);

        double totalPrice = user.getMyPrice() + user2.getMyPrice();

        System.out.println("Total users price : " + totalPrice);

        Assert.assertEquals("133.23000000000002", String.valueOf(totalPrice));

    }

    @Test
    public void test3() {

        User user = new User("Johnny Depp", "12 Java street", "Ohio", "11223");

        user.setMyPrice(Items.ItemName("charger"));
        user.setMyPrice(Items.colorPrice("Black"));

        System.out.println(user);

        User user2 = new User("Emma Watson", "2496 spindlehill drive", "Washington", "99212");

        user2.setMyPrice(Items.ItemName("Iphone max"));
        user2.setMyPrice(Items.colorPrice("Red"));
        user2.setMyPrice(Items.customText("I am coming home"));

        System.out.println(user2);

        double totalPrice = user.getMyPrice() + user2.getMyPrice();

        System.out.println("Total users price : " + totalPrice);

        Assert.assertEquals("912.4300000000001", String.valueOf(totalPrice));

    }


}

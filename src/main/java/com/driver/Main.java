package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
//C:\Users\ritwi\IdeaProjects\encapsulation-ritwikhero\src\main\java\com\driver\Main.java:6:12
//java: name has private access in com.driver.RWOnly
//        obj.name = "Ritwik";

        obj.setName("Ritwik");
        System.out.println(obj.getName());
    }
}
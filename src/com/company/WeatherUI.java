package com.company;

import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class WeatherUI {

    public static void main(String[] args) throws IOException {

        // Variable Declaration
        Scanner scanner = new Scanner(System.in);              //
        int over;                                              //
        int under;                                             //
        String town;                                           //
        String land;                                           //
        Date day = new Date();                                 //


        // welcome message to user
        System.out.println("Welcome to the Clever Weather Reporter!");
        System.out.println(" My name is Sunny Skyz and I will be keeping track the current weather forecast for your location.");
        System.out.println("Please provide me with the following information: ");
        System.out.println("");

        // take in user input
        System.out.print("Please enter in your city: ");
        town = scanner.nextLine();

        System.out.print("Please enter in your state: ");
        land = scanner.nextLine();

        System.out.print("Please enter in today's High: ");
        over = Integer.parseInt(scanner.nextLine());

        System.out.print("Please enter today's Low: ");
        under = Integer.parseInt(scanner.nextLine());

        Weather outlook = new Weather(over,under,town,land);

        // Prints out user entered information
        System.out.println(outlook);
        System.out.println("This is Sunny Skyz and thank you for using the Clever Weather Reporter! You have a very Sunny Day!");

        // calls weather service class
        WeatherService check = new WeatherService();
        check.saveWeather(outlook);

//        // calls print class
//        WeatherDAO print = new WeatherDAO();
//        print.createOutputFile(outlook);

    }
}

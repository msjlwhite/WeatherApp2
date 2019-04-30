package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class WeatherDAO {


    // date variable to hold the current date
    Date day = new Date();

    public void outputFile(Weather a) throws IOException {

//        Weather outlook = new Weather(over,under,town,land);

        // Print out user input to a file
        FileWriter writer = new FileWriter(   a.getCity()+ ", " + a.getState() + ".txt");   // creates a FileWriter Object to create a new file to write to
        BufferedWriter buffer = new BufferedWriter(writer);                          // writes text to a file

        buffer.write(String.valueOf(day));
        buffer.newLine();

        buffer.write("Welcome to the Clever Weather Reporter!");
        buffer.newLine();

        buffer.write("Hello, my name is Sunny Skyz. I have gathered all of the location and weather information that you entered" +
                "\n and compiled it into a weather report for you: ");
        buffer.newLine();

        buffer.write(String.valueOf(a));

        buffer.newLine();
        buffer.flush();
        buffer.close();

    }//


}// end of WeatherDAO class

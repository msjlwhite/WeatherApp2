package com.company;

import java.io.IOException;

public class WeatherService {

    // calls print class
    WeatherDAO print = new WeatherDAO();

    public void saveWeather(Weather a) throws IOException {

        if ((a.getHigh() > 100) || (a.getLow() < 0)){

            System.out.println("You entered in an invalid temperature!");

        } else
            print.outputFile(a);

        
    }//end

}// end of WeatherService class

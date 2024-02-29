package org.example;

public class TemperatureConversion {
    public static double kelvinToFahrenheit(double kelvin) {
        return Math.rint(((kelvin - 273.15) * (9/5) + 32));
    }
}

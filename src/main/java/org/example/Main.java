package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double kelvin = 300.1;
        double fahrenheit = TemperatureConversion.kelvinToFahrenheit(kelvin);
        System.out.println(kelvin + "K is " + fahrenheit + "°F");
    }
}
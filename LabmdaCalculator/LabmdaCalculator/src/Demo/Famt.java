package Demo;

import java.util.function.Function;

public class Famt {

    public static void main(String[] args) {
        // Fahrenheit to Celsius conversion
        double fahrenheitValue = 98.6; // Replace this with the desired Fahrenheit value
        System.out.println("Fahrenheit to Celsius: " + convert(fahrenheitValue, fahrenheitToCelsius));
1
        // Kilometers to Miles conversion
        double kilometersValue = 10; // Replace this with the desired kilometers value
        System.out.println("Kilometers to Miles: " + convert(kilometersValue, kilometersToMiles));
    }

    // Fahrenheit to Celsius lambda expression
    private static final Function<Double, Double> fahrenheitToCelsius = f -> (f - 32) * 5 / 9;

    // Kilometers to Miles lambda expression
    private static final Function<Double, Double> kilometersToMiles = km -> km * 0.621371;

    // Generic conversion method using lambda expression
    private static double convert(double input, Function<Double, Double> conversionFunction) {
        return conversionFunction.apply(input);
    }
}

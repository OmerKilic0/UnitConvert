import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter distance in meters: ");
        double meters = scan.nextDouble();
        double convertFeet = UnitConvert.MetersToFeet(meters);
        System.out.println(meters + " meters = " + convertFeet + " feet");

        System.out.print("Enter distance in feet: ");
        double feet = scan.nextDouble();
        double convertMeters = UnitConvert.FeetToMeters(feet);
        System.out.println(feet + " feet = " + convertMeters + " meters");

        System.out.print("Enter temperature in celcius: ");
        double celcius = scan.nextDouble();
        double convertFahrenheit = UnitConvert.CelciusToFahrenheit(celcius);
        System.out.println(celcius + "C = " + convertFahrenheit + "F");

        System.out.print("Enter temperature in fahrenheit: ");
        double fahrenheit = scan.nextDouble();
        double convertCelcius = UnitConvert.FahrenheitToCelcius(fahrenheit);
        System.out.println(fahrenheit + "F = " + convertCelcius + "C");
    }
}

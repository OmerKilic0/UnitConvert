public class UnitConvert {

    public static double MetersToFeet(double meters){

        return (meters * 3.28);
}

    public static double FeetToMeters(double feet){

        return (feet / 3.28);
    }

    public static double CelciusToFahrenheit(double celcius){

        return (celcius * 9 / 5 + 32);
    }

    public static double FahrenheitToCelcius(double fahrenheit){

        return ((5 * (fahrenheit-32)) / 9);
    }
}

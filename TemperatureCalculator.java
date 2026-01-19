import java.util.Scanner;

public class TemperatureCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Celcius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        System.out.print("Current unit: ");
        int unit = sc.nextInt();
        System.out.print("Temperature: ");
        int temp = sc.nextInt();
        if (unit == 1) {
            Celsius c = new Celsius(temp);
            System.out.println(c.convertToFahrenheit());
            System.out.println(c.convertToKelvin());
        } else if (unit == 2) {
            Fahrenheit f = new Fahrenheit(temp);
            System.out.println(f.convertToCelsius());
            System.out.println(f.convertToKelvin());
        } else {
            Kelvin k = new Kelvin(temp);
            System.out.println(k.convertToCelsius());
            System.out.println(k.convertToFahrenheit());
        }

        sc.close();
    }
}

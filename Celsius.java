public class Celsius implements Temperature {
    private double temperature;

    public Celsius(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public Celsius convertToCelsius() {
        return this;
    }

    @Override
    public Fahrenheit convertToFahrenheit() {
        return new Fahrenheit(this.temperature * (9.0 / 5) + 32);
    }

    @Override
    public Kelvin convertToKelvin() {
        return new Kelvin(this.temperature + 273.15);
    }

    public double getTemperature() {
        return temperature;
    }

    public String toString() {
        return "Temperature in Celsius " + this.temperature;
    }

}

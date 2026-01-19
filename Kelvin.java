public class Kelvin implements Temperature{
    private double temperature;

    public Kelvin(double temperature) {
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    @Override
    public Celsius convertToCelsius() {
        Celsius c = new Celsius(this.temperature - 273.15);
        return c;
    }

    @Override
    public Fahrenheit convertToFahrenheit() {
        Fahrenheit f = new Fahrenheit((this.temperature - 273.15)* 9.0/5 + 32);
        return f;
    }

    @Override
    public Kelvin convertToKelvin() {
        return this;
    }   
    public String toString(){
        return "Temperature in Kelvin " + this.temperature;
    }
}

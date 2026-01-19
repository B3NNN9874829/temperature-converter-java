public class Fahrenheit implements Temperature{
    private double temperature;
    
    public Fahrenheit(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public Celsius convertToCelsius() {
        return new Celsius((this.temperature - 32)* 5.0/9);
    }

    @Override
    public Fahrenheit convertToFahrenheit() {
       return this;
    }

    @Override
    public Kelvin convertToKelvin() {
        return new Kelvin((this.temperature - 32 ) * 5.0/9 + 273.15);
    }

    public double getTemperature() {
        return temperature;
    }
    public String toString(){
        return "Temperature in Fahrenheit "+ this.temperature;
    }
    
}

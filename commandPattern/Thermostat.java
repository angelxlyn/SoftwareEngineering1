package commandPattern;

public class Thermostat {
    private int temperature = 22;
    
    public String increaseTemp() {
        temperature++;
        return "Temperature increased to " + temperature + "°C";
    }
    
    public String decreaseTemp() {
        temperature--;
        return "Temperature decreased to " + temperature + "°C";
    }
}

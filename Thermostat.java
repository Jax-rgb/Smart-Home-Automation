public class Thermostat {
    private int temperature = 20;

    public void turnOn() {
        System.out.println("Thermostat is ON at " + temperature + "°C");
    }

    public void turnOff() {
        System.out.println("Thermostat is OFF");
    }

    public void increaseTemperature() {
        temperature += 1;
        System.out.println("Thermostat temperature increased to " + temperature + "°C");
    }

    public void decreaseTemperature() {
        temperature = Math.max(10, temperature - 1);
        System.out.println("Thermostat temperature decreased to " + temperature + "°C");
    }
}
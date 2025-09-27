public class ThermostatIncreaseTemperatureCommand implements Command {
    private Thermostat thermostat;

    public ThermostatIncreaseTemperatureCommand(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public void execute() {
        thermostat.increaseTemperature();
    }
}
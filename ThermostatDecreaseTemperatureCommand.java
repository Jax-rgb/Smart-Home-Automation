public class ThermostatDecreaseTemperatureCommand implements Command {
    private Thermostat thermostat;

    public ThermostatDecreaseTemperatureCommand(Thermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public void execute() {
        thermostat.decreaseTemperature();
    }
}
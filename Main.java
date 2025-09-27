public class Main {
    public static void main(String[] args) {
        // Initialize devices
        Light livingRoomLight = new Light();
        Thermostat thermostat = new Thermostat();
        MusicPlayer musicPlayer = new MusicPlayer();

        // Initialize commands
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);
        Command lightIncreaseBrightness = new LightIncreaseBrightnessCommand(livingRoomLight);
        Command lightDecreaseBrightness = new LightDecreaseBrightnessCommand(livingRoomLight);

        Command thermostatOn = new ThermostatOnCommand(thermostat);
        Command thermostatOff = new ThermostatOffCommand(thermostat);
        Command thermostatIncreaseTemp = new ThermostatIncreaseTemperatureCommand(thermostat);
        Command thermostatDecreaseTemp = new ThermostatDecreaseTemperatureCommand(thermostat);

        Command musicPlayerOn = new MusicPlayerOnCommand(musicPlayer);
        Command musicPlayerOff = new MusicPlayerOffCommand(musicPlayer);
        Command musicPlayerIncreaseVolume = new MusicPlayerIncreaseVolumeCommand(musicPlayer);
        Command musicPlayerDecreaseVolume = new MusicPlayerDecreaseVolumeCommand(musicPlayer);

        // Initialize smart home hub
        SmartHomeHub hub = new SmartHomeHub();

        // Register commands with the hub
        hub.setCommand("light_on", lightOn);
        hub.setCommand("light_off", lightOff);
        hub.setCommand("light_increase_brightness", lightIncreaseBrightness);
        hub.setCommand("light_decrease_brightness", lightDecreaseBrightness);

        hub.setCommand("thermostat_on", thermostatOn);
        hub.setCommand("thermostat_off", thermostatOff);
        hub.setCommand("thermostat_increase_temp", thermostatIncreaseTemp);
        hub.setCommand("thermostat_decrease_temp", thermostatDecreaseTemp);

        hub.setCommand("music_player_on", musicPlayerOn);
        hub.setCommand("music_player_off", musicPlayerOff);
        hub.setCommand("music_player_increase_volume", musicPlayerIncreaseVolume);
        hub.setCommand("music_player_decrease_volume", musicPlayerDecreaseVolume);

        // Test the system
        System.out.println("Testing Smart Home Automation System:");
        hub.executeCommand("light_on");
        hub.executeCommand("light_increase_brightness");
        hub.executeCommand("light_increase_brightness");
        hub.executeCommand("light_decrease_brightness");
        hub.executeCommand("light_off");

        hub.executeCommand("thermostat_on");
        hub.executeCommand("thermostat_increase_temp");
        hub.executeCommand("thermostat_decrease_temp");
        hub.executeCommand("thermostat_off");

        hub.executeCommand("music_player_on");
        hub.executeCommand("music_player_increase_volume");
        hub.executeCommand("music_player_decrease_volume");
        hub.executeCommand("music_player_off");
    }
}
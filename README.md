# Smart-Home-Automation
@startuml
interface Command {
  +execute()
}

class SmartHomeHub {
  -commands: Map<String, Command>
  +setCommand(commandName: String, command: Command)
  +executeCommand(commandName: String)
}

class Light {
  -brightness: int
  +turnOn()
  +turnOff()
  +increaseBrightness()
  +decreaseBrightness()
}

class Thermostat {
  -temperature: int
  +turnOn()
  +turnOff()
  +increaseTemperature()
  +decreaseTemperature()
}

class MusicPlayer {
  -volume: int
  -currentPlaylist: String
  +turnOn()
  +turnOff()
  +increaseVolume()
  +decreaseVolume()
  +playPlaylist(playlist: String)
}

class LightOnCommand {
  -light: Light
  +LightOnCommand(light: Light)
  +execute()
}

class LightOffCommand {
  -light: Light
  +LightOffCommand(light: Light)
  +execute()
}

class LightIncreaseBrightnessCommand {
  -light: Light
  +LightIncreaseBrightnessCommand(light: Light)
  +execute()
}

class LightDecreaseBrightnessCommand {
  -light: Light
  +LightDecreaseBrightnessCommand(light: Light)
  +execute()
}

class ThermostatOnCommand {
  -thermostat: Thermostat
  +ThermostatOnCommand(thermostat: Thermostat)
  +execute()
}

class ThermostatOffCommand {
  -thermostat: Thermostat
  +ThermostatOffCommand(thermostat: Thermostat)
  +execute()
}

class ThermostatIncreaseTemperatureCommand {
  -thermostat: Thermostat
  +ThermostatIncreaseTemperatureCommand(thermostat: Thermostat)
  +execute()
}

class ThermostatDecreaseTemperatureCommand {
  -thermostat: Thermostat
  +ThermostatDecreaseTemperatureCommand(thermostat: Thermostat)
  +execute()
}

class MusicPlayerOnCommand {
  -musicPlayer: MusicPlayer
  +MusicPlayerOnCommand(musicPlayer: MusicPlayer)
  +execute()
}

class MusicPlayerOffCommand {
  -musicPlayer: MusicPlayer
  +MusicPlayerOffCommand(musicPlayer: MusicPlayer)
  +execute()
}

class MusicPlayerIncreaseVolumeCommand {
  -musicPlayer: MusicPlayer
  +MusicPlayerIncreaseVolumeCommand(musicPlayer: MusicPlayer)
  +execute()
}

class MusicPlayerDecreaseVolumeCommand {
  -musicPlayer: MusicPlayer
  +MusicPlayerDecreaseVolumeCommand(musicPlayer: MusicPlayer)
  +execute()
}

SmartHomeHub o--> "many" Command
Command <|.. LightOnCommand
Command <|.. LightOffCommand
Command <|.. LightIncreaseBrightnessCommand
Command <|.. LightDecreaseBrightnessCommand
Command <|.. ThermostatOnCommand
Command <|.. ThermostatOffCommand
Command <|.. ThermostatIncreaseTemperatureCommand
Command <|.. ThermostatDecreaseTemperatureCommand
Command <|.. MusicPlayerOnCommand
Command <|.. MusicPlayerOffCommand
Command <|.. MusicPlayerIncreaseVolumeCommand
Command <|.. MusicPlayerDecreaseVolumeCommand
LightOnCommand o--> Light
LightOffCommand o--> Light
LightIncreaseBrightnessCommand o--> Light
LightDecreaseBrightnessCommand o--> Light
ThermostatOnCommand o--> Thermostat
ThermostatOffCommand o--> Thermostat
ThermostatIncreaseTemperatureCommand o--> Thermostat
ThermostatDecreaseTemperatureCommand o--> Thermostat
MusicPlayerOnCommand o--> MusicPlayer
MusicPlayerOffCommand o--> MusicPlayer
MusicPlayerIncreaseVolumeCommand o--> MusicPlayer
MusicPlayerDecreaseVolumeCommand o--> MusicPlayer

@enduml
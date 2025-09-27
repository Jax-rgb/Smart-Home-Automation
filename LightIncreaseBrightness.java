public class LightIncreaseBrightnessCommand implements Command {
    private Light light;

    public LightIncreaseBrightnessCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.increaseBrightness();
    }
}
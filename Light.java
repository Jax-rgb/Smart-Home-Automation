public class Light {
    private int brightness = 0;

    public void turnOn() {
        System.out.println("Light is ON with brightness " + brightness);
    }

    public void turnOff() {
        System.out.println("Light is OFF");
    }

    public void increaseBrightness() {
        brightness += 10;
        System.out.println("Light brightness increased to " + brightness);
    }

    public void decreaseBrightness() {
        brightness = Math.max(0, brightness - 10);
        System.out.println("Light brightness decreased to " + brightness);
    }
}
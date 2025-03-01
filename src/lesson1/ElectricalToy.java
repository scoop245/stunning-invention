package lesson1;

public class ElectricalToy {
    private String name;
    private String colorLight;
    private int speed;
    private boolean isOn;
    private int[] position;

    public ElectricalToy(String name, String colorLight, int speed, int x, int y) {
        this(name, colorLight, speed);
        position = new int[]{x, y};
    }

    public ElectricalToy(String name, String colorLight, int speed) {
        this(name, colorLight);
        this.speed = speed;

    }

    public ElectricalToy(String name, String colorLight) {
        this.name = name;
        this.colorLight = colorLight;
    }

    public void powerOn() {
        isOn = true;
    }

    public void powerOf() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColorLight() {
        return colorLight;
    }

    public void setColor(String colorLight) {
        this.colorLight = colorLight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int[] getPosition() {
        return position;
    }

    public void setPosition(int x, int y) {
        position = new int[]{x, y};
    }

    public void move(int click) {
        int velocity = speed * click;
        position[0] = position[0] + velocity;
        position[1] = position[1] + velocity;
    }

    public void shine() {
        System.out.println("glow light " + colorLight);
    }

    public void play() {
        powerOn();
        shine();
    }
}

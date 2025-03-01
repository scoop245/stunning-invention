package lesson1;

public class Helicopter extends ElectricalToy {
    private String Song;
    private double height;

    public Helicopter(String name, String colorLight, int speed, int x, int y, double height) {
        super(name, colorLight, speed, x, y);
        this.height = height;
    }

    public Helicopter(String name, String colorLight, int speed) {
        super(name, colorLight, speed);
    }

    public Helicopter(String name, String colorLight) {
        super(name, colorLight);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setSong(String song) {
        Song = song;
    }

    public void musicOn() {
        if (isOn()) {
            System.out.println("Playing music ♫ " + Song);
        }
    }

    @Override
    public void move(int click) {
        int velocity = (int) (1.5 * getSpeed() * click);
        getPosition()[0] = getPosition()[0] + velocity;
        getPosition()[1] = getPosition()[1] + velocity;
        height += (0.5 * getSpeed() * click);
    }

    @Override
    public void play() {
        super.play();
        musicOn();
    }
}

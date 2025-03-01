package lesson7;

class TV extends Device {
    void on() {
        System.out.println("TV is on.");
    }
    void off() {
        System.out.println("TV is off.");
    }
    void changeChannel(int newChannel) {
        System.out.println("Changing a channel to " + newChannel);
    }
}

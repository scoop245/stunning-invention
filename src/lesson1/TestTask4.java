package lesson1;

public class TestTask4 {
    public static void main(String[] args) {
        ElectricalToy toy = new ElectricalToy("beep", "yeelow", 3, 0, 0);
        Helicopter copter = new Helicopter("yeee", "green", 3, 0, 0, 0.0);
        toy.play();
        copter.setSong("Yohohoho");
        copter.play();
        toy.move(2);
        copter.move(2);
        for (int i : toy.getPosition()) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : copter.getPosition()) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(copter.getHeight());
    }
}

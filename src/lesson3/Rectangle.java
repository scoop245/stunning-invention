package lesson3;

class Rectangle {

    double height;
    double width;

    public Rectangle() {

    }
    public Rectangle(double height, double width) {
        this.width = width;
        this.height = height;
    }

    public double calculateSquare() {
        return height * width;
    }

    public double calculateSquare(int a) {
        return 2*4;
    }

    public double calculateSquare(double a) {
        return 2*4;
    }

    public double calculateSquare(float a) {
        return 2*4;
    }

    public double calculateSquare(double height, double width) {
        return height * width;
    }

    public double calculateSquare(String a) {
        return height * width;
    }

    public void printSides() {
        System.out.println("Height: " + height + ". Width: " + width + ".");
    }

}

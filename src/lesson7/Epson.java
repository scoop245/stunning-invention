package lesson7;

class Epson implements Printable {

    public void print(String text) {
        System.out.println(text);
    }

    public void scan(String text) {
        System.out.println(text);
    }

    @Override
    public int generateRandomNumber() {
        return 0;
    }
}

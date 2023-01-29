package cwiczenia.c20;

public class Ball {
    private double radius;
    private static int ballCounter = 0;

    public Ball(double radius) {
        this.radius = radius;
        ballCounter++;
    }

    public static Ball makeBall() {
        double random = Math.random() * (20 - 10) + 10;
        return new Ball(random);
    }

    public static void showCounter() {
        System.out.println("Liczba utworzonych kul: " + ballCounter);
    }

}

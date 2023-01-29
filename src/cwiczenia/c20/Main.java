package cwiczenia.c20;

public class Main {
    public static void main(String[] args) {
        Dzem d1 = new Dzem("Jagoda", 50.0);
        Dzem d2 = new Dzem(60.0);
        Dzem d3 = new Dzem("Truskawka");

        System.out.println(d1.getSmak() + " " + d1.getWaga());
        System.out.println(d2.getSmak());
        System.out.println(d3.getWaga());

        Ball b1 = Ball.makeBall();
        Ball b2 = Ball.makeBall();

        Ball.showCounter();

    }
}

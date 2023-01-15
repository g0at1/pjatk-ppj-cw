package c23;

public class Drzewo2 {

    public static Owoc zerwijOwoc() {
        int random = (int)(Math.random() * 3);
        if (random == 0) {
            return new Jablko();
        }
        else if (random == 1) {
            return new Pomarancza();
        }
        else {
            return new Gruszka();
        }
    }
}

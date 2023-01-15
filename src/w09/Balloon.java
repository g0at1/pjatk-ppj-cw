package w09;

public class Balloon {
    double weight;

    public Balloon(){
        this.weight = (Math.random() * (0.009 - 0.005)) + 0.005;
    }

    public void getWeight(){
        System.out.println("Weight: " + this.weight);
    }


}

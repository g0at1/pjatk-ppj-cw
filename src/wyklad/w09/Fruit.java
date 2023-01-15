package wyklad.w09;

public class Fruit {
    public String name;
    public double weight =((Math.random() * (0.8 - 0.5)) + 0.5);

    public Fruit(String name){
        this.name = name;
    }

    public void show(){
        System.out.println("Name: " + this.name + "\n" + "Weight: " + this.weight);
    }


}

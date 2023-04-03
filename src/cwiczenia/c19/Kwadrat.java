package cwiczenia.c19;

public class Kwadrat {
    private int bok;

    public Kwadrat(int bok){
        this.bok = bok;
    }

    public void show(){
        System.out.println(bok *  bok);
        System.out.println(bok * bok * bok);
    }

}

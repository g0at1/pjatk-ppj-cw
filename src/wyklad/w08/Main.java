package wyklad.w08;

public class Main {
    public static void main(String[] args) {

        Word w = new Word();

        for (int i = 0; i < 500; i++)
            w.addChar((char)('a' + Math.random() * 26));
        w.show();


    }
}

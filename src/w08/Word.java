package w08;

public class Word {
    private char[] tab;
    private int len;

    public Word() {
        tab = new char[100];
        len = 0;
    }

    public void addChar(char c) {
        if (len < tab.length)
            tab[len++] = c;
        else {
            char[] tmp = new char[tab.length*2];
            for (int i = 0; i < len; i++) {
                tmp[i] = tab[i];
            }
            tmp[len++] = c;

            tab = tmp;
        }
    }

    public void show() {
        for (int i = 0; i < tab.length; i++)
            System.out.println(tab[i]);
        System.out.print(" ");
    }
}

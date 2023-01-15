package c23;


public class Rakieta {
    protected String nazwa;
    protected int wagaPaliwa;


    public Rakieta(String nazwa,
                   int wagaPaliwa) {
        this.nazwa = nazwa;
        this.wagaPaliwa = wagaPaliwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getWagaPaliwa() {
        return wagaPaliwa;
    }

    public void setWagaPaliwa(int wagaPaliwa) {
        this.wagaPaliwa = wagaPaliwa;
    }

    public void zatankuj() {
        wagaPaliwa += (int)(Math.random() * 2000);
    }

    public void start() throws Exception {
        if (wagaPaliwa < 1000) {
            throw new Exception("start anulowany - za mało paliwa");
        }
        else {
            System.out.println("Startujemy");
        }

    }
}

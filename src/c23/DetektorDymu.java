package c23;

public class DetektorDymu {

    private boolean smokeDetected = true;

    public void sprawdz() throws Alarm {
        if (smokeDetected) {
            throw new Alarm("Wykryto dym!");
        }
    }
}

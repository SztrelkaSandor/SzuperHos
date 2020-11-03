public class Batman implements Szuperhos,Milliardos{

    public Batman() {
        lelemenyesseg=100;

    }
    private double lelemenyesseg;
    @Override
    public void kutyutKeszit() {
    lelemenyesseg+=50;
    }

    @Override
    public boolean legyozhetiE(String szuperhos) {
        if (<lelemenyesseg) {
            return true;
        }
        return false;
    }

    @Override
    public double mekkoraAzEreje() {
        return lelemenyesseg*2;
    }

    @Override
    public String toString() {
        return "Batman" +
                "lelemenyesseg=" + lelemenyesseg +
                "szuperero=" + lelemenyesseg*2 +
                '}';
    }
}

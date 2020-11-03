public abstract class Bosszuallo implements Szuperhos {
    private String szuperhos;

    public double getSzuperero() {
        return szuperero;
    }

    public void setSzuperero(double szuperero) {
        this.szuperero = szuperero;
    }

    public boolean isVanEGyengesege() {
        return vanEGyengesege;
    }

    public void setVanEGyengesege(boolean vanEGyengesege) {
        this.vanEGyengesege = vanEGyengesege;
    }

    private double szuperero;
    private boolean vanEGyengesege;

    protected Bosszuallo(double szuperero, boolean vanEGyengesege) {
        this.szuperero = szuperero;
        this.vanEGyengesege = vanEGyengesege;
    }

    @Override
    public boolean legyozhetiE(String szuperhos) {
        if (vanEGyengesege != true && szuperero<this.szuperero) {

                return false;

        }else if (szuperhos=="Batman" && szuperero<2*this.szuperero){
            return false;
        }
        return true;
    }

    @Override
    public double mekkoraAzEreje() {
        return szuperero;
    }

    public abstract boolean megmentiAVilagot();

    @Override
    public String toString() {
        return szuperhos+
                ": szuperero= " + szuperero +
                " van e gyengesege= " + vanEGyengesege;
    }
}

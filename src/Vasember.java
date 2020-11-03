public class Vasember extends Bosszuallo implements Milliardos{
    public Vasember(double szuperero, boolean vanEGyengesege) {
        super(szuperero, vanEGyengesege);
        szuperero=this.szuperero;
        vanEGyengesege=true;

    }
    private double szuperero=150;
    @Override
    public boolean megmentiAVilagot() {
        if (szuperero > 1000) {
            return true;
        }
        return false;
    }


    public void kutyutKeszit() {

        szuperero+=(Math.random()*11);
    }

    @Override
    public String toString() {
        return "Vasember{" +
                "szuperero=" + szuperero +
                '}';
    }
}

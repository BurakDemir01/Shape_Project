package shapeProject;

public class Ucgen implements IIslem{
    // TODO Bu class doldurunuz
    private double k1;
    private double k2;
    private double k3;

    public Ucgen(double k1, double k2, double k3) {
        setK1(k1);
        setK2(k2);
        setK3(k3);
    }

    public double getK1() {
        return k1;
    }
    public void setK1(double k1) {
        this.k1 = k1;
    }
    public double getK2() {
        return k2;
    }
    public void setK2(double k2) {
        this.k2 = k2;
    }
    public double getK3() {
        return k3;
    }
    public void setK3(double k3) {
        this.k3 = k3;
    }

    @Override
    public double alanHesapla() {
        double s=(this.k1+this.k2+this.k3)/2;
        double a=(s*(s-this.k1)*(s-this.k2)*(s-this.k3));
        return Math.sqrt(a);
    }
    @Override
    public double cevreHesapla() {
        return this.k1+this.k2+this.k3;
    }
    @Override
    public String toString() {
        return "Ucgen{" +
                "k1=" + k1 +
                ", k2=" + k2 +
                ", k3=" + k3 +
                '}';
    }
}

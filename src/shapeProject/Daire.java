package shapeProject;

public class Daire implements IIslem{
// TODO Bu class doldurunuz

    private double yaricap;
    public Daire(double yaricap) {
        setYaricap( yaricap);
    }
    public double getYaricap() {
        return yaricap;
    }
    public void setYaricap(double yaricap) {
        this.yaricap = yaricap;
    }
    @Override
    public double alanHesapla() {
        return Math.PI*this.yaricap*this.yaricap;
    }
    @Override
    public double cevreHesapla() {
        return 2*Math.PI*this.yaricap;
    }
    @Override
    public String toString() {
        return "Daire{" +
                "yaricap=" + yaricap +
                '}';
    }
}

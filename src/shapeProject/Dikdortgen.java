package shapeProject;

public class Dikdortgen implements IIslem {
    // TODO Bu class doldurunuz
    private double uzunKenar;
    private double kisaKenar;

    public Dikdortgen(double uzunKenar, double kisaKenar) {
        setUzunKenar(uzunKenar);
        setKisaKenar(kisaKenar);
    }
    public double getUzunKenar() {
        return uzunKenar;
    }
    public void setUzunKenar(double uzunKenar) {
        this.uzunKenar = uzunKenar;
    }
    public double getKisaKenar() {
        return kisaKenar;
    }
    public void setKisaKenar(double kisaKenar) {
        this.kisaKenar = kisaKenar;
    }
    @Override
    public double alanHesapla() {
        return this.kisaKenar * this.uzunKenar;
    }
    @Override
    public double cevreHesapla() {
        return (this.kisaKenar + this.uzunKenar) * 2;
    }
    @Override
    public String toString() {
        return "Dikdortgen{" +
                "uzunKenar=" + uzunKenar +
                ", kisaKenar=" + kisaKenar +
                '}';
    }
}

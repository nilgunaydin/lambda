package proje;

public class ogrenci {
    private String isim;
    private String soyIsim;
    private int yas;
    private double diplomaNot;
    private String cinsiyet;



    @Override
    public String toString() {
        return "ogrenci{" +
                "isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", yas=" + yas +
                ", diplomaNot=" + diplomaNot +
                ", cinsiyet='" + cinsiyet + '\'' +
                '}';
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public double getDiplomaNot() {
        return diplomaNot;
    }

    public void setDiplomaNot(double diplomaNot) {
        this.diplomaNot = diplomaNot;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public ogrenci(String isim, String soyIsim, int yas, double diplomaNot, String cinsiyet) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.yas = yas;
        this.diplomaNot = diplomaNot;
        this.cinsiyet = cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }
}

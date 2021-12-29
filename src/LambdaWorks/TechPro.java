package LambdaWorks;

public class TechPro {
  private  String batch;
  private  String batchname;
  private  int batchOrt;
  private int ogrenciSayisi;

    @Override
    public String toString() {
        return "TechPro{" +
                "batch='" + batch + '\'' +
                ", batchname='" + batchname + '\'' +
                ", batchOrt=" + batchOrt +
                ", ogrenciSayisi=" + ogrenciSayisi +
                '}';
    }

    public TechPro(String batch, String batchname, int batchOrt, int ogrenciSayisi) {
        this.batch = batch;
        this.batchname = batchname;
        this.batchOrt = batchOrt;
        this.ogrenciSayisi = ogrenciSayisi;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getBatchname() {
        return batchname;
    }

    public void setBatchname(String batchname) {
        this.batchname = batchname;
    }

    public int getBatchOrt() {
        return batchOrt;
    }

    public void setBatchOrt(int batchOrt) {
        this.batchOrt = batchOrt;
    }

    public int getOgrenciSayisi() {
        return ogrenciSayisi;
    }

    public void setOgrenciSayisi(int ogrenciSayisi) {
        this.ogrenciSayisi = ogrenciSayisi;
    }
}


package uts_pbo;

public class Product {
    //1 buah atribute memiliki getter dan setter
    private String Jenis;
    private int Ukuran;
    private int Warna;

    public String getJenis() {
        return Jenis;
    }
    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }
    public int getUkuran() {
        return Ukuran;
    }
    public int setUkuran(int Ukuran) {
        this.Ukuran = Ukuran;
        return Ukuran;
    }
    
    public int getWarna() {
        return Warna;
    }
    public int setWarna(int Warna) {
        this.Warna = Warna;
        return Warna;
    }
}


package uts_pbo;

class product {
    public String Jenis ;
    public int Ukuran ;
    public int Warna ;

    public void Jenis(){
        System.out.println("Jenis Produk");
    }

    public int Ukuran(){
        System.out.println("Ukuran Produk");
        return this.Ukuran;
    }

    public int Warna(){
        System.out.println("Warna Produk");
        return this.Warna;
    }
}

class isi extends product { 

    public void Input (){
        System.out.println("Silahkan input / masukkan produk");
    }
}

class lihat extends product { 

    public void Input (){
        System.out.println("Kami akan menampikan priduk");
    }
}

public class UTS_PBO {
     public static void main(String[] args) {
        product p = new product();
        isi i = new isi();
        lihat l = new lihat();
        
        System.out.println("PABRIK XYZ");
        System.out.println(" ");
        System.out.println("Anda dapat : ");
        System.out.println("1. Input / Mengisi Produk");
        System.out.println("2. Tampilkan Produk");
        System.out.println("===========================");
        
        
        System.out.println("Menginput Produk ");
        p.Jenis();
        System.out.println("Ukuran = "+ p.Ukuran());
        System.out.println("Ukuran = "+ p.Warna());
        System.out.println("===========================");
        
        System.out.println("Menampilkan Produk ");
        p.Jenis();
        System.out.println("Ukuran = "+ p.Ukuran());
        System.out.println("Ukuran = "+ p.Warna());
        System.out.println("===========================");
        

    }
}

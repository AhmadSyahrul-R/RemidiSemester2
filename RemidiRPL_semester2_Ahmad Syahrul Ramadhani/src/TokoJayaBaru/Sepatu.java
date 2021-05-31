/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TokoJayaBaru;

/**
 *
 * @author user
 */
public class Sepatu {
      
    protected double harga;
    protected String merk, jenis, warna;
    protected int ukuran;
    
    public Sepatu(String merk, String jenis, String warna, int ukuran, double harga){
        this.merk = merk;
        this.jenis = jenis;
        this.warna = warna;
        this.ukuran = ukuran;
        this.harga = harga;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getUkuran() {
        return ukuran;
    }

    public void setUkuran(int ukuran) {
        this.ukuran = ukuran;
    }
    
}

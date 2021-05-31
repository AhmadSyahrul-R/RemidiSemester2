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
public class SepatuSantai extends Sepatu{
    protected String kategori = "Santai";
    
    public SepatuSantai(String merk, String jenis, String warna, int ukuran, double harga){
        super(merk, jenis, warna, ukuran, harga);
    }
    
    public void showSantai(){
        System.out.println("=======+++++++=======");
        System.out.println("Kategori Sepatu: Santai");
        System.out.println("Merk Sepatu: " + this.merk);
        System.out.println("Jenis Sepatu: " + this.jenis);
        System.out.println("Warna Sepatu: " + this.warna);
        System.out.println("Ukuran Sepatu: " + this.ukuran);
        System.out.println("Harga Sepatu: " + this.harga);
        System.out.println("=======+++++++=======");
    }
}

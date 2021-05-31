/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TokoJayaBaru;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    static double hitungDiskon(int jumlahpembelian){
        
        double result = 0;
        
        if(jumlahpembelian == 2){
            result = 50000.0;
        }else if(jumlahpembelian == 3){
            result = 100000.0;
        }
        return result;
    }
    
    static SepatuOR SepatuOR = new SepatuOR("Adidas", "Perempuan", "Black", 30, 500000);
    static SepatuKantoran SepatuKTR = new SepatuKantoran("Fila", "Perempuan", "Black", 30, 700000);
    static SepatuSantai SepatuSNT = new SepatuSantai("Skechers", "Perempuan", "White", 30, 900000);
        
    public static void main(String[] args) {
        
        int jumlahpembelian, norpil;
        double totalharga;
        double harga = 0;
        
        
        System.out.println("Daftar Beli Toko JayaBaru");
        System.out.println("==========");
        System.out.println("Tanggal Pembelian: 28 Mei 2021");
        System.out.println("==========");
        
        System.out.println("Berikut Merupakan Daftar Sepatu Yang Bisa Dibeli: ");
        System.out.println("\n1. Sepatu Pertama:");
        SepatuOR.showOlahraga();
        System.out.println("\n2. Sepatu Kedua:");
        SepatuKTR.showKantoran();
        System.out.println("\n3. Sepatu Ketiga:");
        SepatuSNT.showSantai();
        
        System.out.println("\n");
        System.out.println("==========");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Silahkan Input Nomor Pilihan Anda: ");
        norpil = scanner.nextInt();
        
        switch(norpil){
            case 1: 
                harga = SepatuOR.getHarga(); 
                break;
            case 2: 
                harga = SepatuKTR.getHarga(); 
                break;
            case 3: 
                harga = SepatuSNT.getHarga(); 
                break;
        }      
        
        System.out.println("==========");
        System.out.println("\n");
        System.out.print("Silahkan Input Jumlah Barang Yang Dibeli: ");
        jumlahpembelian = scanner.nextInt();
        System.out.println("==========");
        
        totalharga = harga*jumlahpembelian - hitungDiskon(jumlahpembelian);
        System.out.println("Harga Satuan: "+harga + "\n" + "Jumlah pembelian anda: "+jumlahpembelian);
        System.out.println("Diskon anda: "+hitungDiskon(jumlahpembelian));
        System.out.println("Berikut Merupakan Total Harga Beli Anda: "+totalharga);
    }
    
}

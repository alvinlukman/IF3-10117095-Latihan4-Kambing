/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if3.pkg10117095.latihan4.kambing;

/**
 *
 * @author 
 * NAMA         : Alvin Lukman Nulhakim
 * KELAS        : IF-3
 * NIM          : 10117095
 * Deklarasi    : Proram ini bisa Menambahkan Jumlah Kambing
 */
public class IF310117095Latihan4Kambing {

    public void tambahKambing () {
      //Deklarasi variabel lokal
      int jumlahKambing = 0;
      
      jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: " +
                           jumlahKambing);
    }
    
   public static void main(String[] args)  {
    IF310117095Latihan4Kambing KambingJantan = new IF310117095Latihan4Kambing();
    KambingJantan.tambahKambing();
    }
    
}

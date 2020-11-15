/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k10119918latihan55handphone;

/**
 *
 * @author 
 * NAMA      : Andreas Suryadi
 * KELAS     : IF-10K
 * NIM       : 10119918
 * Deskripsi Program : Program ini bertujuan untuk menampilkan data handphone
 * menggunakan sistem overriding constructor
 * 
 */

public class PBO10K10119918Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Android android = new Android("Samsung", "Android", "Grand", 3000000);
        BlackBerry blackBerry = new BlackBerry("BlackB", "RIM", "Curve", 2000000);
        WindowsPhone windowsPhone = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        
        android.setKeyStore("234ibfd3840fo");
        android.displayProduct();
        System.out.println("Android Key Store : " + android.getKeyStore());
        
        System.out.println();
        
        blackBerry.setPinBB("BHS249");
        blackBerry.displayProduct();
        System.out.println("PIN : " + blackBerry.getPinBB());
        
        System.out.println();
        
        windowsPhone.setWpKeyStore("UUUQIJWORJ");
        windowsPhone.displayProduct();
        System.out.println("Wp Key Store : " + windowsPhone.getWpKeyStore());
    }
    
}

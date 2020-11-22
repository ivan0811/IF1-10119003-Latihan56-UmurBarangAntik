package com.ivanfaathirza;

/**
 *
 * @author
 * NAMA     : Ivan Faathirza
 * KELAS    : IF1
 * NIM      : 10119003
 * Deskripsi Program: menampilkan umur barang antik menggunakan konsep inheritance dan polymorphism
 */

public class Main {

    public static void main(String[] args) {
	    Radio radio = new Radio(234);
	    radio.setName("Radio AM");
	    System.out.println("Nama Barang Antik : "+radio.getName());
		radio.tampilUmur();
    }
}

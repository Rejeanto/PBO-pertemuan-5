package com.pboreg;

public class Main {

    public static void main(String[] args) {
	// write your code here
            Class obil = new Class();
            System.out.println("Nilai A = " + obil.tampilkana());
            System.out.println("Nilai B = " + obil.tampilkanb());
            System.out.println("Nilai C = " + obil.tampilkanc());

        obil.inputa(100);
        System.out.println("Nilai A setelah diinput = " +obil.tampilkana());
        obil.inputb(200);
        System.out.println("Nilai B setelah diinput = " +obil.tampilkanb());
        obil.inputc(300);
        System.out.println("Nilai C setelah diinput = " +obil.tampilkanc());

        System.out.println("Hasil Tambah = " +obil.tambah());
        System.out.println("Hasil Kurang = " +obil.kurang());
        System.out.println("Hasil Kali = " +obil.kali());
        System.out.println("Hasil Bagi = " +obil.bagi());
    }
}

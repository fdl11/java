package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nama;
        int pil, no_tpt;
        Menu menu = new Menu();
        Bayar bayar = new Bayar();
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat Datang di Kedai ABC");
        System.out.print("Siapa nama anda ?? ");
        nama = input.next();
        System.out.println("\nHalo " + nama + "...");
        System.out.println("Berikut adalah daftar menu yang tersedia di kedai ABC");
        menu.daftarMenu();

        System.out.print("Masukkan nomor makanan/minuman yang dipesan      : ");
        pil = input.nextInt();

        System.out.print("Silahkan pilih nomor meja [1/2/3/4]              : ");
        no_tpt = input.nextInt();

        menu.pilihMenu(pil);
        System.out.println("\n");
        bayar.totalBayar(pil);
    }
}

package com.company;

public class Menu {
    Bakso bakso = new Bakso();
    Mie mie = new Mie();
    esTeh steh = new esTeh();

    public void daftarMenu() {
        System.out.println("+---------------------------------------+");
        System.out.println("|       [ DAFTAR MENU KEDAI ABC ]       |");
        System.out.println("+---------------------------------------+");
        System.out.println("|   1. Bakso            < Rp 10.000 >   |");
        System.out.println("|   2. Mie Ayam         < Rp 12.000 >   |");
        System.out.println("|   3. Es Teh           < Rp  4.000 >   |");
        System.out.println("+---------------------------------------+");
    }

    public void pilihMenu(int pil) {
        if (pil == 1) {
            bakso.buatBakso();
        } else if (pil == 2) {
            mie.buatMie();
        } else if (pil == 3) {
            steh.buatEsTeh();
        } else {
            System.exit(0);
        }
    }
}

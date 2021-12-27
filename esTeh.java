package com.company;
import java.util.Scanner;

public class esTeh implements Minuman{
    Scanner input = new Scanner(System.in);
    private int pil;

    public void buatEsTeh(){
        gelas();
        tuang();
        aduk();
    }

    @Override
    public void gelas() {
        do {
            System.out.print("\nSiapkan Gelas...   >> ");
            pil = input.nextInt();

            if(pil == 1) {
                System.out.println("Gelas berhasil disiapkan...");
            } else{
                System.out.println("Gelas gagal disiapkan...");
            }
        } while (pil != 1);
    }

    @Override
    public void tuang() {
        do {
            System.out.print("\nTuangkan teh...   >> ");
            pil = input.nextInt();

            if(pil == 1) {
                System.out.println("teh berhasil dituangkan..");
            } else{
                System.out.println("teh gagal dituangkan...");
            }
        } while (pil != 1);
    }

    @Override
    public void aduk() {
        do {
            System.out.print("\nTambahkan gula dan aduk  >> ");
            pil = input.nextInt();

            if(pil == 1) {
                System.out.println("Gula sudah ditambahkan dan diaduk...");
            } else{
                System.out.println("Gula gagal ditambahkan dan diaduk...");
            }
        } while (pil != 1);
    }
}

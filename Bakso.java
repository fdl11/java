package com.company;
import java.util.Scanner;

public class Bakso implements Makanan{
    private int pil;
    Scanner input = new Scanner(System.in);

    public Bakso(){}

    public void buatBakso(){
        System.out.println("\nProses Membuat Bakso...");
        wadah();
        tuang();
        alat();
        sambal();
    }

    @Override
    public void wadah() {
        do {
            System.out.print("\nSiapkan Mangkuk...   >> ");
            pil = input.nextInt();

            if(pil == 1) {
                System.out.println("Mangkuk berhasil disiapkan...");
            } else{
                System.out.println("Mangkuk gagal disiapkan...");
            }
        } while (pil != 1);
    }

    @Override
    public void tuang() {
        do {
            System.out.println("\nTuangkan bakso, pangsit, mie, tahu, dan bawang goreng... ");
            System.out.print("Kemudian tuangkan kuah bakso...   >> ");
            pil = input.nextInt();

            if(pil == 1) {
                System.out.println("Bakso berhasil dituangkan ke mangkok");
            } else{
                System.out.println("Bakso gagal dituangkan ke mangkok");
            }
        } while (pil != 1);
    }

    @Override
    public void alat() {
        do {
            System.out.print("\nBerikan sendok dan garpu ke dalam mangkok...   >> ");
            pil = input.nextInt();

            if(pil == 1) {
                System.out.println("Sendok dan garpu berhasil di taruh ke mangkok");
            } else{
                System.out.println("Sendok dan garpu gagal di taruh ke mangkok");
            }
        } while (pil != 1);
    }

    @Override
    public void sambal() {
        do {
            System.out.print("\nTambahkan sambal dan saus...   >> ");
            pil = input.nextInt();

            if(pil == 1) {
                System.out.println("Sambal berhasil ditambahkan...");
            } else{
                System.out.println("Sambal gagal ditambahkan...");
            }
        } while (pil != 1);
    }
}

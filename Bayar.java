package com.company;

public class Bayar {
    int bs = 10000, mi = 12000, sth = 4000;
    public Bayar(){}

    public void totalBayar(int pil){
        if(pil == 1){
            System.out.println("Total biaya anda adalah : " + bs);
        } else if(pil == 2){
            System.out.println("Total biaya anda adalah : " + mi);
        } else if(pil == 3){
            System.out.println("Total biaya anda adalah : " + sth);
        } else {
            System.exit(0);
        }
    }
}

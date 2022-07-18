package com.company;

public class Class {
    private int nomer;
    private String soz;
    private int[] massiv;

    public Class(int nomer, String soz, int[] massiv) {
        this.nomer = nomer;
        this.soz = soz;
        this.massiv = massiv;
    }

    public void getNomer() {
        System.out.println(nomer);
    }

    public void getSoz() {
        System.out.println(soz);
    }

    public void getMassiv() {
        for (int a : massiv) {
            System.out.print(" " + a);
        }
    }
}

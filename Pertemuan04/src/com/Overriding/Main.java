package com.Overriding;

public class Main {
    
    public static void main(String[] args) {

        Kucing kucing = new Kucing();
        kucing.suara();

        bebek bebek = new bebek();
        bebek.suara();

        burung burung = new burung();
        burung.suara();
    }
}

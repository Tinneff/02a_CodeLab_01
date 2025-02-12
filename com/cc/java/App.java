package com.cc.java;

public class App {
    
    public static void main(String[] args) {
    
        Konto konto1 = new Konto(10000);
        Konto konto2 = new Konto(10000);
        Konto konto3 = new Konto(10000);

        output("Konto1: " + konto1.getKontostand());
        output("Konto2: " + konto2.getKontostand());
        output("Konto3: " + konto3.getKontostand());  
        
        System.out.println("-----------------------------");

        konto1.setKontostand(konto1.getKontostand()*2);
        konto2.setKontostand(konto2.getKontostand()*3);
        konto3.setKontostand(konto3.getKontostand()*10);

        output("Konto1: " + konto1.getKontostand());
        output("Konto2: " + konto2.getKontostand());
        output("Konto3: " + konto3.getKontostand());  
    }


    public static void output(String outputStr) {
        System.out.println(outputStr);
    } 

}
Footer
© 2023 GitHub, Inc.
Footer navigation

    Terms
    Privacy
    Security
    Status
    Docs
    Contact GitHub
    Pricing
    API
    Training
    Blog
    About


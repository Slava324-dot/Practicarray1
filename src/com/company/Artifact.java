package com.company;

public class Artifact {
    int num, fox;
    String cult;

    public Artifact (int numer, String culture, int foxx) {
        num = numer;
        fox = foxx;
        cult = culture;

    }
    public Artifact (int numer, String culture) {
        num = numer;
        cult = culture;
    }

    public Artifact (int numer) {
        num = numer;

    }



    public static void main(String[] args) {

    Artifact one = new Artifact(1);
    Artifact two = new Artifact(2, "Aztec");
    Artifact there = new Artifact(3, "Aztec", 12);

    System.out.println("Порядковый номер: " + one.num) ;
    System.out.println("Порядковый номер: " + two.num + " Культура: " + two.cult);
    System.out.println("Порядковый номер: " + there.num + " Культура: " + there.cult + " Век: " + there.fox);








    }
}
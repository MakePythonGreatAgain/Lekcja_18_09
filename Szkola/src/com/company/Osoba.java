package com.company;

public abstract class Osoba {
    // (!!!) NOTATKA
    // abstrakcyjna klasa nie pozwala na tworzenie obiektów tej samej klasy

    protected String imie;
    private int wiek;

    public Osoba(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    public Osoba(String imie) {
        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }

    public String getImie() {
        return imie;
    }
}
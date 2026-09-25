package com.company;

import java.util.ArrayList;

public class Szkola {
    private String nazwaSzkoly;
    private ArrayList<Uczen> uczniowie = new ArrayList<Uczen>(); //do przemyślenia czy potrzebne
    private ArrayList<Klasa> Klasy = new ArrayList<Klasa>();
    private ArrayList<Nauczyciel> Nauczyciele = new ArrayList<Nauczyciel>();
    private static Szkola szkola;

    private Szkola(String nazwaSzkoly) {
        this.nazwaSzkoly = nazwaSzkoly;
    }

    public static Szkola getSzkola(String Nazwa) {
        if(szkola == null){
            szkola = new Szkola(Nazwa);
        }
        return szkola;
    }

    public void dodajKlase(Klasa klasa){
        Klasy.add(klasa);

    }
    public void dodajNauczyciela(Nauczyciel nauczyciel){
        Nauczyciele.add(nauczyciel);

    }

    public void przepiszUczniaZKlasyDoKlasy(Uczen uczen,Klasa KlasaDocelowa){
        for(Klasa klasa : Klasy){   //foreach
            if(klasa.getUczniowie().contains(uczen)){
                klasa.UsunUczniaZKlasy(uczen);
                break;
            }
        }
        klasaDocelowa.dodajUczniaDoKlasy(uczen);


    }
    public void dodajNowegoUczniaDoSzkoly(String imie, int wiek, Klasa klasa){
        Uczen uczen = new Uczen(imie, wiek);
        uczniowie.add(uczen);
        klasa.dodajUczniaDoKlasy(uczen);

    }
    public void dodajUczniaBezKlasy(Uczen uczen){
        uczniowie.add(uczen);

    }

    @Override
    public String toString() {
        return "Szkola{" +
                "nazwaSzkoly='" + nazwaSzkoly + '\'' +
                '}';
    }
}

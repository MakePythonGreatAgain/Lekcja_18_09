package com.company;

import java.util.ArrayList;

public class Klasa {
    private ArrayList<Uczen> uczniowie;
    private Wychowawca wychowawca;
    private String nazwa;
    private int poziom;

    public Klasa(Wychowawca wychowawca, int poziom,String kierunek) {
        this.wychowawca = wychowawca;
        this.poziom = poziom;
        nazwa = kierunek + poziom;
        uczniowie = new ArrayList<Uczen>();
    }
    public boolean DodajUczniaDoKlasy{
        if(uczniowie.contains(uczen)){
            System.out.println(uczen + " Jest w tej klasie");
            return false;
        }
        uczniowie.add(uczen);
        return true;
    }

    @Override
    public String toString() {
        return "Klasa{" +
                "uczniowie=" + uczniowie +
                ", wychowawca=" + wychowawca +
                ", nazwa='" + nazwa + '\'' +
                ", poziom=" + poziom +
                ", DodajUczniaDoKlasy=" + DodajUczniaDoKlasy +
                '}';
    }

    public void WypiszInfo(){
        System.out.println("Klasa: " + nazwa);
        System.out.println("Wychowawca: " + wychowawca.imie);
        for(int i = 0; i < uczniowie.size(); i++){
            System.out.println("Uczen " + i + ": " +  uczniowie.get(i));
        }


    }
}

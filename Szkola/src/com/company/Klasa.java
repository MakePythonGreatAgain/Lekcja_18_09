package com.company;

import java.util.ArrayList;

public class Klasa {
    private ArrayList<Uczen> uczniowie;
    private Wychowawca wychowawca;
    private String nazwa;
    private int poziom;

    public Klasa(Wychowawca wychowawca, int poziom, String kierunek) {
        this.wychowawca = wychowawca;
        this.poziom = poziom;
        nazwa = kierunek + poziom;
        uczniowie = new ArrayList<Uczen>();
    }

    public ArrayList<Uczen> getUczniowie() {
        return uczniowie;
    }
    public void UsunUczniaZKlasy(Uczen uczen){
        if(uczniowie.contains(uczen)){
            uczniowie.remove(uczen);
        }

    }

    // Dodano brakujące argumenty i nawiasy do metody
    public boolean dodajUczniaDoKlasy(Uczen uczen) {
        if(uczniowie.contains(uczen)){
            System.out.println(uczen.getImie() + " Jest w tej klasie");
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
                '}';
    }

    public void wypiszInfo(){
        System.out.println("Klasa: " + nazwa);
        // Lepiej uzyc akcesora getter
        System.out.println("Wychowawca: " + wychowawca.getImie());
        for(int i = 0; i < uczniowie.size(); i++){
            System.out.println("Uczen " + (i+1) + ": " +  uczniowie.get(i));
        }
    }
}
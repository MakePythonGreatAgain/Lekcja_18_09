package com.company;

public class Main {
    public static void main(String[] args) {
        // Osoba osoba = new Osoba("Jaś", 7);
        // TO JEST BŁĄD, bo nie można utworzyć obiektu klasy abstrakcyjnej!

        Osoba uczen = new Uczen("Edek", 5);
        Uczen uczen1 = new Uczen("Ala", 7);

        System.out.println(uczen);
        System.out.println(uczen1);
        Wychowawca wychowawca1P = new Wychowawca("Zygmunt", "wf");
        System.out.println(wychowawca1P);
        Klasa Klasa1P = new Klasa(wychowawca1P, 1, "P");
        Klasa1P.dodajUczniaDoKlasy(uczen1);
        Klasa1P.dodajUczniaDoKlasy(uczen2);
        System.out.println(Klasa1P);
    }
}
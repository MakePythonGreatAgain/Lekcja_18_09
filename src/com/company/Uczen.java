package com.company;

public class Uczen extends Osoba implements Dyzurny {
    private static int liczbaUcznia = 0; // Licznik wszystkich utworzonych uczniów
    private int nrUcznia;

    // Poprawiony i uzupełniony konstruktor
    public Uczen(String imie, int wiek) {
        super(imie, wiek);          // Wywołanie konstruktora klasy bazowej (Osoba)
        liczbaUcznia++;             // Zwiększamy ogólną liczbę uczniów o 1
        this.nrUcznia = liczbaUcznia; // Przypisujemy unikalny numer bieżącemu uczniowi
    }

    public int getNrUcznia() {
        return nrUcznia;
    }

    public static int getLiczbaUcznia() {
        return liczbaUcznia;
    }

    // Przesłonięcie metody toString, aby println wyświetlał czytelne informacje o uczniu
    @Override
    public String toString() {
        return "Uczen [nrUcznia=" + nrUcznia + ", imie=" + imie + ", wiek=" + getWiek() + "]";
    }
        @Override
    public void wykonajDyzur(){
            System.out.println("Ucz sie");
        }
}
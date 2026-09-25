//package com.company;
//
//public class Main {
//    public static void main(String[] args) {
//        // Osoba osoba = new Osoba("Jaś", 7);
//        // TO JEST BŁĄD, bo nie można utworzyć obiektu klasy abstrakcyjnej!
//
//        Osoba uczen = new Uczen("Edek", 5);
//        Uczen uczen1 = new Uczen("Ala", 7);
//
//        System.out.println(uczen);
//        System.out.println(uczen1);
//        Wychowawca wychowawca1P = new Wychowawca("Zygmunt", "wf");
//        System.out.println(wychowawca1P);
//        Klasa Klasa1P = new Klasa(wychowawca1P, 1, "P");
//        Klasa1P.dodajUczniaDoKlasy(uczen1);
//        Klasa1P.dodajUczniaDoKlasy(uczen2);
//        System.out.println(Klasa1P);
//    }
//}
//
//
package com.company;

public class Main {

    public static void main(String[] args) {
        //Osoba osoba = new Osoba("Jaś",7); nie można tworzyć obiektu klasy abstrakcyjnej
        // Osoba osoba = new Osoba("Jaś", 7);
        // TO JEST BŁĄD, bo nie można utworzyć obiektu klasy abstrakcyjnej!
        Osoba uczen = new Uczen("Edek",8);

        Uczen uczen1 = new Uczen("Ala",7);
        Uczen uczen2 = new Uczen("Ela",7);
        Uczen uczen3 = new Uczen("Ola",7);
        System.out.println(uczen);
        System.out.println(uczen1);
        Wychowawca wychowawca1P = new Wychowawca("Zygmund","wf");
        System.out.println(wychowawca1P);
        uczen1.wykonajDyzur();
        wychowawca1P.wykonajDyzur();
        Klasa klasa1P = new Klasa(wychowawca1P,1,"P");
        klasa1P.dodajUczniaDoKlasy(uczen1);
        klasa1P.dodajUczniaDoKlasy(uczen1);
        klasa1P.dodajUczniaDoKlasy(uczen2);
        klasa1P.dodajUczniaDoKlasy(uczen3);
        System.out.println(klasa1P);

        klasa1P.wypiszInfo();
        Szkola szkola = Szkola.getSzkola("Mechanik TG");
        System.out.println(szkola);
        szkola = Szkola.getSzkola("Jakas inna szkola");
        System.out.println(szkola);
        //(!!!) Singleton (?)
    }
}


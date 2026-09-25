//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj tytul: ");
    String tytul = scanner.next();
    System.out.println("Podaj tresc: ");
    String tresc = scanner.next();
    Notatka notatka = new Notatka(tytul, tresc);
    System.out.println("sprawdzanie metody wpisującek");
    notatka.wyswietlTytulTresc();
    System.out.println("sprawdzanie metody diagnostycznej");
    notatka.diagnostyczna();

    System.out.println("2 notatka: ");
    tytul = scanner.next();
    System.out.println("Podaj tresc: ");
    tresc = scanner.next();
    Notatka notatka2 = new Notatka(tytul, tresc);
    System.out.println("sprawdzanie metody wpisującek");
    notatka2.wyswietlTytulTresc();
    System.out.println("sprawdzanie metody diagnostycznej");
    notatka2.diagnostyczna();


    }


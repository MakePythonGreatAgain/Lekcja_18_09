public abstract class Osoba {
    //(!!!) NOTATKA
    //abstrakcyjna klasa nie pozwala na tworzenie obiektów tej samej klasy

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


    //(!!!) NOTATKA
    //modefikatory dostępnu
    //public - dostępnie wszędzie
    //private - dostępne tylko w tej klasie
    //protected - oznacza że jest dostępne w tej klasie i w klasie z niej dziedziczącej
    //ALE w java jest dostępne w całym pakiecie
    //Brak modefikatora oznacza dostęp w pakiecie

}

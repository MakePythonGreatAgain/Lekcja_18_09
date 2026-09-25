public class Notatka {
    private static int licznikNotatek;  //podpunkt 1
    private int indetyfikator; //podpunkt 2 //podpunkt 4 (private int i protected String)
    protected String tytulNotatki;
    protected String trescNotatki;    //podpunkt 3

    //podpunkt 5
    public Notatka(String tytulNotatki, String trescNotatki) {
        this.tytulNotatki = tytulNotatki;
        this.trescNotatki = trescNotatki;
        licznikNotatek++;
        indetyfikator = licznikNotatek;
    }
    //podpunkt 6
    public void wyswietlTytulTresc(){
        System.out.println("tytul " + tytulNotatki + "tresc " + trescNotatki);
    }
    public void diagnostyczna(){
        System.out.println(tytulNotatki+"; " +trescNotatki+ "; "+ indetyfikator+ "");
    }
}



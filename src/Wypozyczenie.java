public class Wypozyczenie {
    private String nazwiskoWypozyczajacego;
    private Pojazd pojazd;

    public Wypozyczenie(String nazwiskoWypozyczajacego, Pojazd pojazd) {
        this.nazwiskoWypozyczajacego = nazwiskoWypozyczajacego;
        this.pojazd = pojazd;
    }

    public String getNazwiskoWypozyczajacego() {
        return nazwiskoWypozyczajacego;
    }

    public Pojazd getPojazd() {
        return pojazd;
    }
}

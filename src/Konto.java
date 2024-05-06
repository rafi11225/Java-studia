package pl.pp;

public class Konto {
    private String numerKonta;
    private double stanKonta;
    private String nazwaWlasciciela;
    private String emailWlasciciela;
    private String numerWlasciciela;

    public Konto() {

    }

    public Konto(String numerKonta, double stanKonta, String nazwaWlasciciela, String emailWlasciciela, String numerWlasciciela) {
        this.numerKonta = numerKonta;
        this.stanKonta = stanKonta;
        this.nazwaWlasciciela = nazwaWlasciciela;
        this.emailWlasciciela = emailWlasciciela;
        this.numerWlasciciela = numerWlasciciela;
    }

    public String getNumerKonta() {
        return numerKonta;
    }

    public void setNumerKonta(String numerKonta) {
        this.numerKonta = numerKonta;
    }

    public double getStanKonta() {
        return stanKonta;
    }

    public void setStanKonta(double stanKonta) {
        this.stanKonta = stanKonta;
    }

    public String getEmailWlasciciela() {
        return emailWlasciciela;
    }

    public void setEmailWlasciciela(String emailWlasciciela) {
        this.emailWlasciciela = emailWlasciciela;
    }

    public String getNazwaWlasciciela() {
        return nazwaWlasciciela;
    }

    public void setNazwaWlasciciela(String nazwaWlasciciela) {
        this.nazwaWlasciciela = nazwaWlasciciela;
    }

    public String getNumerWlasciciela() {
        return numerWlasciciela;
    }

    public void setNumerWlasciciela(String numerWlasciciela) {
        this.numerWlasciciela = numerWlasciciela;
    }

    public void zasilKonto(double kwotaZasilenia) {
        this.stanKonta += kwotaZasilenia;
        System.out.printf("Wpłata na konto: %,.2f PLN. Nowy stan konta: %,.2f PLN", kwotaZasilenia, stanKonta).println();
    }

    public void wyciagKonto(double kwotaWyplaty) {
        if(kwotaWyplaty > this.stanKonta) {
            System.out.printf("Brak wystarczających środków na koncie. Aktualny stan konta: %,.2f PLN", stanKonta).println();
        } else {
            this.stanKonta -= kwotaWyplaty;
            System.out.printf("Wypłata z konta: %,.2f PLN. Nowy stan konta: %,.2f PLN", kwotaWyplaty, stanKonta).println();
        }
    }
}

package pl.pp;

public class mojaOsmaAplikacja {
    public static void main(String[] args) {
        Konto konto1 = new Konto();
        konto1.setNumerKonta("52138812765512");
        konto1.setEmailWlasciciela("wlasciciel@gmail.pl");
        konto1.setNazwaWlasciciela("Wiktor Wlasciciel");
        konto1.setStanKonta(1000.00);
        konto1.setNumerWlasciciela("521341211");

        System.out.println("Konto: "+ konto1.getNazwaWlasciciela() + " ("+ konto1.getEmailWlasciciela()+ " / "+ konto1.getNumerWlasciciela()+") -> Stan konta: "+ konto1.getStanKonta() + " PLN ("+ konto1.getNumerKonta()+")");
        konto1.wyciagKonto(900);
        konto1.zasilKonto(250);
        konto1.wyciagKonto(50);
        konto1.wyciagKonto(350);
    }
}
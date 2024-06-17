// TestWypozyczalni.java

public class TestWypozyczalni {
    public static void main(String[] args) {
        Osobowe osobowe = new Osobowe("ABC123", "1HGCM82633A123456", "Czarny", 50000, 7.5, 50, 20000, 4);
        Ciezarowka ciezarowka = new Ciezarowka("DEF456", "2FTRX18W1XCA12345", "Biały", 120000, 15, 200, 100000, 10000);
        Motocykl motocykl = new Motocykl("GHI789", "3C3EL55T9VT123456", "Czerwony", 20000, 4, 10, 5000, true);
        SprzetBudowlany sprzetBudowlany = new SprzetBudowlany("JKL012", "4F4YR16U9RT123456", "Żółty", 150000, 25, 300, 500, 1200);

        Diesel diesel = new Diesel();
        Benzyna benzyna = new Benzyna();
        Elektryk elektryk = new Elektryk();

        System.out.println("Typ paliwa osobowe: " + diesel.getTypPaliwa());
        System.out.println("Typ paliwa ciezarowka: " + benzyna.getTypPaliwa());
        System.out.println("Typ paliwa motocykl: " + benzyna.getTypPaliwa());
        System.out.println("Typ paliwa sprzet budowlany: " + diesel.getTypPaliwa());

        osobowe.prowadz(100);
        osobowe.zatankuj(20);

        ciezarowka.prowadz(500);
        ciezarowka.zatankuj(100);

        motocykl.prowadz(50);
        motocykl.zatankuj(5);

        sprzetBudowlany.prowadz(10);
        sprzetBudowlany.zatankuj(50);
    }
}

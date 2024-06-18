import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SystemWypozyczen {
    private List<Pojazd> pojazdy;
    private List<Wypozyczenie> wypozyczenia;

    public SystemWypozyczen() {
        pojazdy = new ArrayList<>();
        wypozyczenia = new ArrayList<>();
        zainicjujPojazdy();
    }

    private void zainicjujPojazdy() {
        pojazdy.add(new Rower("Rower1"));
        pojazdy.add(new Rower("Rower2"));
        pojazdy.add(new Hulajnoga("Hulajnoga1"));
        pojazdy.add(new Hulajnoga("Hulajnoga2"));
    }

    public void wypozyczPojazd(String idPojazdu, String nazwiskoWypozyczajacego) {
        Pojazd pojazd = znajdzPojazdPoId(idPojazdu);
        if (pojazd != null && !pojazd.czyWypozyczony()) {
            pojazd.setWypozyczony(true);
            wypozyczenia.add(new Wypozyczenie(nazwiskoWypozyczajacego, pojazd));
            System.out.println("Wypożyczono " + idPojazdu + " dla " + nazwiskoWypozyczajacego);
        } else {
            System.out.println("Pojazd nie jest dostępny do wypożyczenia.");
        }
    }

    public void zwrocPojazd(String idPojazdu) {
        Pojazd pojazd = znajdzPojazdPoId(idPojazdu);
        if (pojazd != null && pojazd.czyWypozyczony()) {
            pojazd.setWypozyczony(false);
            usunWypozyczenie(pojazd);
            System.out.println("Zwrócono " + idPojazdu);
        } else {
            System.out.println("Pojazd nie został znaleziony lub nie jest wypożyczony.");
        }
    }

    private Pojazd znajdzPojazdPoId(String idPojazdu) {
        for (Pojazd p : pojazdy) {
            if (p.getId().equals(idPojazdu)) {
                return p;
            }
        }
        return null;
    }

    private void usunWypozyczenie(Pojazd pojazd) {
        wypozyczenia.removeIf(wypozyczenie -> wypozyczenie.getPojazd().equals(pojazd));
    }

    public static void main(String[] args) {
        SystemWypozyczen system = new SystemWypozyczen();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Wybierz opcję: (1) Wypożycz pojazd (2) Zwróć pojazd (3) Wyjście");
            int opcja = scanner.nextInt();
            scanner.nextLine();  // Pobierz znak nowej linii

            if (opcja == 1) {
                System.out.println("Podaj ID pojazdu:");
                String idPojazdu = scanner.nextLine();
                System.out.println("Podaj swoje nazwisko:");
                String nazwiskoWypozyczajacego = scanner.nextLine();
                system.wypozyczPojazd(idPojazdu, nazwiskoWypozyczajacego);
            } else if (opcja == 2) {
                System.out.println("Podaj ID pojazdu:");
                String idPojazdu = scanner.nextLine();
                system.zwrocPojazd(idPojazdu);
            } else if (opcja == 3) {
                break;
            } else {
                System.out.println("Nieprawidłowa opcja. Spróbuj ponownie.");
            }
        }

        scanner.close();
    }
}

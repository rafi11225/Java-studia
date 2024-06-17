// Pojazdy.java

abstract class Pojazd {
    private String nrRejestracyjny;
    private String numerVin;
    private String kolor;
    private double cena;
    private double spalanie;
    private double poziomPaliwa;
    private double przebieg;

    public Pojazd(String nrRejestracyjny, String numerVin, String kolor, double cena, double spalanie, double poziomPaliwa, double przebieg) {
        this.nrRejestracyjny = nrRejestracyjny;
        this.numerVin = numerVin;
        this.kolor = kolor;
        this.cena = cena;
        this.spalanie = spalanie;
        this.poziomPaliwa = poziomPaliwa;
        this.przebieg = przebieg;
    }

    public abstract void prowadz(double kilometry);
    public abstract void zatankuj(double litry);

    // Gettery i Settery
    public String getNrRejestracyjny() { return nrRejestracyjny; }
    public String getNumerVin() { return numerVin; }
    public String getKolor() { return kolor; }
    public double getCena() { return cena; }
    public double getSpalanie() { return spalanie; }
    public double getPoziomPaliwa() { return poziomPaliwa; }
    public double getPrzebieg() { return przebieg; }

    public void setPoziomPaliwa(double poziomPaliwa) { this.poziomPaliwa = poziomPaliwa; }
    public void setPrzebieg(double przebieg) { this.przebieg = przebieg; }
}

class Osobowe extends Pojazd {
    private int liczbaDrzwi;

    public Osobowe(String nrRejestracyjny, String numerVin, String kolor, double cena, double spalanie, double poziomPaliwa, double przebieg, int liczbaDrzwi) {
        super(nrRejestracyjny, numerVin, kolor, cena, spalanie, poziomPaliwa, przebieg);
        this.liczbaDrzwi = liczbaDrzwi;
    }

    @Override
    public void prowadz(double kilometry) {
        double potrzebnePaliwo = kilometry * getSpalanie() / 100;
        if (potrzebnePaliwo <= getPoziomPaliwa()) {
            setPoziomPaliwa(getPoziomPaliwa() - potrzebnePaliwo);
            setPrzebieg(getPrzebieg() + kilometry);
            System.out.println("Pojazd przejechał " + kilometry + " km.");
        } else {
            System.out.println("Za mało paliwa.");
        }
    }

    @Override
    public void zatankuj(double litry) {
        setPoziomPaliwa(getPoziomPaliwa() + litry);
        System.out.println("Zatankowano " + litry + " litrów paliwa.");
    }

    public int getLiczbaDrzwi() { return liczbaDrzwi; }
}

class Ciezarowka extends Pojazd {
    private double ladownosc;

    public Ciezarowka(String nrRejestracyjny, String numerVin, String kolor, double cena, double spalanie, double poziomPaliwa, double przebieg, double ladownosc) {
        super(nrRejestracyjny, numerVin, kolor, cena, spalanie, poziomPaliwa, przebieg);
        this.ladownosc = ladownosc;
    }

    @Override
    public void prowadz(double kilometry) {
        double potrzebnePaliwo = kilometry * getSpalanie() / 100;
        if (potrzebnePaliwo <= getPoziomPaliwa()) {
            setPoziomPaliwa(getPoziomPaliwa() - potrzebnePaliwo);
            setPrzebieg(getPrzebieg() + kilometry);
            System.out.println("Pojazd przejechał " + kilometry + " km.");
        } else {
            System.out.println("Za mało paliwa.");
        }
    }

    @Override
    public void zatankuj(double litry) {
        setPoziomPaliwa(getPoziomPaliwa() + litry);
        System.out.println("Zatankowano " + litry + " litrów paliwa.");
    }

    public double getLadownosc() { return ladownosc; }
}

class Motocykl extends Pojazd {
    private boolean posiadaDostawke;

    public Motocykl(String nrRejestracyjny, String numerVin, String kolor, double cena, double spalanie, double poziomPaliwa, double przebieg, boolean posiadaDostawke) {
        super(nrRejestracyjny, numerVin, kolor, cena, spalanie, poziomPaliwa, przebieg);
        this.posiadaDostawke = posiadaDostawke;
    }

    @Override
    public void prowadz(double kilometry) {
        double potrzebnePaliwo = kilometry * getSpalanie() / 100;
        if (potrzebnePaliwo <= getPoziomPaliwa()) {
            setPoziomPaliwa(getPoziomPaliwa() - potrzebnePaliwo);
            setPrzebieg(getPrzebieg() + kilometry);
            System.out.println("Pojazd przejechał " + kilometry + " km.");
        } else {
            System.out.println("Za mało paliwa.");
        }
    }

    @Override
    public void zatankuj(double litry) {
        setPoziomPaliwa(getPoziomPaliwa() + litry);
        System.out.println("Zatankowano " + litry + " litrów paliwa.");
    }

    public boolean getPosiadaDostawke() { return posiadaDostawke; }
}

class SprzetBudowlany extends Pojazd {
    private double przepracowaneGodziny;

    public SprzetBudowlany(String nrRejestracyjny, String numerVin, String kolor, double cena, double spalanie, double poziomPaliwa, double przebieg, double przepracowaneGodziny) {
        super(nrRejestracyjny, numerVin, kolor, cena, spalanie, poziomPaliwa, przebieg);
        this.przepracowaneGodziny = przepracowaneGodziny;
    }

    @Override
    public void prowadz(double godziny) {
        double potrzebnePaliwo = godziny * getSpalanie() / 100;
        if (potrzebnePaliwo <= getPoziomPaliwa()) {
            setPoziomPaliwa(getPoziomPaliwa() - potrzebnePaliwo);
            przepracowaneGodziny += godziny;
            System.out.println("Pojazd przepracował " + godziny + " godzin.");
        } else {
            System.out.println("Za mało paliwa.");
        }
    }

    @Override
    public void zatankuj(double litry) {
        setPoziomPaliwa(getPoziomPaliwa() + litry);
        System.out.println("Zatankowano " + litry + " litrów paliwa.");
    }

    public double getPrzepracowaneGodziny() { return przepracowaneGodziny; }
}

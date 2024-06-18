public abstract class Pojazd {
    private String id;
    private boolean wypozyczony;

    public Pojazd(String id) {
        this.id = id;
        this.wypozyczony = false;
    }

    public String getId() {
        return id;
    }

    public boolean czyWypozyczony() {
        return wypozyczony;
    }

    public void setWypozyczony(boolean wypozyczony) {
        this.wypozyczony = wypozyczony;
    }

    @Override
    public String toString() {
        return id + (wypozyczony ? " (Wypożyczony)" : " (Dostępny)");
    }
}

package pl.pp;

public class MojaDziewiataAplikacja {
    public static void main(String[] args) {
        pl.pp.Magazyn magazyn1 = new pl.pp.Magazyn();
        magazyn1.setEmailKontaktu("kontakt@gmail.com");
        magazyn1.setNumerKontaktu("424444234");
        magazyn1.setPrzestrzenMagazynu(5000);

        System.out.println("Kontakt:" + magazyn1.getEmailKontaktu() + " numer: " + magazyn1.getNumerKontaktu() + " Przestrzen magazynu: " + magazyn1.getPrzestrzenMagazynu());
        magazyn1.DodajTowar(3000);
        magazyn1.OdejmijTowar(1000);
        magazyn1.DodajTowar(2500);
        double zajetosc=5000-magazyn1.getPrzestrzenMagazynu();
        System.out.println("Zajete: "+zajetosc);
    }
}
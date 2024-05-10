package pl.pp;
public class Magazyn {
    private double PrzestrzenMagazynu;
    private String emailKontaktu;
    private String numerKontaktu;

    public Magazyn(){

    }
    public Magazyn(double PrzestrzenMagazynu, String emailKontaktu, String numerKontaktu){
        this.PrzestrzenMagazynu=PrzestrzenMagazynu;
        this.emailKontaktu=emailKontaktu;
        this.numerKontaktu=numerKontaktu;
    }
    public String getEmailKontaktu(){
        return emailKontaktu;
    }
    public void setEmailKontaktu(String emailKontaktu){
        this.emailKontaktu=emailKontaktu;
    }
    public String getNumerKontaktu(){
        return numerKontaktu;
    }
    public void setNumerKontaktu(String numerKontaktu){
        this.numerKontaktu=numerKontaktu;
    }
    public double getPrzestrzenMagazynu(){
        return PrzestrzenMagazynu;
    }
    public void setPrzestrzenMagazynu(double PrzestrzenMagazynu){
        this.PrzestrzenMagazynu=PrzestrzenMagazynu;
    }
    public void DodajTowar(double IloscDodanegoTowaru){
       if(this.PrzestrzenMagazynu>=IloscDodanegoTowaru) {
           this.PrzestrzenMagazynu -= IloscDodanegoTowaru;
           System.out.println("Dodana ilość towaru: "+IloscDodanegoTowaru+" Nowa ilość dostępnego miejsca: "+PrzestrzenMagazynu);
       }
       else{
           System.out.println("Brak dostępnego miejsca");
       }
    }
    public void OdejmijTowar(double IloscOdjetegoTowaru){
        this.PrzestrzenMagazynu+=IloscOdjetegoTowaru;
        System.out.println("Nowa ilosc przestrzeni: "+ PrzestrzenMagazynu);
    }


}

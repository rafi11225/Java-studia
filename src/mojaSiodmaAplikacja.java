package pl.pp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class mojaSiodmaAplikacja {
    // pola (atrybuty) klasy określającej obiekt "Person" (jego parametry/cechy)
    public String forename; // pole przechowujące cechę imię
    public String surname; // pole przechowujące cechę nazwisko
    public int age; // pole przechowujące cechę wiek

    public String address; // pole przechowujące cechę adres

    public LocalDate dob; // pole przechowujące ceche data urodzenia

    /**
     * Konstruktor domyślny - element inicjalizujący pola obiektu podczas jego tworzenia
     * (jeśli sami nie podamy żadnych parametrów)
     */
    public Person() {

    }

    /**
     * Konstruktor z trzema parametrami, które możemy podać przy jego tworzeniu
     */
    public Person(String initForename, String initSurname, int initAge, String initDoB, String initAddress) {
        this.forename = initForename;
        this.surname = initSurname;
        this.age = initAge;
        this.dob = LocalDate.parse(initDoB, DateTimeFormatter.ISO_DATE);
        this.address = initAddress;
    }


    // metody klasy określające akcje możliwe do wykonania przez obiekt
    public void hiToAll(){
        System.out.println("Nazywam się " + forename + " " + surname + ". " + "Mam " + age + " lat. Urodziłem się "+ dob + " i mój adres zamieszkania to " + address);
    }

    // przykładowa metoda growOld, która zwiększa dany wiek obiektu o wiek za każdym jej wywołaniem
    public int growOld(int year){
        dob = dob.minusYears(year);
        age = age + year;
        return age;
    }

    public int beYounger() {
        dob = dob.plusYears(1);
        age = age - 1;
        return age;
    }

    // przykładowa metoda getName zwracająca wartość forename obiektu
    public String getName(){
        return forename;
    }

    // przykładowa metoda setName ustawiająca wartość forename obiektu
    public void setName(String nameToSet){
        forename = nameToSet;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String addToSet) {
        address = addToSet;
    }

    public LocalDate getDOB() {
        return dob;
    }

    public void setDOB(String dateToSet) {
        dob = LocalDate.parse(dateToSet, DateTimeFormatter.ISO_DATE);
    }
}


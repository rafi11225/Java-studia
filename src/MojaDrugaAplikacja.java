import java.util.Scanner;

public class MojaDrugaAplikacja {
    public static void main(String[] args) {
//zadanie 2.1//
        System.out.print("Podaj wartosc x:");
        Scanner read = new Scanner(System.in);
        int x = read.nextInt();
        int dwukrotnosc = 2 * x;
        int kwadrat = x * x;
        System.out.print("Wpisana wartosc:" +x);
        System.out.println("Dwukrotnosc 'x' to:" + dwukrotnosc);
        System.out.println("Potega kwadratowa 'x' to:"+kwadrat);
//zadanie 2.2//
        System.out.print("Podaj swoj wiek:");
        int wiek = read.nextInt();
        read.close();
        int s = wiek * 31536000;//wiek w sekundach//
        System.out.println("Twoj wiek w sekundach to:"+s +" sekund");
        read.close();

    }
}
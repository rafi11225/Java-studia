import java.util.Scanner;


public class MojaTrzeciaAplikacja {
    public static void main(String[] args) {
    //Zadanie 1//
      Scanner scanner = new Scanner(System.in);
        System.out.printf("Podaj proszę liczbe większą od 100: ");

        var number1 = scanner.nextDouble();
        while (number1 <= 100){
            System.out.println("Liczba nie jest większa od 100, podaj jeszcze raz liczbę: ");
            number1 = scanner.nextDouble();
        }
        System.out.println("Dziękuję! Podałeś liczbę: "+ number1);
        double number2;
        do{
            System.out.println("Podaj proszę liczbę większą od 200: ");
            number2 = scanner.nextDouble();
        }while(number2 <= 200);
        System.out.println("Dziękuję! Podałeś liczbę: "+number2);
        int wynik = 0;
        for(var i = 1; i <= 10; i++){
            wynik= wynik + i;
            System.out.println("Przebieg numer "+ i + " w pętli for a zmienna wynik = "+ wynik);

        }
        System.out.println("Podaj liczbę x :");
        var x = scanner.nextDouble();
        System.out.println("Podaj liczbę y :");
        var y = scanner.nextDouble();
        if(x > y){
            System.out.println("x jest większe od y");
        } else if (x <y) {
            System.out.println("x jest mniejsze od y");
        }else{
            System.out.println("x jest równe y");
        }
        while(true){
            System.out.println("Wpisz wartość -1 żeby wyjść z programu");
            var input = scanner.nextDouble();
            if(input == -1) {
                System.out.println("Wyjście...");
                break;
            }
        }
       scanner.close();

        //zadanie 2.1//


        while(true)
        {
            System.out.println("Podaj liczbę dni: ");
            Scanner read = new Scanner(System.in);
            int dni = read.nextInt();

            if(dni >= 0) {
                int tygodnie = dni / 7;
                int reszta = dni % 7;
                System.out.println("Twój wynik to " + tygodnie + " tygodnie " + reszta + " dni");
                break;
            }
            else{
                System.out.print("Podaj jeszcze raz liczbę dni: ");
                continue;
            }

        }

        //zadanie 2.2//
        while(true){
            System.out.print("Wprowadź temperaturę w Fahrenheitach: ");
            Scanner load = new Scanner(System.in);
            double Fahrenheit = load.nextDouble();
            double Kelwin;
            double Celcjusz;
            if(Fahrenheit == -1)
            {
                break;
            }
            else{
                Celcjusz = (Fahrenheit-32)/1.8000;
                Kelwin = Celcjusz + 273.16;
                System.out.println("Temperatura w Fahrenheitach: "+ Fahrenheit);
                System.out.println("Temperatura w Kelwinach: "+ Kelwin);
                System.out.println("Temperatura w Celcjuszach: "+ Celcjusz);
                continue;
            }
        }


    }
}
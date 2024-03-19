import java.util.Scanner;
import java.util.ArrayList;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      //zadanie 1//
        while(true) {

            Scanner read = new Scanner(System.in);
            System.out.println("Podaj górny i dolny wynik: ");
            int min = read.nextInt();
            int max = read.nextInt();
            if (min > max){
                continue;
            }
            else if (min == max){
                System.out.println("done");
                break;
            }
            else{
                int suma = 0;
                ArrayList<Integer> lista = new ArrayList<Integer>();
                for(int i = min; i <= max; i++){
                    lista.add(i*i);
                    for(int element:lista ){
                        suma+=element;

                    }
                    System.out.print("Twoja suma: "+suma);//dodaje na bierząco//
               }
            }

        }
        //zadanie 2//
        while(true){
            System.out.println("Wybierz operacje:\n" +
                    "1.dodawanie\n"+ "2.Odejmowanie\n"+"3.Mnożenie\n"+"4.Dzielenie");
            Scanner module = new Scanner(System.in);
            int wybor = module.nextInt();
            switch(wybor){
                case 1:
                    System.out.println("Podaj dwie liczby: ");
                    int a = module.nextInt();
                    int b = module.nextInt();
                    System.out.println("Twój wynik to: "+(a+b));
                    continue;
                case 2:
                    System.out.println("Podaj dwie liczby: ");
                    int c = module.nextInt();
                    int d = module.nextInt();
                    System.out.println("Twój wynik to: "+(c-d));
                    continue;
                case 3:
                    System.out.println("Podaj dwie liczby: ");
                    int e = module.nextInt();
                    int f = module.nextInt();
                    System.out.println("Twój wynik to: "+(e*f));
                    continue;
                case 4:
                    System.out.println("Podaj dwie liczby: ");
                    int g = module.nextInt();
                    int h = module.nextInt();
                    System.out.println("Twój wynik to: "+(g/h));
                    continue;
                default:
                    continue;
            }
        }
        }
    }

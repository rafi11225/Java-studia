//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MojaDziesiataAplikacja {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4, 5, -3, -2, -1};
        int[] result = countAndSumElements(input);
        System.out.println("Liczba ujemnych: " + result[0]);
        System.out.println("Suma dodatnich: " + result[1]);
    }

    public static int[] countAndSumElements(int[] input) {
        int countNegative = 0;
        int sumPositive = 0;

        for (int number : input) {
            if (number < 0) {
                countNegative++;
            } else if (number > 0) {
                sumPositive += number;
            }
        }

        return new int[] {countNegative, sumPositive};
    }
         }

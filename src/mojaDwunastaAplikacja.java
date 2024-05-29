import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class mojaDwunastaAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputFilePath = "";
        String outputFilePath = "";
        boolean validInputFile = false;

        while (!validInputFile) {
            System.out.println("Podaj ścieżkę do pliku wejściowego:");
            inputFilePath = scanner.nextLine();

            Path pathToFile = Paths.get(inputFilePath);
            if (Files.exists(pathToFile)) {
                validInputFile = true;
            } else {
                System.out.println("Plik nie istnieje, podaj poprawną ścieżkę.");
            }
        }

        System.out.println("Podaj ścieżkę do pliku wyjściowego:");
        outputFilePath = scanner.nextLine();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFilePath))) {
            int lineCount = 0;
            while (bufferedReader.readLine() != null) {
                lineCount++;
            }

            System.out.println("Liczba linii w pliku: " + lineCount);

            try (FileWriter fileWriter = new FileWriter(outputFilePath)) {
                fileWriter.write("Nazwa pliku: " + inputFilePath + "\n");
                fileWriter.write("Liczba linii: " + lineCount + "\n");
            }

        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas przetwarzania pliku: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

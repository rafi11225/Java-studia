import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class mojaTrzynastaAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pobranie ścieżki do pliku wejściowego
        System.out.println("Podaj ścieżkę do pliku wejściowego:");
        String inputFilePath = scanner.nextLine();
        Path inputPath = Paths.get(inputFilePath);

        // Pobranie ścieżki do pliku wyjściowego
        System.out.println("Podaj ścieżkę do pliku wyjściowego:");
        String outputFilePath = scanner.nextLine();
        Path outputPath = Paths.get(outputFilePath);

        while (!Files.exists(inputPath)) {
            System.out.println("Plik wejściowy nie istnieje. Podaj poprawną ścieżkę:");
            inputFilePath = scanner.nextLine();
            inputPath = Paths.get(inputFilePath);
        }

        try {
            // Odczytanie zawartości pliku wejściowego
            List<String> lines = Files.readAllLines(inputPath);
            StringBuilder contentBuilder = new StringBuilder();
            for (String line : lines) {
                contentBuilder.append(line).append(" ");
            }
            String fileContent = contentBuilder.toString().trim();

            // Liczenie słów
            String[] words = fileContent.split("\\s+");
            int wordCount = words.length;
            System.out.println("Liczba wszystkich słów: " + wordCount);

            // Liczenie wystąpień każdego słowa
            Map<String, Integer> wordOccurrences = new HashMap<>();
            for (String word : words) {
                word = word.toLowerCase();
                wordOccurrences.put(word, wordOccurrences.getOrDefault(word, 0) + 1);
            }

            // Wyświetlanie wystąpień słów w konsoli
            System.out.println("Wystąpienia każdego słowa:");
            for (Map.Entry<String, Integer> entry : wordOccurrences.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            // Zapisanie wyniku do pliku wyjściowego
            StringBuilder outputContent = new StringBuilder();
            outputContent.append("Nazwa pliku: ").append(inputFilePath).append("\n");
            outputContent.append("Liczba słów: ").append(wordCount).append("\n");
            outputContent.append("Wystąpienia każdego słowa:\n");
            for (Map.Entry<String, Integer> entry : wordOccurrences.entrySet()) {
                outputContent.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
            }
            Files.write(outputPath, outputContent.toString().getBytes(Charset.defaultCharset()));

        } catch (IOException e) {
            System.out.println("Dostaliśmy błąd obsługi pliku: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

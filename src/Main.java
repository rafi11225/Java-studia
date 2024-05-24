import java.util.*;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Main {
        public static void main(String[] args) {
            List<Student> students = Arrays.asList(
                    new Student("12345", "Jan", "Kowalski", Arrays.asList(4, 5, 3, 5)),
                    new Student("67890", "Anna", "Nowak", Arrays.asList(5, 5, 4, 4)),
                    new Student("54321", "Paweł", "Wiśniewski", Arrays.asList(2, 3, 2, 4)),
                    new Student("09876", "Katarzyna", "Kowalczyk", Arrays.asList(5, 4, 4, 5))
            );

            // Znalezienie studenta z najwyższą średnią ocen
            Student topStudent = students.stream()
                    .max(Comparator.comparingDouble(Student::calculateAverage))
                    .orElse(null);

            if (topStudent != null) {
                System.out.println("Student z najwyższą średnią: " +
                        topStudent.getFirstName() + " " + topStudent.getLastName() +
                        " (" + topStudent.getIndexNumber() + ") - Average: " + topStudent.calculateAverage());
            }

            // Obliczenie średniej ocen wszystkich studentów
            double overallAverage = students.stream()
                    .mapToDouble(Student::calculateAverage)
                    .average()
                    .orElse(0.0);

            System.out.println("Średnia ocen wszystkich studentów: " + overallAverage);

            // Sortowanie studentów według nazwisk
            students.sort(Comparator.comparing(Student::getLastName).thenComparing(Student::getFirstName));

            System.out.println("Studenci posortowani według nazwisk:");
            for (Student student : students) {
                System.out.println(student.getFirstName() + " " + student.getLastName() +
                        " (" + student.getIndexNumber() + ") - Average: " + student.calculateAverage());
            }
            double suma_wszystkich=0;
            for(Student student : students ){
                suma_wszystkich+=student.calculateAverage();
            }
            double srednia_wszystkich=suma_wszystkich/students.size();
            System.out.println("Średnia wszystkich: "+srednia_wszystkich);
        }
    }



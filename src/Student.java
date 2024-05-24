import java.util.*;
public class Student {
    private String indexNumber;
    private String firstName;
    private String lastName;
    private List<Integer> grades;




        public Student(String indexNumber, String firstName, String lastName, List<Integer> grades) {
            this.indexNumber = indexNumber;
            this.firstName = firstName;
            this.lastName = lastName;
            this.grades = grades;
        }

        public String getIndexNumber() {
            return indexNumber;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public List<Integer> getGrades() {
            return grades;
        }

        public double calculateAverage() {
            return grades.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        }
    }


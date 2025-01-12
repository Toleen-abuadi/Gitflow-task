import java.util.Scanner;
public class AverageCalculator {
    int[] marks;
    int numberOfStudents;
    public void inputMarks() {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        numberOfStudents = read.nextInt();

        marks = new int[numberOfStudents];
        System.out.println("Enter the marks of students: ");
        for (int i = 0; i < numberOfStudents; i++) {
            marks[i] = read.nextInt();
        }
        
        read.close();
    }

    public void calculateAverage() {
        System.out.println("Calculating average...");
        int sum = 0;
        for (int i = 0; i < numberOfStudents; i++) {
            sum += marks[i];
        }
        System.out.println("Average: " + sum / numberOfStudents);
    }

    public static void main(String[] args) {
        // Your code goes here
    }

}
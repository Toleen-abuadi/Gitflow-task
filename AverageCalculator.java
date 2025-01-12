import java.util.Scanner;
public class AverageCalculator {
    int[] marks;

    public void inputMarks() {
        Scanner read = new Scanner(System.in);
        marks = new int[30];
        System.out.println("Enter the marks of 30 students: ");
        for (int i = 0; i < 30; i++) {
            marks[i] = read.nextInt();
        }
        read.close();
    }

    public void calculateAverage() {
        System.out.println("Calculating average...");
        int sum = 0;
        for (int i = 0; i < 30; i++) {
            sum += marks[i];
        }
        System.out.println("Average: " + sum / 30);
    }

    public static void main(String[] args) {
        // Your code goes here
    }

}

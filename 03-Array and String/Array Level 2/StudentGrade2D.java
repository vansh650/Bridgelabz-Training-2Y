import java.util.Scanner;

public class StudentGrade2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        double[][] marks = new double[number][3];
        double[] percentage = new double[number];
        char[] grade = new char[number];

        for (int i = 0; i < number; i++) {
            marks[i][0] = sc.nextDouble();
            marks[i][1] = sc.nextDouble();
            marks[i][2] = sc.nextDouble();

            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.out.println("Invalid marks. Enter again.");
                i--;
            }
        }

        for (int i = 0; i < number; i++) {
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;

            if (percentage[i] >= 90) {
                grade[i] = 'A';
            } else if (percentage[i] >= 80) {
                grade[i] = 'B';
            } else if (percentage[i] >= 70) {
                grade[i] = 'C';
            } else if (percentage[i] >= 60) {
                grade[i] = 'D';
            } else {
                grade[i] = 'F';
            }
        }

        for (int i = 0; i < number; i++) {
            System.out.println("Physics = " + marks[i][0]);
            System.out.println("Chemistry = " + marks[i][1]);
            System.out.println("Maths = " + marks[i][2]);
            System.out.println("Percentage = " + percentage[i]);
            System.out.println("Grade = " + grade[i]);
            System.out.println();
        }
    }
}
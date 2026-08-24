import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        double[] physics = new double[number];
        double[] chemistry = new double[number];
        double[] maths = new double[number];
        double[] percentage = new double[number];
        char[] grade = new char[number];

        for (int i = 0; i < number; i++) {
            physics[i] = sc.nextDouble();
            chemistry[i] = sc.nextDouble();
            maths[i] = sc.nextDouble();

            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Invalid marks. Enter again.");
                i--;
            }
        }

        for (int i = 0; i < number; i++) {
            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3;

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
            System.out.println("Physics = " + physics[i]);
            System.out.println("Chemistry = " + chemistry[i]);
            System.out.println("Maths = " + maths[i]);
            System.out.println("Percentage = " + percentage[i]);
            System.out.println("Grade = " + grade[i]);
            System.out.println();
        }
    }
}
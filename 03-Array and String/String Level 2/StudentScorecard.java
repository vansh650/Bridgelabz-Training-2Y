public class StudentScorecard {

    static int[][] generateMarks(int students) {
        int[][] marks = new int[students][3];

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = (int)(Math.random() * 100);
            }
        }

        return marks;
    }

    static double[][] calculate(int[][] marks) {
        double[][] result = new double[marks.length][3];

        for (int i = 0; i < marks.length; i++) {

            double total = marks[i][0] +
                           marks[i][1] +
                           marks[i][2];

            double average = total / 3;
            double percentage = total / 3;

            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0;
            result[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return result;
    }

    static char[] calculateGrade(double[][] result) {
        char[] grade = new char[result.length];

        for (int i = 0; i < result.length; i++) {

            double percentage = result[i][2];

            if (percentage >= 90) {
                grade[i] = 'A';
            } else if (percentage >= 80) {
                grade[i] = 'B';
            } else if (percentage >= 70) {
                grade[i] = 'C';
            } else if (percentage >= 60) {
                grade[i] = 'D';
            } else {
                grade[i] = 'F';
            }
        }

        return grade;
    }

    static void display(int[][] marks,
                        double[][] result,
                        char[] grade) {

        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(
                    (i + 1) + "\t" +
                    marks[i][0] + "\t" +
                    marks[i][1] + "\t\t" +
                    marks[i][2] + "\t" +
                    result[i][0] + "\t" +
                    result[i][1] + "\t" +
                    result[i][2] + "\t\t" +
                    grade[i]
            );
        }
    }

    public static void main(String[] args) {

        int students = 5;

        int[][] marks = generateMarks(students);

        double[][] result = calculate(marks);

        char[] grade = calculateGrade(result);

        display(marks, result, grade);
    }
}
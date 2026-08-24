public class RandomAge {

    static int[] generateAges(int n) {
        int[] age = new int[n];

        for (int i = 0; i < n; i++) {
            age[i] = (int)(Math.random() * 90) + 10;
        }

        return age;
    }

    static String[][] checkVoting(int[] age) {
        String[][] result = new String[age.length][2];

        for (int i = 0; i < age.length; i++) {
            result[i][0] = String.valueOf(age[i]);

            if (age[i] < 0) {
                result[i][1] = "false";
            } else if (age[i] >= 18) {
                result[i][1] = "true";
            } else {
                result[i][1] = "false";
            }
        }

        return result;
    }

    static void display(String[][] result) {
        System.out.println("Age\tCan Vote");

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t" + result[i][1]);
        }
    }

    public static void main(String[] args) {

        int[] age = generateAges(10);

        String[][] result = checkVoting(age);

        display(result);
    }
}
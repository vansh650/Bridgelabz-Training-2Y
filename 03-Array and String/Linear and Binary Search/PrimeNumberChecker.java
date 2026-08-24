public class PrimeNumberChecker {
    public static void main(String[] args) {
        int n = 61;
        boolean prime = true;

        if (n <= 1) {
            prime = false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}

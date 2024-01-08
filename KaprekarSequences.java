import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class KaprekarSequences {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program generates so-called Kaprekar sequences KS(n).");

        while (true) {
            System.out.println("\nGiven radix r from [2..36] and starting positive integer n0");
            System.out.print("Enter radix (2-36): ");
            int radix = scanner.nextInt();

            if (radix < 2 || radix > 36) {
                System.out.println("Invalid radix. Please enter a radix between 2 and 36.");
                continue;
            }

            System.out.print("Enter starting positive integer n0: ");
            int n = scanner.nextInt();

            if (n < 0) {
                System.out.println("Invalid starting number. Please enter a non-negative integer.");
                continue;
            }

            System.out.println("Representation radix: r = " + radix);
            System.out.println("Start number: n = " + convertToBase(n, radix));

            Set<Integer> seenNumbers = new HashSet<>();
            seenNumbers.add(n);

            while (true) {
                int max = getMax(n, radix);
                int min = getMin(n, radix);
                n = max - min;

                System.out.println(convertToBase(max, radix) + " - " + convertToBase(min, radix) + " = " + convertToBase(n, radix));

                if (seenNumbers.contains(n)) {
                    System.out.println("Start number: n = " + convertToBase(n, radix));
                    break;
                }

                seenNumbers.add(n);
            }

            System.out.print("Do you want to continue? (yes/no): ");
            String input = scanner.next().toLowerCase();
            if (!input.equals("yes")) {
                break;
            }
        }

        System.out.println("End of program");
    }

    private static int getMax(int num, int radix) {
        int max = 0;
        while (num > 0) {
            int digit = num % radix;
            max = Math.max(max, digit);
            num /= radix;
        }
        return max;
    }

    private static int getMin(int num, int radix) {
        int min = radix - 1;
        while (num > 0) {
            int digit = num % radix;
            min = Math.min(min, digit);
            num /= radix;
        }
        return min;
    }

    private static String convertToBase(int num, int radix) {
        return Integer.toString(num, radix).toUpperCase();
    }
}

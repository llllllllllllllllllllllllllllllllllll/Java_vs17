import java.util.Scanner;

public class Ul3 {

    public static void main(String[] args) {
        int n = getInput();
        if (n == 12) {
            System.out.print("Received exit code - closing.");
            System.exit(0);
        } else {

            System.out.println("Arvu " + n + " kümnendesituse ristsumma on " + sumDigitsSteps(n) + " = " + sumDigits(n));

        }
    }

    // get and manage user input
    private static int getInput() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = reader.nextInt();
        reader.close();
        return n;
    }

    // calculate sum of digits and return result
    private static  int sumDigits(int n) {
        int m = n % 10, next = n / 10;
        if (next == 0) {
            return m;
        }
        return m + sumDigits(next);
    }

    // create string for visual representation of calculation
    private static String sumDigitsSteps(int n) {
        String temp = Integer.toString(n).replace("", " + ").trim();
        return temp.substring(1, temp.length()-1);
    }
}

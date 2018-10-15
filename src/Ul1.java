import java.util.Scanner;

public class Ul1 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("How many rows (default is 10) : ");
        int rows = reader.nextInt();
        reader.close();

        for(int i = rows - 1; i >= 0; --i) {
            for(int j = rows - 1; j>=0; --j) {
                if (j > i) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}

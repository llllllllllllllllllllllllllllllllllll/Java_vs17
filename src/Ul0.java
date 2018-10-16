/*      Output
*         *
*        ***
*       *****
*      *******
*     *********
*
*     Only one loop allowed
* */

import java.util.Arrays;
import java.util.Scanner;

public class Ul0 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = reader.nextInt();
        reader.close();

        for(int i = -rows +1 ; i <= 0 ; i++){
            char row[] = new char[2*rows - Math.abs(i) - 1];
            Arrays.fill(row,0,Math.abs(i),' ');
            Arrays.fill(row,Math.abs(i), row.length,'*');
            System.out.println(String.valueOf(row));
        }

    }
}

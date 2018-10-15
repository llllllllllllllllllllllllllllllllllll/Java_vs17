import java.util.Scanner;

public class Ul2 {
    public static void main(String[] args){
        int details = getInput();

        int checkedDetail = 0;
        int uncheckedDetail = 0;

        int oldChecker = 3;
        int newChecker = 2;

        for(int i = 0; i < details; i++){

            if(i % oldChecker == 0 || i % newChecker == 0){
                checkedDetail++;
            } else {
                uncheckedDetail++;
            }

        }

        System.out.println("Checked details: " + checkedDetail);
        System.out.println("Unchecked details: " + uncheckedDetail);

    }

    private static int getInput() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = reader.nextInt();
        reader.close();
        return n;
    }
}
/*
0 1 2 3 4 5 6 7 8 9 10 11
+   +   +   +   +   +
+     +     +     +
*/
import java.util.Scanner;

public class Ul6 {
    public static void main(String[] args){

            Scanner reader = new Scanner(System.in);
            System.out.print("Enter text: ");
            String userText = reader.next();
            reader.close();

            System.out.println(userText);

    }
}

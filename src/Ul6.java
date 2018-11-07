import java.util.Scanner;
/*
*   Küsib kasutajalt sisendina teksti.
*   Väljastab selle "suure teksti" kujul
*
*   Sisesta tekst 🠒 tere
*   █████ █████ ████▙ █████
*     █   █     █   █ █
*     █   ███   ████▛ ███
*     █   █     █  ▜▙ █
*     █   █████ █   █ █████
* */
public class Ul6 {
    public static void main(String[] args){
        System.out.print("Sisesta tekst \uD83E\uDC12 ");
        String smallString = new Scanner(System.in).nextLine();

        for (int row = 0; row < 5; row++) {
            for (int i = 0; i < smallString.length(); i++) {
                if (Alphabet.getAlphabet().containsKey(smallString.charAt(i))) {
                    String[] symbol = Alphabet.getAlphabet().get(smallString.charAt(i));
                    System.out.print(symbol[row]);
                }
            }
            System.out.println();
        }
    }
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SportDay {
    public static void main(String[] args) {
        ArrayList<Athlete> athletes = new ArrayList<Athlete>();

        Scanner nameData = new Scanner(System.in);
        Scanner resultData = new Scanner(System.in);
        do {
            System.out.println("Sisesta sportlase nimi: ");
            String athleteName = nameData.nextLine();
            if (athleteName.isEmpty()) {
                break;
            }
            System.out.println("Sisesta sportlase tulemus: ");
            Double athleteResult = resultData.nextDouble();
            athletes.add(new Athlete(athleteName, athleteResult));
        } while (true);

        Collections.sort(athletes);

        for (Athlete athlete : athletes) {
            System.out.println(athlete);
        }
    }
}
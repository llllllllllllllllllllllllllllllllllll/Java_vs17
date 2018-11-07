import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Ul7 {
    public static void main(String[] args){
        String filepath = "athlete.ser";

        // probably a really bad way to handle arraylists

        ArrayList<Athlete> athletes = new ArrayList<>();
        athletes.add(AthleteIO.addNew());
        ArrayList<Athlete> readAthletes = AthleteIO.ReadObjectFromFile(filepath);

        ArrayList<Athlete> allAthletes = new ArrayList<>();
        assert readAthletes != null;
        allAthletes.addAll(readAthletes);
        allAthletes.addAll(athletes);

        Collections.sort(allAthletes);
        AthleteIO.WriteObjectToFile(allAthletes, filepath);

        System.out.println("=======================");
        for (Object athlete : allAthletes) {
            System.out.println(athlete.toString());
        }
        System.out.println("=======================");
    }
}

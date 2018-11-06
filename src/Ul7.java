import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

/*
Loo programm, mis küsib kasutaja käest sportlase tulemuse ja nime, lisab selle ArrayList-i, sorteerib tulemuse järgi kahanevalt ning salvestab serialiseeritult faili.

        Iga käivitamise peale loeb failist andmed ja kuvab pingerea.

        Deserialiseerimine käib väga sarnaselt serialiseerimisele ObjectInputStream klassi abil. Deserialiseerimise tulemust peab type cast-ima:

        ArrayList<Athlete> athletes = (ArrayList<Athlete>) input.readObject();
        ArrayList-i sorteerimiseks kasuta Collections.sort() meetodit.
*/
public class Ul7 {
    public static void main(String[] args){

        ArrayList<Athlete> athletes = new ArrayList<Athlete>();
        athletes.add(new Athlete("1", 2.22) );
        athletes.add(new Athlete("2", 3.22) );

        System.out.println("Athlete name:");
        Scanner athleteName = new Scanner(System.in);
        String name = athleteName.nextLine();
        System.out.println("Athlete result: ");
        Scanner athleteResult = new Scanner(System.in).useLocale(Locale.US);
        double result = athleteResult.nextDouble();
        athleteName.close();
        athletes.add(new Athlete(name, result));

        Collections.sort(athletes);

        for (Athlete athlete : athletes) {
            String athleteRow = athlete.toString();
            System.out.println(athleteRow);
        }

//        try {
//            FileOutputStream fileOut = new FileOutputStream("athlete.ser");
//            ObjectOutputStream out = new ObjectOutputStream(fileOut);
//            out.writeObject(athletes);
//            out.close();
//            fileOut.close();
//            System.out.printf("Serialized data is saved in athlete.ser");
//        } catch (IOException i) {
//            i.printStackTrace();
//        }

    }
}

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
/*
Loo programm, mis küsib kasutaja käest sportlase tulemuse ja nime, lisab selle ArrayList-i, sorteerib tulemuse järgi kahanevalt ning salvestab serialiseeritult faili.

        Iga käivitamise peale loeb failist andmed ja kuvab pingerea.

        Deserialiseerimine käib väga sarnaselt serialiseerimisele ObjectInputStream klassi abil. Deserialiseerimise tulemust peab type cast-ima:

        ArrayList<Athlete> athletes = (ArrayList<Athlete>) input.readObject();
        ArrayList-i sorteerimiseks kasuta Collections.sort() meetodit.
*/
public class Ul7 {
    public static void main(String[] args){

        Athlete a = new Athlete();
        a.name = "Aleksander";
        a.result = 2.22;

        try {
            FileOutputStream fileOut =
                    new FileOutputStream("/tmp/athlete.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(a);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in /tmp/athlete.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }

    }
}

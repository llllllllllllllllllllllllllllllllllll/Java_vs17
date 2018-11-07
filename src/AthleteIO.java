import java.io.*;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

class AthleteIO {

    static void WriteObjectToFile(ArrayList<Athlete> athletes, String filepath) {
        try {
            FileOutputStream fileOut = new FileOutputStream(filepath);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(athletes);
            out.close();
            fileOut.close();
            System.out.println("Data is saved in " + filepath);
        } catch (
                IOException i) {
            i.printStackTrace();
        }
    }

    static ArrayList<Athlete> ReadObjectFromFile(String filepath) {
        try {
            FileInputStream fileIn = new FileInputStream(filepath);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            ArrayList<Athlete> obj = (ArrayList<Athlete>) objectIn.readObject();
            System.out.println("Results have been read from file " + filepath);
            objectIn.close();
            return obj;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    static Athlete addNew(){
        System.out.print("Athlete name \uD83E\uDC12 ");
        String name = new Scanner(System.in).nextLine();

        System.out.print("Athlete result \uD83E\uDC12 ");
        double result = new Scanner(System.in).useLocale(Locale.US).nextDouble();

        return new Athlete(name, result);
    }

}

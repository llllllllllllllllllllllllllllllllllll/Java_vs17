public class Ul5 {
    public static void main(String[] args){

        Punkt punkt1 = new Punkt(-1, 1);
        Punkt punkt2 = new Punkt(-1, 3);
        Punkt punkt3 = new Punkt(0, 2);

        Kolmnurk kolmnurk1 = new Kolmnurk(punkt1, punkt2, punkt3);
        Kolmnurk kolmnurk1med = kolmnurk1.mediaalKolmnurk();

        System.out.println(kolmnurk1.getInfo());
        System.out.println(kolmnurk1med.getInfo());

    }
}

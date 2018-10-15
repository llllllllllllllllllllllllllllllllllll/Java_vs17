public class Ul5 {
    public static void main(String[] args){

        Punkt punkt1 = new Punkt(-1, 2);
        Punkt punkt2 = new Punkt(-1, 3);

        System.out.println(punkt1.getInfo());

        Sirge sirge1 = new Sirge(punkt1, punkt2);

        System.out.println(sirge1.getLength());

    }
}

public class Kolmnurk {


    private Punkt point1;
    private Punkt point2;
    private Punkt point3;

    private Sirge edge1;
    private Sirge edge2;
    private Sirge edge3;

    public Kolmnurk(Punkt tip1, Punkt tip2, Punkt tip3){
        this.point1 = tip1;
        this.point2 = tip2;
        this.point3 = tip3;

        this.edge1 = new Sirge(this.point1, this.point2);
        this.edge2 = new Sirge(this.point2, this.point3);
        this.edge3 = new Sirge(this.point3, this.point1);
    }

    Kolmnurk mediaalKolmnurk() {
        Punkt medialPoint1 = edge1.getMidPoint();
        Punkt medialPoint2 = edge2.getMidPoint();
        Punkt medialPoint3 = edge3.getMidPoint();

        return new Kolmnurk(medialPoint1, medialPoint2, medialPoint3);
    }

    String getInfo() {
        return "Kolmnurga info:\n\n1.külg:\n" + this.edge1.getInfo() + "\n\n2.külg:\n" + this.edge2.getInfo() + "\n\n3.külg:\n" + this.edge3.getInfo() + "\n\n\n";
    }

}

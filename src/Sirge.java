public class Sirge {

    Punkt endP;
    Punkt startP;
    double len;

    public Sirge(Punkt startPoint, Punkt endPoint){
        this.startP = startPoint;
        this.endP = endPoint;

        // calculate length
        this.len = Math.sqrt(Math.pow(startPoint.getXCoordinate() - endPoint.getXCoordinate(), 2) + Math.pow(startPoint.getYCoordinate() - endPoint.getYCoordinate(), 2));
    }

    String getInfo(){
        String startCoords = "(" + startP.getXCoordinate() + ", " + startP.getYCoordinate() + ")";
        String endCoords = "(" + endP.getXCoordinate() + ", " + endP.getYCoordinate() + ")";
        return "Sirge alguspunkti koordinaadid: " + startCoords + "\nSirge lõpupunkti koordinaadid: " + endCoords + "\nSirge pikkus: " + this.len;
    }

    double getLength(){
        return len;
    }

    Punkt getMidPoint() {
        Punkt midPoint = new Punkt (((this.startP.getXCoordinate() + this.endP.getXCoordinate())/2), ((this.startP.getYCoordinate() + this.endP.getYCoordinate())/2));
        return midPoint;
    }

}

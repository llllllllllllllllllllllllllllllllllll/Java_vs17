public class Sirge {

    Punkt endP;
    Punkt startP;
    double len;

    public Sirge(Punkt startPoint, Punkt endPoint){
        this.startP = startPoint;
        this.endP = endPoint;

        // calculate length
        this.len = Math.sqrt((startPoint.getXCoordinate() - endPoint.getXCoordinate()) * (startPoint.getXCoordinate() - endPoint.getXCoordinate()) + (startPoint.getYCoordinate() - endPoint.getYCoordinate()) * (startPoint.getYCoordinate() - endPoint.getYCoordinate()));
    }

    double getLength(){
        return len;
    }
}

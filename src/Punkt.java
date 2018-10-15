public class Punkt{
    private double xCoordinate = 0;
    private double yCoordinate = 0;
    private int xySector;



    public Punkt(double xCoordinate, double yCoordinate){
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;

        if (xCoordinate > 0 && yCoordinate > 0) {
            this.xySector = 1;
        } else if(xCoordinate < 0 && yCoordinate > 0) {
            this.xySector = 2;
        } else if(xCoordinate < 0 && yCoordinate < 0){
            this.xySector = 3;
        } else if(xCoordinate > 0 && yCoordinate < 0) {
            this.xySector = 4;
        } else {
            this.xySector = 0;
        }
    }

    double getXCoordinate() {
        return this.xCoordinate;
    }

    double getYCoordinate() {
        return this.yCoordinate;
    }

    int getSector() {
        return this.xySector;
    }

    String getInfo() {
        String x = toString().valueOf(this.xCoordinate);
        String y = toString().valueOf(this.yCoordinate);
        String sec = toString().valueOf(this.xySector);
        return "Punkti koordinaadid: (" + x + ", " + y + "). Sektor: " + sec;
    }

}
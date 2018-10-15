public class Circle {


    private int circleRadius = 1;
    private int circleCenterX = 0;
    private int circleCenterY = 0;
    private String circleColor = "värvitu";

    void setRadius(int radius){
        this.circleRadius = radius;
    }

    int getRadius(){
        return this.circleRadius;
    }

    void setCenterX(int xCoordinate) {
        this.circleCenterX = xCoordinate;
    }
    int getCenterX() {
        return this.circleCenterX;
    }

    void setCenterY(int yCoordinate) {
        this.circleCenterY = yCoordinate;
    }
    int getCenterY() {
        return this.circleCenterY;
    }

    void setColor(String color) {
        this.circleColor = color;
    }

    String getColor(String color) {
        return this.circleColor;
    }

    String getData(){
        return this.circleRadius + " " + this.circleCenterY + " " + this.circleCenterY + " " + this.circleColor;
    }

}

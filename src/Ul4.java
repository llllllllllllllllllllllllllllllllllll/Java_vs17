public class Ul4 {
    public static void main(String[] args){

        Circle circle1 = new Circle();
        Circle circle2 = new Circle();

        // set radius for both circles
        circle1.setRadius(1);
        circle2.setRadius(1);

        // set center coordinates for circle1
        circle1.setCenterX(1);
        circle1.setCenterY(-1);

        //set center coordinates for circle2
        circle2.setCenterX(-1);
        circle2.setCenterY(-1);

        compareCircles(circle1, circle2);
        }

        /*
            R1 + R2 = kahe ringi keskpunkti vahekaugus - ringidel on üks kokkupuude punkt
            R1 + R2 > kahe ringi keskpunkti vahekaugus - ringidel on kaks kokkupuude punkti
            R1 + R2 < kahe ringi keskpunkti vahekaugus - ringid on üks teisest eemal
        */
        private static void compareCircles(Circle n, Circle m) {
            int radiusSum = n.getRadius() + m.getRadius();
            double centerDiff = Math.sqrt((n.getCenterX() - m.getCenterX()) * (n.getCenterX() - m.getCenterX()) + (n.getCenterY() - m.getCenterY()) * (n.getCenterY() - m.getCenterY()));

            System.out.println(radiusSum);
            System.out.println(centerDiff);

            if (radiusSum == centerDiff) {
                System.out.println("Ringidel on 1 kokkupuutepunkt.");
            } else if (radiusSum > centerDiff) {
                System.out.println("Ringidel on 2 kokkupuutepunkti.");
            } else {
                System.out.println("Ringid ei puutu kokku");
            }

        }

    }


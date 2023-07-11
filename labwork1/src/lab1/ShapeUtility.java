package lab1;

import java.util.ArrayList;

public class ShapeUtility {

        public static Shape findLargestArea(ArrayList<Shape> shapes) {

        //String st= "";
        double area= shapes.get(0).getArea();
        Shape s= shapes.get(0);
        for (int i = 1; i < shapes.size() ; i++) {
            if(shapes.get(i).getArea()>area) {
                area= shapes.get(i).getArea();
                s= shapes.get(i);
            }
        }


        //s.printDetails();

        System.out.println("The largest area is: " +area);
        System.out.print("The largest shape is: ");
        return s;



    }
}

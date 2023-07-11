package lab1;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {

        Rectangle r1= new Rectangle("yellow", 12, 6);
        System.out.print("\n\nr1= ");
        r1.printDetails();
        r1.setColor("green");
        System.out.print("AfterSetColor r1: ");
        r1.printDetails();
        System.out.println("Area of rectangle r1:" +r1.getArea());

        Circle c1= new Circle(5, "red");
        System.out.print("\nc1= ");
        c1.printDetails();
        System.out.println("Area of circle c1:" +c1.getArea() +"\n");


        ArrayList<Shape> shapes= new ArrayList<>();

        Rectangle r2= new Rectangle("yellow", 6, 12);
        Rectangle r3= new Rectangle("pink", 8, 12);
        Rectangle r4= new Rectangle("purple", 12, 10);
        Rectangle r5= new Rectangle("Gray", 3 , 4);
        Rectangle r6= new Rectangle("brown", 10, 24);
        shapes.add(r1); shapes.add(r2); shapes.add(r3); shapes.add(r4); shapes.add(r5); shapes.add(r6);

        Circle c2= new Circle(4, "black");
        Circle c3= new Circle(3, "white");
        Circle c4= new Circle(9, "blue");
        Circle c5= new Circle(1, "Orange");
        Circle c6= new Circle(20, "red");
        shapes.add(c1); shapes.add(c2); shapes.add(c3); shapes.add(c4); shapes.add(c5); shapes.add(c6);



        ShapeUtility shapeUtility= new ShapeUtility();
        //System.out.println(shapeUtility.findLargestArea(shapes));
        Shape result1= shapeUtility.findLargestArea(shapes);
        result1.printDetails();
        System.out.println();







    }
}

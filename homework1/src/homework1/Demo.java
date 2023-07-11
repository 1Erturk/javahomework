package homework1;

import javax.sound.sampled.Line;
import java.util.ArrayList;

public class Demo {

    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static void main(String[] args) {

        //Point2D
        System.out.println(ANSI_GREEN +"\n========================================================================" +"\nTest for point2D:" +ANSI_RESET);

        Point2D point= new Point2D(4,2);
        System.out.println("point" +point);

        Point2D copyPoint= new Point2D(point);
        System.out.println("copyPoint" +copyPoint);

        System.out.println("x = " +point.getX());
        System.out.println("y = " +copyPoint.getY());

        Point2D otherPoint= new Point2D(7, 6);
        Line2D otherLine= new Line2D(4, 4);
        System.out.println("Distance between " +point + " and " +otherPoint + " = " +point.distanceTo(otherPoint));
        System.out.println("Distance between " +point + " and " +otherLine + " = " +point.distanceTo(otherLine));

        //Line2D
        System.out.println(ANSI_GREEN +"========================================================================" +"\nTest for Line2D:" +ANSI_RESET);

        Line2D line= new Line2D(1,2);
        System.out.println("line" +line);

        Line2D copyLine= new Line2D(line);
        System.out.println("copyLine" +copyLine);

        System.out.println("m = " +line.getM());
        System.out.println("n = " +copyLine.getN());

        Line2D otherLine1= new Line2D(-1, 6);

        if(line.isParallel(otherLine1)) {
            System.out.println(line +" and " +otherLine1 +" are parallel.");
        } else {
            System.out.println(line +" and " +otherLine1 +" are not parallel.");
        }

        if(line.intersection(otherLine1)==null) {
            System.out.println("They are parallel, so there is no intersection.");
        } else {
            System.out.println("Intersection point is: " +line.intersection(otherLine1));
        }

        //Path2D
        System.out.println(ANSI_GREEN +"========================================================================" +"\nTest for Path2D:" +ANSI_RESET);

        ArrayList<Point2D> points= new ArrayList<>(){};
        points.add(0, new Point2D(3,4));
        points.add(1, new Point2D(3,6));
        points.add(2, new Point2D(3,9));
        Path2D path= new Path2D(points);
        System.out.println("path" +path);

        Path2D copyPath= new Path2D(path);
        System.out.println("copyPath" +copyPath);

        System.out.println("The number of points in the path = " +path.size());
        System.out.println("The length of path = " +path.length());

        Point2D other= new Point2D(3,13);
        path.addPoint(other);
        System.out.println("afterAddPoint" +path);

        ArrayList<Point2D> pointss= new ArrayList<>(){};
        pointss.add(0, new Point2D(3, 14));
        pointss.add(1, new Point2D(3, 15));
        pointss.add(2, new Point2D(3, 16));
        pointss.add(3, new Point2D(3, 17));
        pointss.add(4, new Point2D(3,18));
        Path2D newPath= new Path2D(pointss);
        path.combine(newPath);
        System.out.println("afterCombine" +path);



        System.out.println(ANSI_GREEN +"========================================================================" +ANSI_RESET);
    }
}

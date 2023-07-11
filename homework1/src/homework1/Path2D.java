package homework1;
import java.awt.*;
import java.util.ArrayList;

public class Path2D {
    ArrayList<Point2D> points= new ArrayList<>();

    public Path2D(ArrayList<Point2D> points) {
        this.points = points;
    }

    public Path2D(Path2D other) {
        this.points= other.points;
    }

    public Point2D getPoint(int index) {
        return points.get(index);
    }

    @Override
    public String toString() {
        String st = "";
        for (int i = 0; i < points.size(); i++) {
            if(i== 0 ) {
                st+= points.get(i);
            } else {
                st+= "===" +points.get(i);
            }
        }
        return st;
    }

    public int size() {
        return points.size();
    }

    public double length() {
        int startX= points.get(0).getX();
        int startY= points.get(0).getY();
        int finishX= points.get((points.size()-1)).getX();
        int finishY= points.get((points.size()-1)).getY();

        int distanceOfX= Math.abs((finishX-startX));
        int distanceOfY= Math.abs((finishY-startY));

        return Math.sqrt((Math.pow(distanceOfX,2)) + (Math.pow(distanceOfY,2)) );
    }

    public void addPoint(Point2D other) {
        points.add(other);
    }

    public ArrayList<Point2D> combine(Path2D other) {

        for (int i = 0; i < other.size(); i++) {
            points.add(other.getPoint(i));
        }

        return points;
    }


}

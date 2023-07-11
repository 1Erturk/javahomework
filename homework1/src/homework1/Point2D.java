package homework1;
public class Point2D {

    private int x;
    private int y;
    public Point2D(int x, int y) {
        this.x= x;
        this.y= y;
    }

    public Point2D(Point2D other) {
        x= other.x;
        y= other.y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "{x=" + x + ", y=" + y + "}";
    }

    public double distanceTo(Point2D other) {
        int distanceX= (x-other.getX());
        int distanceY= (y-other.getY());
        double square= (Math.pow(distanceX,2))+(Math.pow(distanceY,2));
        double distance= Math.sqrt(square);
        return distance;
    }

    public double distanceTo(Line2D line) {
        /**
         * y=mx+n, mx-y+n=0;
         * point(X,Y) and line(mx-y+n);
         * distance= abs(mX-Y+n)/sqrt(m^2+(-1)^2;
         **/
        double distance= Math.abs(line.getM()*x - y + line.getN()) / Math.sqrt(Math.pow(line.getM(),2)+1);
        return distance;
    }



}

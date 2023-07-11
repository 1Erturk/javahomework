package homework1;
import java.awt.*;

public class Line2D {
    private int m;
    private int n;
    public Line2D(int m, int n) {
        this.m= m;
        this.n= n;
    }
    public Line2D(Line2D other) {
        m= other.m;
        n= other.n;
    }

    public int getM() {
        return m;
    }

    public int getN() {
        return n;
    }

    public String toString() {
        return "{y = " +getM() + "x+" +getN() + "}" ;
    }

    boolean isParallel(Line2D other) {
        if((m/other.m)==1) {
            return true;
        }
        return false;
    }

    public Point2D intersection(Line2D other) {

        if(isParallel(other)) {
            return null;
        }

        int x;
        int y;
        /**
         *  y1=mx+n, y2=(other.m)x+other.n and should be y1=y2
         * (m-other.m)x=(other.n-n)
         * x=(other.n-n)/(m-other.m)
         * y=mx+n ,
         **/
        x=(other.n-n)/(m-other.m);
        y=m*x+n;

        return new Point2D(x,y);
    }




}


package lab1;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width= width;
    }

    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println(",Length:<" +length + ">,Width:<" +width +">" );
    }
}

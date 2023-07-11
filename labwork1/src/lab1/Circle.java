package lab1;

public class Circle extends Shape {
    private double radius;
    public Circle(double radius, String color) {
        super(color);
        this.radius= radius;
    }

    @Override
    public double getArea() {
        return (3.14)*(radius*radius);
    }

    @Override
    public void printDetails() {
        super.printDetails();
        System.out.println(",Radius:<" +radius +">");
    }
}

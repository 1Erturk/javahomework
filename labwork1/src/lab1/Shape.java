package lab1;

public abstract class Shape {
    private String color;
    public Shape(String color) {
        this.color= color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public void printDetails() {
        System.out.print("Color:<" +color +">" + ",Area:<" +getArea() +">");
    }
}

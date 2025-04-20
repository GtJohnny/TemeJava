package Ex2;

public class Circle extends Form {
    private float radius;

    public Circle(String color, float radius) {
        super(color);
        this.radius = radius;
    }

    public Circle() {
    }

    @Override
    public float getArea() {
        return (float) (radius*radius*Math.PI);
    }

    @Override
    public String toString() {
        return "Cerc: "+super.toString()+" "+getArea();

    }
    public void printCircleDimensions(){
        System.out.println("Raza: "+ this.radius+"\n");
    }

    @Override
    public void FormDimensions() {
        printCircleDimensions();
    }
}

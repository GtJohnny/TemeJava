package Ex2;

import java.util.Objects;

public class Triangle extends Form{
    private Float height;
    private Float base;

    public Triangle(String color, Float height, Float base) {
        super(color);
        this.height = height;
        this.base = base;
    }

    public Triangle() {
    }

    @Override
    public float getArea() {
        return height*base/2;
    }

    @Override
    public String toString() {
        return "Triunghi: "+super.toString()+" "+getArea();
    }

    ///
    ///
    /// Criteriul ales de echivalenta a fost
    /// egalitatea intre toate campurile celor 2 obiecte
    /// de tip triunghi
    public boolean equals(Triangle obj) {
        return Objects.equals(this.color, obj.color)
                && this.base == obj.base
                && this.height == obj.height;
    }

    public void printTriangleDimensions(){
        System.out.println("Inaltime: "+ this.height+
                "\nBaza: "+this.base+"\n");
    }

    @Override
    public void FormDimensions() {
        this.printTriangleDimensions();
    }
}

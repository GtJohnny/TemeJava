package Ex2;

public abstract class Form {

    protected String color;
    public float getArea(){
        return 0;
    }

    @Override
    public String toString() {
        return this.color;
    }

    public Form() {
    }

    public Form(String color) {
        this.color = color;
    }

    public abstract void FormDimensions();
}

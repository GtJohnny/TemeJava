package Ex2;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Triangle triunghi = new Triangle("rosu",5.5f,10f);
        Circle cerc = new Circle("verde",8f);
        System.out.println(cerc);
        System.out.println(triunghi);
        Vector<Form>vect = new Vector<>();
        String[] culori = {"rosu","galben","albastru","verde","portocaliu","violet"};

        for(int i=0;i<10;i++){
            if((i&1)==1)
                vect.add(new Triangle(culori[i%culori.length],i*2f,2*3f));
            else
                vect.add(new Circle(culori[i%culori.length],i*1.5f));

        }

        for(Form f : vect){
            System.out.println(f);
            //punctul g
//            if(f instanceof Circle)
//                ((Circle) f).printCircleDimensions();
//            else
//                ((Triangle) f).printTriangleDimensions();

      //punctul h
            f.FormDimensions();
        }
    }


}

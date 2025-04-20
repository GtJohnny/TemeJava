package Calc;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class Client {
    public static void main(String[] args) {
        Vector<Double> vect = new Vector<>();
        DoubleCalculator calc = new DoubleCalculator();

        try(Scanner sc = new Scanner(new FileReader("input.txt"))){
            double a,b;
            a = sc.nextDouble();
            b = sc.nextDouble();
            System.out.println(calc.add(a,b));
            a = sc.nextDouble();
            b = sc.nextDouble();
            //MyArithmeticException
            //System.out.println(calc.divide(a,b));

            while(sc.hasNextDouble()){
                vect.add(sc.nextDouble());
            }
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    //NullParameterException
    //    System.out.println(calc.average(null));
        System.out.println(calc.average(vect));

    }
}

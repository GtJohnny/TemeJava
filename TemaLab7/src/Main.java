import Calc.DoubleCalculator;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        Vector<Double> vect = new Vector<>();

        try(Scanner sc = new Scanner(new FileReader("input.txt"))){
            while(sc.hasNextDouble()){
                vect.add(sc.nextDouble());
            }
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }

        DoubleCalculator calc = new DoubleCalculator();
        System.out.println(calc.average(vect));

    }
}
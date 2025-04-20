package Calc;

import java.util.Vector;

public interface Calculator {
    public  double add(double a, double b)throws MyArithmeticException,OverflowException,UnderflowException;
    public  double divide(double a,double b)throws MyArithmeticException;
    public  double average(Vector<Double> vect)throws MyArithmeticException,OverflowException,UnderflowException;




}

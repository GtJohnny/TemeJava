package Calc;

import java.util.Vector;

public class DoubleCalculator implements Calculator {

    @Override
    public double add(double a, double b) throws NullParameterException, OverflowException, UnderflowException {


        try {
            return a + b;
        }
        catch (Exception e){
            if(a>0) throw new OverflowException();
            else throw new UnderflowException();
        }
    }

    @Override
    public double divide(double a, double b) {
        if(b == 0){
            throw new MyArithmeticException("Nu se poate face impartire la 0.");
        }
        try {
            return a / b;
        }catch(Exception ex){
            throw ex;
        }
    }

    @Override
    public double average(Vector<Double> vect) {
        double sum = 0;
        int nr = 0;
        if (vect == null) {
            throw new NullParameterException();
        }
        try {
            for (Double val : vect) {
                if (val == null) {
                    throw new NullParameterException();
                }
                sum = add(sum, val);
                nr++;

            }
            return divide(sum,nr);
        } catch (Exception ex){
            throw ex;
        }
    }
}

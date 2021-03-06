package equations;

import java.util.List;
import java.util.Scanner;

public class MyEquation extends Equation {

    /**
     * This is how to make an equation, will be hard coded in.
     * This is an example equation
     */
    public MyEquation(){
        super("a + b + c", "a,b,c");
    }

    /*
    When making an equation, you should know what the equation is and what variables will be needed.
    Given your equation and hint, you should also know which values are what when it comes to filling
    out the calculate method.
    e.g. knowing in this case that values.get(1) is hint variable b.
     */

    public Double calculate(List<Double> values){
        try{
            Double answer = values.get(0)+values.get(1)+values.get(2);
            return answer;
        }
        catch (Exception e){
            return null;
        }
    }
}

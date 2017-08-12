package equations;

import java.util.List;

public class GDPOpen extends Equation {

    public GDPOpen(){
        super("C + I + G + (X - M)", "C,I,G,X,M");
    }

    /*
    When making an equation, you should know what the equation is and what variables will be needed.
    Given your equation and hint, you should also know which values are what when it comes to filling
    out the calculate method.
    e.g. knowing in this case that values.get(1) is hint variable b.
     */

    public Double calculate(List<Double> values){
        try{
            //                  C               I           G         (     X       -      M      )
            Double answer = values.get(0)+values.get(1)+values.get(2)+(values.get(3)-values.get(4));
            return answer;
        }
        catch (Exception e){
            return null;
        }
    }

}

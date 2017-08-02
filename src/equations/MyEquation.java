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

    /**
     * This should also be hard coded in. May change this later.
     * @param s the scanner from Main
     */
    public void calculate(Scanner s){
        System.out.println("Equation: "+this.equation);
        System.out.println("Enter csv values respectivly:");
        System.out.println(this.hint);
        String csv = s.next();
        List<Double> values = tokenValues(csv);
        //assert values != null : "tokenValues returned null, user-csv: "+csv;
        if(values == null) return;
        String interpretedInput = "";
        for(int i = 0; i < 3; i++){
            if(i < 3-1)
                interpretedInput += ""+values.get(i)+", ";
            else
                interpretedInput += ""+values.get(i);
        }
        System.out.println("Running Equation '"+this.equation+"' with: "+interpretedInput);
        try {
            System.out.println("Answer: " + (values.get(0) + values.get(1) + values.get(2)) + "\n");
        }
        catch (Exception e){
            System.out.println("Invalid input.\n");
        }
    }
}

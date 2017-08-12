package equations;

import com.sun.istack.internal.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Equation {

    public final String equation, hint;

    /**
     * Create an equation instance. Will need to fill out the calculate method.
     * @param equation the equation that will be used
     * @param hint to tell the user to enter csv respectively to the equation
     */
    public Equation(String equation, String hint){
        this.equation = equation;
        this.hint = hint;
    }

    public void calculate(Scanner s){
        System.out.println("Equation: "+this.equation);
        System.out.println("Enter csv values respectivly:");
        System.out.println(this.hint);
        String csv = s.next();
        List<Double> values = tokenValues(csv);
        if(values == null) {
            System.out.println("Invalid input.");
            return;
        }
        //assert values != null : "tokenValues returned null, user-csv: "+csv;
        System.out.println("Running Equation '"+this.equation+"' with: "+csv);
        Double answer = calculate(values);
        if(answer == null)
            System.out.println("Invalid input.");
        else
            System.out.println("Answer: "+answer);
    }

    /**
     * This should perform the actual calculation. Should return null if something goes wrong.
     * @param values list of all the values from csv input by the user
     */
    @Nullable
    public abstract Double calculate(List<Double> values);


    public static void test(Scanner s){
        System.out.println("Equation: a + b - c");
        System.out.println("Enter csv values respectivly:");
        System.out.println("a,b,c");
        String token = s.next();
        List<Double> values = tokenValues(token);
        assert values != null;
        System.out.println("Running Equation 'a + b - c' on: "+token);
        System.out.println(values.get(0) + values.get(1) - values.get(2)+"\n");
    }

    /**
     * Obtain values from csv, return null if the csv is not right.
     * @param csv user input csv
     * @return List of doubles of what the user entered.
     */
    @Nullable
    public static List<Double> tokenValues(String csv){
        Scanner scanner = new Scanner(csv);
        try {
            scanner.useDelimiter(",");
            List<Double> values = new ArrayList<>();
            while (scanner.hasNext()) {
                values.add(Double.parseDouble(scanner.next()));
            }
            return values;
        }
        catch(Exception | Error e){
            return null;
        }
    }

}

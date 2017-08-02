package equations;

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

    /**
     * This should perform the calculation. Input will be done in the method with the scanner.
     * @param s the scanner from Main
     */
    public abstract void calculate(Scanner s);


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
     * Obtain values from csv
     * @param csv user input csv
     * @return List of doubles of what the user entered.
     */
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
            System.out.println("Invalid input");
        }
        return null;
    }

}

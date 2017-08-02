import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Equations {

    public static void test(Scanner s){
        System.out.println("Equation: a + b - c");
        System.out.println("Enter csv values respectivly:");
        System.out.println("a,b,c");
        String token = s.next();
        List<Double> values = tokenValues(token);
        System.out.println("Running Equation 'a + b - c' on: "+token);
        System.out.println(values.get(0) + values.get(1) - values.get(2)+"\n");
        System.out.println("Please choose an option by entering an int.");
        System.out.println("(1): Test (add two numbers together)");
        System.out.println("(0): exit");
    }

    public static List<Double> tokenValues(String token){
        Scanner scanner = new Scanner(token);
        scanner.useDelimiter(",");
        List<Double> values = new ArrayList<>();
        while(scanner.hasNext()){
            values.add(Double.parseDouble(scanner.next()));
        }
        return values;
    }
}

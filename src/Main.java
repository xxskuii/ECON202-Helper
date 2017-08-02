import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    List<Equations> equationsList;

    public Main(){
        equationsList = new ArrayList<Equations>();
    }

    public static void main(String[] args) {
        //System.out.println("Hello World");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose an option by entering an int.");
        System.out.println("(1): Test: 'a + b - c'");
        System.out.println("(0): exit");
        int i = -1;
        while(i != 0) {
            i = scanner.nextInt();
            switch(i){
                case 1 : Equations.test(scanner); break;
                default : break;
            }
        }
        System.out.println("Exiting program.");
    }

}

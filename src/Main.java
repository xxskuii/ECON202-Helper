import equations.MyEquation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import equations.*;

public class Main {

    List<Equation> equationList;

    /**
     * This is where I will add new equations, will be hard coded.
     */
    public Main(){
        equationList = new ArrayList<Equation>();
        equationList.add(new MyEquation());
        equationList.add(new GDPOpen());
    }

    public static void main(String[] args) {
        //System.out.println("Hello World");
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        int i = -1;
        while(i != 0) {
            m.printDefaultMessage(); //Program is in default state.
            i = scanner.nextInt();
            //if user enters 0, will attampt to get -1 in equationList. So catch error, keep it running, don't crash
            try{
                m.equationList.get(i-1).calculate(scanner);
            }
            catch (Exception e){
                //That's fine, do nothing. User should assume they entered an incorrect value.
                if(i!=0) System.out.println("Invalid input.");
            }
        }
        System.out.println("Exiting program.");
    }

    public void printDefaultMessage(){
        System.out.println("-------------------------------------------");
        System.out.println("Please choose an option by entering an int.");
        for(int i = 0; i < equationList.size(); i++){
            String eqName = equationList.get(i).getClass().getSimpleName();
            String equation = equationList.get(i).equation;
            assert equation != null;
            System.out.println("("+(i+1)+")"+": "+eqName+" '"+equation+"'");
        }
        System.out.println("(0): exit");
    }

}

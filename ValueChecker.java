import java.util.Scanner;

public class ValueChecker{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int intVal;

        System.out.println("Please enter an integer value: ");
        intVal = in.nextInt();

        if(intVal == 7){
            System.out.println("That's lucky!");
        } 
        else if(intVal == 13){
            System.out.println("That's unlucky!");
        }
        else{
            System.out.println("That number is neither lucky nor unlucky!");
        }
        in.close();
    }
}
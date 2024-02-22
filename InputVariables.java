import java.util.Scanner;

public class InputVariables{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int intVal;
        double doubleVal;
        float floatVal;
        long longVal;
        boolean boolVal;
        byte byteVal;
        char charVal;
        short shortVal;

        System.out.println("Please enter an integer: ");
        intVal = in.nextInt();

        System.out.println("Please enter a double: ");
        doubleVal = in.nextDouble();

        System.out.println("Please enter a float: ");
        floatVal = in.nextFloat();

        System.out.println("Please enter a long: ");
        longVal = in.nextLong();

        System.out.println("Please enter a boolean: ");
        boolVal = in.nextBoolean();

        System.out.println("Please enter a char: ");
        charVal = in.next().charAt(0);

        System.out.println("Please enter a short: ");
        shortVal = in.nextShort();

        in.close();

        System.out.println("Integer is " + intVal);
        System.out.println("Double is " + doubleVal);
        System.out.println("Float is " + floatVal);
        System.out.println("Long is " + longVal);
        System.out.println("Boolean is " + boolVal);
        System.out.println("Char is " + charVal);
        System.out.println("Short is " + shortVal);

        

    }
}
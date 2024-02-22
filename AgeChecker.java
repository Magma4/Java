import java.util.Scanner;

public class AgeChecker{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int age;
        char licence;

        System.out.println("Please enter your age: ");
        age = in.nextInt();

        System.out.println("Do you have a driving licence? y/n");
        licence = in.next().charAt(0);

        if(age >= 21 && licence == 'y'){
            System.out.println("You are an adult and can hire a car");
        }
        else{
            System.out.println("You are not an adult cannot hire a car");
        }

    }
}
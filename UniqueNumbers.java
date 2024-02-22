import java.util.Scanner;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        Scanner in = new Scanner(System.in);
        int num = 0;
        int numValues = 0;
        boolean valid = true;
        

        while(numValues<numbers.length){
            do{
                valid = true;
                System.out.println("Please enter a valid unique value: ");
                num = in.nextInt();
                for(int i=0; i<numValues;i++);
                {
                    int i;
                    if(num == numbers[i]){
                        System.out.println("number already exists");
                        valid = false;
                        break;
                    }
                }
            }while(!valid);
            numbers[numValues] = num;
            numValues++;
        }

        
    }
}

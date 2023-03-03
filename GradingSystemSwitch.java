
// Develop a java program for grading system that satisfies the ff requirements
// 1. Requirement for passing an exam is that a student must pass the exam with a score 
//    of 25 or more and must also pass the assessment by 15 or more to get a cert
// 2. If a student score a total grade of 39 for both grading component(ie. if only a student score
//     25 and assessment 14 totalling 39 or exam 24 and assessment 15 totalling 39), the student is
//    condoned.
// 3. If a student satisfy req. 1 or req. 2 and have paid fees in full where fees is 100, they are
//    issued with a certificate.
// 4. A student is deemed to have failed if he/she does not meet req. 1 or req. 2
// 5. However, your program must inform a student which component he/she passed/failed
// 6. Where a student failed both component he/she is repeated.
import java.util.Scanner;

public class GradingSystemSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // Assigning variables
        int exam_score;
        int assessment_score;
        int fee;
        int fees = 100;

        //Creating an input for the exam score variable
        System.out.println("Please input your Exam Score: ");
        exam_score = input.nextInt();

        System.out.println("Please input your Assessment Score: ");
        assessment_score = input.nextInt();

        System.out.println("Please input the amount of fees paid between 0 - 100");
        fee = input.nextInt();

        switch (Int) {
            case 1:
                (exam_score >= 25 && assessment_score >= 15 && fee);
                System.out.println("You have passed!");
                break;
            
            case 2:
                (exam_score >= 25 && assessment_score >= && fee == fees)
        
            default:
                break;
        }

    }
}

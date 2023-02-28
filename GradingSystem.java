
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
import java.util.Scanner; //Importing the scanner library

public class GradingSystem {
    public static void main(String[] args) {
        // Create a variable for the scanner to be used
        Scanner input = new Scanner(System.in);

        // Creating variables for various keywords in the grading system
        int exam_score;
        int assessment_score;
        int fee;
        int fees = 100;

        // Creating an input for the exam score
        System.out.println("Please enter your exam score: ");
        exam_score = input.nextInt();

        // Creating an input for the assessment score
        System.out.println("Please enter your assessment score: ");
        assessment_score = input.nextInt();

        // The sum of exam score and assessment score stored in the variable called
        // total
        int total = exam_score + assessment_score;

        // Create an input for fees to be stored in fee variable
        System.out.println("Please enter the percentage of fees paid between 0-100: ");
        fee = input.nextInt();

        // Create a condition to satisfy requirement 1, 2 and 4.
        if (exam_score >= 25 && assessment_score >= 15 && fee != fees) {
            System.out.println("You have passed!. You will receive your certificate");
        } else if (exam_score >= 25 && assessment_score >= 15 && fee == fees) {
            System.out.println("Congratulations!, here is your certificate.");
        } else if ((exam_score == 24 && assessment_score == 15) || (exam_score == 25 && assessment_score == 14)) {
            System.out.println("You are condoned!");
        } else {
            System.out.println("You have failed!");
        }

        // Create a condition to satisfy req. 3.
        // if (exam_score >= 25 && assessment_score >= 15 && fee == fees) {
        // System.out.println("Congratulations!, here is your certificate.");
        // }

        // Create a condition to satisfy req. 5
        // if (exam_score >= 25) {
        // System.out.println("You have passed the exam score!");
        // } else {
        // System.out.println("You have failed the exam score!");
        // }

        // // Create a condition to satisfy req. 5 contd
        // if (assessment_score >= 15) {
        // System.out.println("You have passed the assessment score!");
        // } else {
        // System.out.println("You have failed the assessment score!");
        // }

        // // Create a condition to satisfy req 6.
        // if (exam_score < 25 && assessment_score < 15) {
        // System.out.println("You have been repeated!");
        // }
        if ((exam_score >= 25 && assessment_score >= 15)) {
            System.out.println("You have passed both components");
        } else if (exam_score >= 25 && assessment_score < 15) {
            System.out.println("You passed the exam component but failed the assessment component");
        } else if (exam_score < 25 && assessment_score >= 15) {
            System.out.println("You have failed the exam component but passed the assessment compoenent");
        } else if (exam_score < 25 && assessment_score < 15) {
            System.out.println("You failed both components so you have been repeated!");
        } // } else {
          // // System.out.println("You have been repeated");
          // // }
    }
}

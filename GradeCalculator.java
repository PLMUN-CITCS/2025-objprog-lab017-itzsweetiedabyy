import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int studentscore = 0;
        boolean validInput = false;

        while (!validInput){
            System.out.print("Enter your Score: ");
            if (input.hasNextInt()){
                studentscore = input.nextInt();
                validInput = true;
            } else {
                System.out.println("Invalid Input. Please enter a valid Score");
                input.next();
            }
        }

        if (studentscore >= 90) {
            System.out.println("Your Grade is: A");
        } else if (studentscore >= 80) {
            System.out.println("Your Grade is: B");
        } else if (studentscore >= 70) {
            System.out.println("Your Grade is: C");
        } else if (studentscore >= 60) {
            System.out.println("Your Grade is: D");
        } else {
            System.out.println("Your Grade is: F");
        }

        input.close();
        
    }

}
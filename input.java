import java.time.Year;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

  
            IO.print("Enter your name : ");
            String name = input.nextLine();

            IO.print("Enter Year of Birth : ");
            int yearOfBirth = input.nextInt();

            int currentYear = Year.now().getValue();
            boolean isThaiNationality = true; 

            int age = currentYear - yearOfBirth;

            IO.print("Your name is " + name);
            System.out.println(" and Age : " + age);

            boolean isEligibleToVote = (age >= 18) && isThaiNationality;

            if(isEligibleToVote){
                IO.println("You have the right to vote");
            } else {
                IO.println("You have not the right to vote");
            }

            input.close(); 

        } catch (Exception e) {
           IO.println("Input Invalid");
        }
    }
}


import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int enterNumber = 1;
        int typedNumber = 0;
        int sum = 0;

        while(enterNumber < 11){
            System.out.println("Enter the number: ");
            boolean isNumberEntered = scanner.hasNextInt();

            if(isNumberEntered){
                typedNumber = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter number #"+enterNumber+": "+typedNumber);
                sum+=typedNumber;
                enterNumber++;
            }
            else {
                System.out.println("Number was expected but....");
                break;
            }
        }
        scanner.close();
        System.out.println("The sum of these 10 number inputs is : " + sum);
    }
}

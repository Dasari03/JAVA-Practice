import java.util.Scanner;

public class MinimumAndMaximumChallenge {

    public static void main(String[] args) {
        int max = 0;
        int min = 0;
        int numTyped;
        boolean first = true;

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Enter the number : ");
            boolean isNumberEntered = scanner.hasNextInt();


            if(isNumberEntered){
                numTyped = scanner.nextInt();

                if(first){
                    first = false;
                    max = numTyped;
                    min = numTyped;
                }

                if(numTyped >= max) {
                    max = numTyped;
                }
                if(numTyped <= min) {
                    min = numTyped;
                }


            }
            else {
                System.out.println("Input type of number is expected...");
                System.out.println("max: " + max + ", min: " + min);
                break;
            }

            scanner.nextLine();

        }

            scanner.close();

    }
}

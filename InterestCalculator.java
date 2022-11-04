public class InterestCalculator {
    public static void main(String[] args) {


        for (double i = 0.0; i < 5; i++) {
            System.out.println("Interest rate is = " + (int) calculateInterest(10000, i));
        }

        System.out.println("******************************************");

        for (double i = 8.0; i > 0; i--) {
            System.out.println("Interest rate is = " + (int) calculateInterest(10000, i));
        }

        System.out.println("******************************************");
        int primeNumCount = 0;
        for( int i =0; i< 50; i++){
            if(isPrime(i) && primeNumCount < 3){
                System.out.println(i);
                primeNumCount++;
                System.out.println("primeNum Count :"+primeNumCount);
            }
        }





    }

    public static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }


        public static double calculateInterest ( double amount, double interestRate){
            return amount * (interestRate / 100);
        }


    }


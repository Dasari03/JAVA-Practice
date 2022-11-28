public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(-1));
       // System.out.println(21%3);
        //System.out.println(isPrime(17));



    }

    public static int getLargestPrime(int number){
        int biggestPrime = 0;
        int biggestDividend = 0;
        int numberOfPrime = 0;
        if(number == 0 || number < 0){
            return -1;
        }

        for(int i = 1; i <number; i++) {
            if (number % i == 0 ) {
                biggestDividend = i;
                if(isPrime(biggestDividend)){
                    biggestPrime = biggestDividend;
                }

            }
//
        }

        return biggestPrime;
    }

    public static boolean isPrime(int num){
        int primeCount = 0;
        for(int i = 1; i<=num; i++){
            if(num % i == 0){
                primeCount++;
            }

        }
        if(primeCount == 2){
            return true;
        }
        return false;
    }




}



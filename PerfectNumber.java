public class PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(28));
    }

    public static boolean isPerfectNumber(int number){
        if(number < 1){
            return false;
        }

        int sumDivisor = 0;
        for(int i = 1; i <= number; i++){
            if(number % i == 0){
                sumDivisor += i;
            }
            if(number == sumDivisor){
                return true;


            }
        }
        return false;
    }
}

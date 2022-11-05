public class DigitSum {
    public static void main(String[] args) {

        //System.out.println(sumDigits(127));
        System.out.println(1%10);
    }

        public static int sumDigits (int number){
        int twoDigit;
        int oneDigit;
        int threeDigit;
            if(number < 10 || number < 0){
                return -1;
            }else {
                if(number < 100){
                    twoDigit = number / 10;
                    oneDigit = number % 10;
                    return twoDigit + oneDigit;
                }
                if(number < 1000){
                    threeDigit = number / 100;
                    twoDigit = (number - (threeDigit*100)) / 10;
                    oneDigit = number % 10;
                    return twoDigit + oneDigit + threeDigit;
                }

                else {
                    return -1;
                }
            }
        }


}

import java.lang.reflect.Array;

public class NumberToWords {
    public static void main(String[] args) {
    numberToWords(1579);
   
    }

    public static void numberToWords(int number){
        int reversedNumber;
        int numOfDigit;
        int targetDigit;

        if(number < 0){
            System.out.println("Invalid Value");
        }

        reversedNumber = reverse(number);
        numOfDigit = getDigitCount(number);

        for(int i = 0; i < numOfDigit; i++){
            targetDigit = reversedNumber % 10;

            switch (targetDigit){
                case 0 :
                    System.out.println("Zero");
                    break;
                case 1 :
                    System.out.println("One");
                    break;
                case 2 :
                    System.out.println("Two");
                    break;
                case 3 :
                    System.out.println("Three");
                    break;
                case 4 :
                    System.out.println("Four");
                    break;
                case 5 :
                    System.out.println("Five");
                    break;
                case 6 :
                    System.out.println("Six");
                    break;
                case 7 :
                    System.out.println("Seven");
                    break;
                case 8 :
                    System.out.println("Eight");
                    break;
                case 9 :
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("IDK");
                    break;
            }
            reversedNumber/=10;
        }
    }

    public static int reverse(int number){
        int numberDigit = getDigitCount(number);
        int Digit;
        int result;

        String target = "";
        String numberStr = "";

        if(number == 0){
            return 0;
        }

        if(number > 0) {
            for (int i = 0; i < numberDigit; i++) {
                Digit = number % 10; //2
                //System.out.println("DIgit: " + Digit);
                target = Integer.toString(Digit);
                //System.out.println("Target: " + target);
                numberStr += target; //"2"
                //System.out.println("numberStr: " + numberStr);

                number = number / 10; //1
                // System.out.println("number: " + number);
//
            }

            return Integer.parseInt(numberStr);
        }
        if(number < 0) {
            int madePositive = Math.abs(number);
            numberDigit = getDigitCount(madePositive);

            for(int i = 0; i<numberDigit; i++){
                Digit = madePositive % 10; //2
                //System.out.println("DIgit: " + Digit);
                target = Integer.toString(Digit);
                //System.out.println("Target: "+ target);
                numberStr += target; //"2"
                //System.out.println("numberStr: "+ numberStr);

                madePositive = madePositive / 10; //1
                //System.out.println("number: "+madePositive);

            }
            return Math.negateExact(Integer.parseInt(numberStr));

        }


        return -1;

    }





    public static int getDigitCount(int number){
        int digit = 1;
        if(number < 0){
            return -1;
        }
        for(int i = 10; i < 10000000; i*=10){
            if(number / i !=0){
                digit++;
            }
            else{
                return digit;
            }
        }


        return digit;
    }


}

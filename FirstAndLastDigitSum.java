public class FirstAndLastDigitSum {

    public static void main(String[] args) {
       int number = 27;
        System.out.println(sumFirstAndLastDigit(8));
        System.out.println(sumFirstAndLastDigit(88));
        System.out.println(sumFirstAndLastDigit(889));
        System.out.println(sumFirstAndLastDigit(-111));
        System.out.println(sumFirstAndLastDigit(0));


        //getting first digit
//        System.out.println(number % 10);

        //formula
        //(number / 10) * 10 != 0

       //incase two digits



        //checking whether the number has 2digits.
        //System.out.println(number / 10 == 0);



        //getting second digit(last)
        //System.out.println(number / 10 % 10);

        //**************************************************

        //checking whetehr the number has 3digits.
        //System.out.println(number / 100 == 0);

        //getting first digit
        //System.out.println(number % 10);

        //getting third digit(last)
        //System.out.println((number / 100 % 10) );





    }

    public static int sumFirstAndLastDigit(int number) {
        int firstDigit = 0;
        int lastDigit = 0;
        int tens = 10;
        if(number < 0){
            return -1;
        }
        //only first digit
        if(number / 10 == 0 ){
            return (number % 10)*2;
        }
//        //only second digit
//        if(number / 100 == 0){
//            firstDigit = number % 10;
//            lastDigit = (number /10) % 10;
//            return firstDigit + lastDigit;
//        }
//        //only three digit
//        if(number / 1000 == 0){
//            firstDigit = number % 10;
//            lastDigit = (number / 100) % 10;
//            return firstDigit + lastDigit;
//        }
//        //only four digit
//        if(number / 10000 == 0){
//            firstDigit = number % 10;
//            lastDigit = (number / 1000) % 10;
//            return firstDigit + lastDigit;
//        }
        //    number is bigger than 1digit
        if(number / 10 != 0){
               firstDigit = number % 10;
               while(number / tens != 0){

                lastDigit = (number / tens) % 10;
                tens *= 10;

                }
               return firstDigit + lastDigit;
        }

else return -1;
    }

}



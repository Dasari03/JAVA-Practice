public class SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 13));


    }

    public static boolean hasSharedDigit(int num1, int num2){
        if(num1 < 10 || num2 < 10 || num1 > 99 || num2 > 99){
            return false;
        }
        int firstNum1, secondNum1, firstNum2, secondNum2;

        firstNum1 = num1 % 10;
        firstNum2 = num2 % 10;
        secondNum1 = (num1 / 10) % 10;
        secondNum2 = (num2 / 10) % 10;

        if(firstNum1 == firstNum2 || firstNum1 == secondNum2 || firstNum2 == firstNum1 || firstNum2 == secondNum1 || secondNum1 == secondNum2) {
            return true;
        }else {

            return false;
        }

    }



}

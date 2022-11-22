public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(23, 32,42));
    }

    public static boolean hasSameLastDigit(int num1,int num2,int num3){
        int num1RightMost = num1 % 10;
        int num2RightMost = num2 % 10;
        int num3RightMost = num3 % 10;


        if(num1<10 || num2<10 || num3 < 10 || num1 > 1000 || num2 > 1000|| num3 > 1000){
            return false;
        }
        if(num1RightMost == num2RightMost || num1RightMost == num3RightMost || num2RightMost == num3RightMost){
            return true;
        }
        return false;
    }

    public static boolean isValid(int num){
        if(num <= 1000 && num >= 10){
            return true;
        }
        else{
            return false;
        }
    }


}

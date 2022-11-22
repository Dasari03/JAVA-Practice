public class GreatCommonDivisor {
    public static void main(String[] args) {

        System.out.println(getGreatestCommonDivisor(12, 30));
    }

    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10){
            return -1;
        }
        //finding the biggest divisor from first
        int biggestDivisorFirst = 1;
        int biggestDivisorSecond = 1;
        int commonBiggest = 1;
        // if first is larger than second
        if( first > second) {
            for(int i = 1; i<=first; i++ ) {
                if(first % i == 0)
                    biggestDivisorFirst = i;
                if(second % i == 0)
                    biggestDivisorSecond = i;
                if(biggestDivisorFirst == biggestDivisorSecond)
                    commonBiggest = biggestDivisorFirst;
            }
        }
        // if second is larger than first
        if( second > first) {
            for(int i = 1; i<=second; i++ ) {
                if(second % i == 0)
                    biggestDivisorSecond = i;
                if(first % i == 0)
                    biggestDivisorFirst = i;
                if(biggestDivisorSecond == biggestDivisorFirst)
                    commonBiggest = biggestDivisorSecond;
            }
        }


        return commonBiggest;
    }
}

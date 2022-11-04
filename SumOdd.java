public class SumOdd {
    public static void main(String[] args) {

        System.out.println("***********************************");
        int sum = 0;
        int count = 0;
        for(int i = 1; i<=1000; i++){

            if(i%3==0 && i%5==0 && count < 5){
                System.out.println(i);
                sum += i;
                count++;
            }

        }
        System.out.println("***********************************");


        int num =4;
        int finishNumber = 20;
        int evenFoundCount = 0;
        String evenNum = "";
        
        while(num <= finishNumber){
            num++;
            if(!isEvenNumber(num)){
                continue;
            }
            evenFoundCount++;
            evenNum+= num +" ";
            if(evenFoundCount == 5){
                System.out.println(evenNum);
            }
        }


    }


    public static boolean isEvenNumber(int num){
        if(num % 2 == 0){
            return true;
        }else {
            return false;
        }
    }
}

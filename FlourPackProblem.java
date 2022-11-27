public class FlourPackProblem {
    public static void main(String[] args) {
        System.out.println(canPack(5,3,24));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int bigChunk = bigCount * 5;
        int smallChunk = smallCount;

        //sum
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        if(bigChunk + smallChunk >= goal) {
            //bigger but there is left over from bigChunk
            if (smallChunk == 0 && bigChunk % goal > 0) {
                return false;
            }
            if (smallChunk == 0 && bigChunk % goal == 0) {
                return true;
            }

            if (bigCount == 0 && smallCount >= goal) {
                return true;
            }
            if(smallCount != 0 && bigCount !=0 && (goal % 5) > smallCount){
                return false;
            }
            return true;
        }
        return false;

    }

}




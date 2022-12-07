import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] Array = {1,2,3,4,5, 7,9, 10};

        reverse(Array);
    }

    private static int[] reverse(int[] array){
        System.out.println(Arrays.toString(array));

        int[] reversedArray = array;
        for(int i=0; i < array.length; i++){
            reversedArray[i] = array[i];
        }

        int[] tempArray = new int[array.length];


        int temp4 = array[1];
        int temp5 = array[0];
        // saving to temparray from 0 to half of the length
        for(int i = 0; i < array.length / 2; i ++){
            tempArray[i] = array[i];
        }
        for(int j = 0; j < array.length; j++){

            reversedArray[j] = array[array.length-1 -j ];
        }

        for(int i = 0; i < array.length / 2; i ++){
            reversedArray[array.length -1 -i] = tempArray[i];
        }

        //reversedArray[3] = temp4;
        //reversedArray[4] = temp5;
        System.out.println("reversed array...");
        System.out.println(Arrays.toString(reversedArray));
        return reversedArray;
    }
}

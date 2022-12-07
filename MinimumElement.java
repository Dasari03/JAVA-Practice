import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
    public static void main(String[] args) {

        int num = readInteger();
        int[] array11 = readElements(num);
        System.out.println(Arrays.toString(array11));
        int minElement = findMin(array11);
        System.out.println("Minimum elements of this array is : " + minElement );

    }

    private static Scanner scanner = new Scanner(System.in);

    private static int readInteger(){
        int numElement;
        System.out.println("How many elements do you want?");
        numElement = scanner.nextInt();
        return numElement;
    }

    private static int[] readElements(int numElement){
        boolean flag = true;
        int[] newArray = new int[numElement];

        for(int i = 0; i < numElement; i++){
            System.out.println("Enter the element for the array...");
            newArray[i] = scanner.nextInt();
        }
        return newArray;
        }

    private static int findMin(int[] array){
        int length = array.length;
        int min = array[0];
        for(int i = 0 ; i < length; i++){
            if(array[i] <= min){
                min = array[i];
            }
        }
        return min;
    }

}

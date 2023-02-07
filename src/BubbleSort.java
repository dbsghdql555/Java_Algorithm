import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort extends Swap{
    public static void main(String[] args)  {
        int[] arr = new int[10];
        int random = 0;

        for (int i = 0; i < 10; i++) {
            random = (int) (Math.random()*45) + 1;
            arr[i] = random;
        }
        System.out.println(Arrays.toString(arr));
        bubblesort(arr);
    }
    public static void bubblesort(int[] arr) {
        for (int i = 0; i<arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j-1]>arr[j]) {
                    swap(arr,j-1,j);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

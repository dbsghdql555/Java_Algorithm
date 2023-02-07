import java.util.Arrays;

public class SelectionSort extends Swap {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int random = 0;

        for (int i = 0; i < 10; i++) {
            random = (int) (Math.random() * 45) + 1;
            arr[i] = random;
        }
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
    }

    public static void selectionSort(int[] arr) {
        int indexMin, temp;
        for (int i = 0; i < arr.length; i++) {
            indexMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[indexMin] > arr[j]) {
                    indexMin = j;
                }
            }
            swap(arr, i, indexMin);
        }
        System.out.println(Arrays.toString(arr));
    }
}

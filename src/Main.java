import java.util.Arrays;

public class Main {

    public static void countingSort(int[] arr) {
        int j = arr[0];
        for (int i = 0; i < arr.length; i++)
            if (j < arr[i]) {
                j = arr[i];
            }


        int[] freq = new int[j + 1];

        for (int i : arr) {
            freq[i]++;
        }

        int index = 0;
        for (int i = 0; i < j + 1; i++) {
            while (freq[i]-- > 0) {
                arr[index++] = i;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,4,5,1,2,5,2,2,2,3,4,1,6,1,2,5,3,5};
        countingSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}

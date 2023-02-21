import java.util.Arrays;
import java.util.Random;

public class Program {
    static void printArray(int[] array){
        for (int i = 0; i < array.length - 1; i++){
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length - 1]);
    }
    static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) return arr;
        int[] left = Arrays.copyOfRange(arr, 0, arr.length / 2);
        int[] right = Arrays.copyOfRange(arr, left.length, arr.length);
        return merge(mergeSort(left), mergeSort(right));
    }

    static int[] merge(int[] left, int[] right) {
        int resIndex = 0, leftIndex = 0, rightIndex = 0;
        int[] result = new int[left.length + right.length];

        while (leftIndex < left.length && rightIndex < right.length)
            if (left[leftIndex] < right[rightIndex])
                result[resIndex++] = left[leftIndex++];
            else result[resIndex++] = right[rightIndex++];

        while (resIndex < result.length)
            if (leftIndex != left.length)
                result[resIndex++] = left[leftIndex++];
            else result[resIndex++] = right[rightIndex++];

        return result;
    }
    public static void main(String[] args) {
        int[] array = new int[10];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = rnd.nextInt(1,20);
        }
        System.out.println("Изначальный массив:");
        printArray(array);
        array = mergeSort(array);
        System.out.println("Отсортированный массив:");
        printArray(array);
    }
}

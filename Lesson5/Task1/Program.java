import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Program {
    public static void main(String[] args) {
        int[] nums1 = new int[] {1,2,3,2,1};
        int[] nums2 = new int[] {6,7,3,2,1};
        System.out.println("Первый массив:");
        System.out.println(Arrays.toString(nums1));
        System.out.println("Второй массив:");
        System.out.println(Arrays.toString(nums2));
        sameSubarray1(nums1, nums2);
        sameSubarray2(nums1, nums2);
    }
//    Метод решения через два указателя
    static void sameSubarray1(int[] arr1, int[] arr2){
        int maxLen = 0;
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                int p1 = i;
                int p2 = j;
                int maxLenTemp = 0;
                while (p1 < arr1.length && p2 < arr2.length && arr1[p1] == arr2[p2]) {
                    if (arr1[p1] == arr2[p2])
                    maxLenTemp++;
                    if (maxLenTemp > maxLen) {
                        maxLen = maxLenTemp;
                        index = i;
                    }
                    p1++;
                    p2++;
                }
            }
        }
        int [] sameNumbers = Arrays.copyOfRange(arr1, index, index + maxLen);
        if (sameNumbers.length == 0){
            System.out.println("Повторяющихся подмассивов не существует");
        } else {
            System.out.println("Повторяющийся подмассив с максимальной длинной:");
            System.out.println(Arrays.toString(sameNumbers));
        }
    }
//    Метод решения через HashSet
    static void sameSubarray2 (int[] arr1, int[] arr2){
        HashSet<ArrayList<Integer>> hs1 = createSubarrays(arr1);
        HashSet<ArrayList<Integer>> hs2 = createSubarrays(arr2);
        hs1.retainAll(hs2);
        int max = 0;
        for (ArrayList<Integer> item : hs1) {
            if (item.size() > max){
                max = item.size();
            }
        }
        if (max == 0){
            System.out.println("Повторяющихся подмассивов не существует");
        } else{
            System.out.println("Повторяющийся подмассив с максимальной длинной:");
            for (ArrayList<Integer> item : hs1){
                if (item.size() == max){
                    System.out.println(item.toString());
                }
            }
        }
    }
    static HashSet<ArrayList<Integer>> createSubarrays(int[] arr){
        HashSet<ArrayList<Integer>> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                ArrayList<Integer> al = new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    al.add(arr[k]);
                }
                hs.add(al);
            }
        }
        return hs;
    }
}

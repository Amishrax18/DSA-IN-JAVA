import java.util.*;

public class twoSum {

    public static boolean twoSum(int arr[], int target) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int arr[] = {2, 4, 3, 1, 5, -1};
        int target = 2;

        boolean result = twoSum(arr, target);
        System.out.println(result);
    }
}
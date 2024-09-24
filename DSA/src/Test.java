import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int arr[] = { 10, 9, 8, 24, 2, 99, 1 };
        System.out.println("Array Before Sorting: " + Arrays.toString(arr));
        sortedArray(arr, 0, arr.length - 1);
        System.out.println("Array After Sorting: " + Arrays.toString(arr));
    }

    static void sortedArray(int nums[], int start, int end) {
        if (start >= end) return;
        int mid = start + (end - start) / 2;

        sortedArray(nums, start, mid);
        sortedArray(nums, mid + 1, end);

        merge(nums, start, mid, end);
    }

    static void merge(int arr[], int start, int mid, int end) {
        int left = start;
        int right = mid + 1;
        ArrayList<Integer> list = new ArrayList<>();

        while (left <= mid && right <= end) {
            if (arr[left] < arr[right]) {
                list.add(arr[left]);
                left++;
            } else {
                list.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            list.add(arr[left]);
            left++;
        }
        while (right <= end) {
            list.add(arr[right]);
            right++;
        }
        for (int i = start; i <= end; i++) {
            arr[i] = list.get(i - start);
        }
    }
}

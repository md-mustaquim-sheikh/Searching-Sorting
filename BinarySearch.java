
public class BinarySearch{

    public static void main(String[] args) {
        int[] arr = {-9,-2,0, 4, 6, 9, 12, 34, 65, 78, 90};
        int target = 9;
        System.out.println("Element found at index :" + BinarySearch(arr, target));
    }

    static int BinarySearch(int[] arr, int target) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}

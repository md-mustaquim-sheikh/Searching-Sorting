public class LinearSearch{
    public static void main(String[] args) {
        int[] arr = {23,12,45,65,78,97,62,92}; 
        int element = 62;
        System.out.println("Element found at index :"+LinearSearch(arr, element));
        System.out.println("Element is :"+arr[LinearSearch(arr,element)]);
    }
    static int LinearSearch(int[] arr, int target){
        if (arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
                if (arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
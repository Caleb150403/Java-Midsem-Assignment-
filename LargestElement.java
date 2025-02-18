public class LargestElement {
    public static void main(String[] args) {
        int[] arr = {10, 25, 98, 3, 67};
        int max = arr[0];

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Largest element: " + max);
    }
}
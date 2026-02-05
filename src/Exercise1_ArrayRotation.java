public class Exercise1_ArrayRotation {

    public static void rotate(int[] arr, int d, int n) {

        // Reduce d if it is larger than the array size
        d = d % n;

        // Store the first d elements
        int[] temp = new int[d];

        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        // Shift the remaining elements to the left
        for (int i = d; i < n; i++) {
            arr[i - d] = arr[i];
        }

        // Add the stored elements to the end
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
    }

    // Test method
    public static void test() {

        // Test 1
        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.print("Before: ");
        for (int v : arr1) {
            System.out.print(v + " ");
        }
        System.out.println();

        rotate(arr1, 2, arr1.length);

        System.out.print("After:  ");
        for (int v : arr1) {
            System.out.print(v + " ");
        }
        System.out.println("\n");

        // Test 2 (d > array size)
        int[] arr2 = {10, 20, 30, 40};
        System.out.print("Before: ");
        for (int v : arr2) {
            System.out.print(v + " ");
        }
        System.out.println();

        rotate(arr2, 6, arr2.length);

        System.out.print("After:  ");
        for (int v : arr2) {
            System.out.print(v + " ");
        }
        System.out.println();
    }
}

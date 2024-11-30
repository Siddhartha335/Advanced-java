package Practice;

public class CenteredArray {
    public static int isCenteredArray(int[] arr) {
        // Check if the array has an odd number of elements
        if (arr.length % 2 == 0) {
            return 0;
        }

        int middleIndex = arr.length / 2;
        int middleValue = arr[middleIndex];

        for (int i = 0; i < arr.length; i++) {
            if (i != middleIndex && arr[i] <= middleValue) {
                return 0; // Return 0 if any element is not greater than the middle element
            }
        }

        return 1; // Return 1 if the array is centered
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 1, 20, 15,0};
        System.out.println(isCenteredArray(arr)); // Output: 1 (since 10 is the middle value and others are greater)
    }
}


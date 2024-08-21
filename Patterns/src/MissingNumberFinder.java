public class MissingNumberFinder {
    public static int findMissingNumber(int[] array, int n) {
        // Step 1: Calculate the expected sum of the first n natural numbers
        int expectedSum = n * (n + 1) / 2;

        // Step 2: Calculate the actual sum of the elements in the array
        int actualSum = 0;
        for (int num : array) {
            actualSum += num;
        }

        // Step 3: The missing number is the difference between the expected sum and the actual sum
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6};  // Example array
        int n = 6;  // The range is from 1 to 6
        int missingNumber = findMissingNumber(array, n);
        System.out.println("The missing number is: " + missingNumber);
    }
}

class Solution {
    public int peakElement(int[] arr, int n) {
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if mid is a peak
            boolean leftOk = (mid == 0) || (arr[mid] >= arr[mid - 1]);
            boolean rightOk = (mid == n - 1) || (arr[mid] >= arr[mid + 1]);

            if (leftOk && rightOk) {
                return mid; // Found a peak
            }

            // If left neighbor is greater, move to left half
            if (mid > 0 && arr[mid - 1] > arr[mid]) {
                high = mid - 1;
            } 
            // Else move to right half
            else {
                low = mid + 1;
            }
        }

        return -1; // This line won't be reached (problem guarantees a peak exists)
    }
}

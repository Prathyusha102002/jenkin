
public class BinarySearch {
	public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 6;
        int result = binarySearch(arr, target);
        if (result != -1)
        {
            System.out.println("Element " + target + " found at index " + result);
        }
        else
        {
            System.out.println("Element " + target + " not found in the array.");
        }

	}
	public static int binarySearch(int[] arr, int target) {

        int left = 0; // first index
        int right = arr.length - 1; // last index
        while (left <= right)
        {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target)
            {
                return mid; // Return the index where the target is found
            }
            if (arr[mid] < target)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }
        return -1; // Return -1 if the target is not found
	}


}

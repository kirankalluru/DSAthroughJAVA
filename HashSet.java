public class HashSet {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1, 6, 7, 3}; // Example array

        System.out.println("Duplicate elements in the array are:");
        
        // Loop through the array
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;
            
            // Compare the current element with all the elements after it
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break; // Exit the inner loop once a duplicate is found
                }
            }
            
            // If a duplicate is found, print the element
            if (isDuplicate) {
                System.out.println(arr[i]);
            }
        }
    }
    
}
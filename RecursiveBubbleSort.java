
public class RecursiveBubbleSort {
	static void bubbleSort(int arr[], int n) 
    { 
        // Base case 
        if (n == 1) 
            return; 
       
        // One pass of bubble sort. After 
        // this pass, the largest element 
        // is moved (or bubbled) to end. 
        for (int i=0; i<n-1; i++) 
            if (arr[i] > arr[i+1]) 
            { 
                // swap arr[i], arr[i+1] 
                int temp = arr[i]; 
                arr[i] = arr[i+1]; 
                arr[i+1] = temp; 
            } 
       
        // Largest element is fixed, 
        // recur for remaining array 
        bubbleSort(arr, n-1); 
    } 
	 static void printArray(int arr[]) 
	    { 
	        int n = arr.length; 
	        for (int i=0; i<n; ++i) 
	            System.out.print(arr[i] + " "); 
	        System.out.println(); 
	    }
	 
	 public static void main(String[]args) {
			
			int[]arr1= {34,19,2,9,1,55,0,33,4,99,54,23,12};
			bubbleSort(arr1,12);
			printArray(arr1);
			
		}
}

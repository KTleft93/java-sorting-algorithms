
public class RecursiveInsertionSort {
	 
    static void insertionSortRecursive(int arr[], int n) 
    
    {    
        if (n <= 1) 
            return; 
       
        
        insertionSortRecursive( arr, n-1 ); 
     
        int last = arr[n-1]; 
        int j = n-2; 
       
        
        while (j >= 0 && arr[j] > last) 
        { 
            arr[j+1] = arr[j]; 
            j--; 
        } 
        arr[j+1] = last; 
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
		
		// n is the last index position +1
		insertionSortRecursive(arr1,13);
		printArray(arr1);
		
	}
    
}

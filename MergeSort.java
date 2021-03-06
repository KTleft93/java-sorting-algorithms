
public class MergeSort {
	public static void mergeSort(int[] array) 
    { 
        if(array == null) 
        { 
            return; 
        } 
  
        if(array.length > 1) 
        { 
            int mid = array.length / 2; 
  
            // Split left part 
            int[] left = new int[mid]; 
            for(int i = 0; i < mid; i++) 
            { 
                left[i] = array[i]; 
            } 
              
            // Split right part 
            int[] right = new int[array.length - mid]; 
            for(int i = mid; i < array.length; i++) 
            { 
                right[i - mid] = array[i]; 
            } 
            mergeSort(left); 
            mergeSort(right); 
  
            int i = 0; 
            int j = 0; 
            int k = 0; 
  
            // Merge left and right arrays 
            while(i < left.length && j < right.length) 
            { 
                if(left[i] < right[j]) 
                { 
                    array[k] = left[i]; 
                    i++; 
                } 
                else
                { 
                    array[k] = right[j]; 
                    j++; 
                } 
                k++; 
            } 
            // Collect remaining elements 
            while(i < left.length) 
            { 
                array[k] = left[i]; 
                i++; 
                k++; 
            } 
            while(j < right.length) 
            { 
                array[k] = right[j]; 
                j++; 
                k++; 
            } 
        } 
    } 
	 static void printArray(int arr[]) 
	    
	 { 
	        int n = arr.length; 
	        for (int i=0; i<n; ++i) 
	            System.out.print(arr[i] + " "); 
	       System.out.println(); 
	 
	 }
	 
	 public static void main(String[]args) {
		 
			int[]arr1= {2,9,1,55,0,33,4,99,54,23,12};
			mergeSort(arr1);
			printArray(arr1);
			
		}

}

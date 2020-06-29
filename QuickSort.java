
public class QuickSort {
	static int partition(int arr[], int low, int high) 
    { 
        int pivot = arr[high]; 
        int i = (low - 1); 
        for (int j = low; j <= high - 1; j++) { 
            
            if (arr[j] <= pivot) { 
                i++; 
  
                
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
       
        int temp = arr[i + 1]; 
        arr[i + 1] = arr[high]; 
        arr[high] = temp; 
  
        return i + 1; 
    } 
	static void qSort(int arr[], int low, int high) 
    { 
        if (low < high) { 
      
            int pi = partition(arr, low, high); 
  
            qSort(arr, low, pi - 1); 
            qSort(arr, pi + 1, high); 
        }}
        static void printArray(int arr[]) 
        { 
            int n = arr.length; 
            for (int i=0; i<n; ++i) 
                System.out.print(arr[i] + " "); 
            System.out.println(); 
        
    }
	public static void main(String[]args) {
		
		int[]arr1= {34,19,2,9,1,55,0,33,4,99,54,23,12};
		qSort(arr1,0,12);
		printArray(arr1);
		
	}
  
}

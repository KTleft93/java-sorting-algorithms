
public class RecursiveSelectionSort {

	
	public static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	
	public static void selectionSort(int[] arr, int i, int n)
	{
		
		int min = i;
		for (int j = i + 1; j < n; j++)
		{
		
			if (arr[j] < arr[min]) {
				min = j;	
			}
		}

		swap(arr, min, i);

		if (i + 1 < n) {
			selectionSort(arr, i + 1, n);
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
			
			int[]arr1= {34,19,2,9,1,55,0,33,4,99,54,23,12};
			
			//n index position is + 1
			selectionSort(arr1,0,13);
			printArray(arr1);
			
		}

}

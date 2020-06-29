
import java. util.*;
public class Nwazirik_Chapter8Lab1 {
//Kean Nwaziri
//Program creates and fills a 2 dim array and prints the sum of the rows
	public static void main(String[] args) {

		int [][] matrix = createAndFillArray();
		printArray(matrix);
		int [] sums = calcSums(matrix); 
		printSums(sums);
	}

	public static int [][] createAndFillArray() {

		Scanner red=new Scanner(System.in);
		int[][]matrix=new int[3][3];

		for(int row=0;row<matrix.length;row++) {
			System.out.println("Enter the 3 values for row: " );
			for(int col=0;col<matrix[row].length;col++) {

				matrix[row][col]=red.nextInt();

			}
		}

		return matrix;
	}
	
	
	
	public static int [] calcSums (int [][] matrix) {
		int sum=0;
		int[] table=new int[matrix.length];
		for(int row=0;row<matrix.length;row++) {
			sum=0;
			for(int col=0;col<matrix[row].length;col++) {
				sum=sum+matrix[row][col];
			}
			table[row]=sum;
		}
		return table;

	}
	
	
	public static void printSums (int [] sums) {

		for(int row=0;row<sums.length;row++) {
	System.out.println("The sum of row " +row + " is " + sums[row]);
		}
	}
	
	
	public static void printArray(int [][] matrix) {

		for(int row=0;row<matrix.length;row++) {
			for(int col=0;col<matrix[row].length;col++) {
				System.out.print(matrix[row][col]+ " ");
			}
			System.out.println();
		}
	}
	
    }



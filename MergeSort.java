import java.util.*;

public class MergeSort
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

    System.out.print("Enter the length of the array to be sorted: ");
    int length = scan.nextInt();
    int[] input = new int[length];
    System.out.print("Enter the numbers separted by space: ");
    for(int i = 0; i < length; i++) {
        input[i] = scan.nextInt();
    }
		
		System.out.println("Bofore sorting: ");
		for(int i = 0; i < input.length; i++) {
		    System.out.print(input[i] + " ");
		}
		System.out.println();
		
		mergeSort(input);
		
		System.out.println("After sorting: ");
		for(int i = 0; i < input.length; i++) {
		    System.out.print(input[i] + " ");
		}
	}
	
	private static void mergeSort(int[] input) {
	    if(input.length == 1) {
	        return;
	    }
	    
	    int mid = input.length / 2;
	    int[] left = new int[mid];
	    int[] right = new int[input.length - mid];
	    int leftIndex = 0;
	    int rightIndex = 0;
	    
	    for(int i = 0; i < input.length; i++) {
	        if(i < mid) {
	            left[leftIndex++] = input[i];
	        } else {
	            right[rightIndex++] = input[i];
	        }
	    }
	    
	    mergeSort(left);
	    mergeSort(right);
	    
	    merge(left, right, input);
	}
	
	private static void merge(int[] left, int[] right, int[] input) {
	    int i = 0;
	    int j = 0;
	    int k = 0;
	    
	    while(i < left.length && j < right.length) {
	        if(left[i] <= right[j]) {
	            input[k++] = left[i++];
	        } else {
	            input[k++] = right[j++];
	        }
	    }
	    
	    while(i < left.length) {
	        input[k++] = left[i++];
	    }
	    
	    while(j < right.length) {
	        input[k++] = right[j++];
	    }
	}
}

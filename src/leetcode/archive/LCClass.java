package leetcode.archive;
import java.util.Scanner ;
import java.util.Arrays;

public class LCClass {
	//to return the peak element in an given array of integer that first strictly increases and then strictly decreases
	public static int peakinArray(int[] arr) {
		for (int i=0 ; i < arr.length ; i++) {
			if (arr[i]>arr[i+1]) {
				return arr[i] ;
			}
		}
		return 0;
	}
	//another method for peak in mountain array 
	
	
	// swap or interchange indices in an array 
	public void swap(int[] arr,int a,int b) {
		int temp = arr[a] ;
		arr[a] = arr[b] ;
		arr[b] = temp ;
		
	}
	//find the maximum element in an normal array 
	public int maxinArray(int [] arr) {
		int max=arr[0] ;
		Scanner sc = new Scanner(System.in) ;
		for(int i=0 ; i < 5 ; i++) {
			System.out.println("enter "+i+" index of an array :");
			 arr[i] = sc.nextInt() ; 
		}
		for(int i=0 ; i < 5 ; i++) {
			if(max < arr[i]) {
				max=arr[i] ;
				
			}
		}
		return max ;
		
	}
	//reverse an array 
	public int[] reverseArray(int[] arr) {
		 int i = 0;
		 int j = arr.length - 1;
		 while (i < j) {
		        int temp = arr[i];
		        arr[i] = arr[j];
		        arr[j] = temp;

		        i++;
		        j--;
		    }

		    return arr;
		
	}
	
	public static void main(String[] args) {
		int[] lst = {1,2,6,6,7,7,7,2,1} ;
		LCClass obj = new LCClass() ;
		System.out.println(obj.peakinArray(lst)) ;
		obj.swap(lst, 1, 2);
		System.out.println(Arrays.toString(lst)) ;
		int[] array = new int[5] ;
		System.out.println(obj.maxinArray(array)) ;
		obj.reverseArray(lst);
		System.out.println(Arrays.toString(lst));
		
			
			
		}
}
		

	



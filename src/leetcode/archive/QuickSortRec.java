package recursion;

import java.util.Arrays;

public class QuickSortRec {

	public static void main(String[] args) {
		int[] arr = {3,45,32,34,5,99} ;
		quickRec(arr, 0, arr.length-1) ;
		System.out.println(Arrays.toString(arr)) ;
	}
	public static void quickRec(int[] arr, int l, int h) {
		if(l>=h) {
			return ;
		}
		int s = l ;
		int e = h ;
		int pivot = s+(e-s)/2 ; //middle element as pivot
		
		//swap the start and end element to keep the lhs<pivot and rhs>pivot requirement true.
		while(s<=e) {
			while(arr[s]<arr[pivot]) {
				s++ ;
			}
			while(arr[e]>arr[pivot]) {
				e-- ;
			}
			if(s<=e) {  // Double check as the above two while loops may just violate the parent while loop till they reach the whole body.
				int temp = arr[s] ;
				arr[s] = arr[e] ;
				arr[e] = temp ;
				s++ ;
				e-- ;
			}
		}
		
		quickRec(arr, l, e) ;
		quickRec(arr, s, h) ;
	}

}

package leetcode.archive;
import java.util.* ;

public class MergeSortRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] result = {5, 4, 2, 1, 3, 4000000};

        result = mergeSortRec(result);

        System.out.println(Arrays.toString(result));

	}
	public static int[] mergeSortRec(int[] nums) {
		if(nums.length == 1) {
			return nums ;
		}
		int mid = nums.length/2 ;
		int[] left = mergeSortRec(Arrays.copyOfRange(nums, 0, mid)) ;
		int[] right = mergeSortRec(Arrays.copyOfRange(nums, mid, nums.length)) ;
		return merge(left, right) ;
	}
	public static int[] merge(int[] first, int[] second) {
		int[] arr = new int[first.length + second.length] ;
		int i = 0 ;
		int j = 0 ;
		int k = 0 ;
		while(i<first.length && j<second.length) {
			if(first[i]<second[j]) {
				arr[k]=first[i] ;
				i++ ;
			}else {
				arr[k]= second[j] ;
				j++ ;
			}
			k++ ;
		}
		while(i<first.length) {
			arr[k]=first[i] ;
			i++ ;
			k++ ;
		}
		while(j<second.length) {
			arr[k]=second[j] ;
			j++ ;
			k++ ;
		}
		return arr ;
	}

}

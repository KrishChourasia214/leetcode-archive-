package leetcode.archive;
import java.util.* ;

public class SelectionSortRec {
	public static void main(String[] args) {
		int[] arr = {5, 4, 2, 1, 3, 4000000};

        selectionSortRec(arr, arr.length, 0, 0);

        System.out.println(Arrays.toString(arr));
	}
	public static void selectionSortRec(int[] nums, int i, int j, int max) {
		if(i==0) {
			return ;
		}
		if(j<i) {
			if(nums[max]<nums[j]) {
				selectionSortRec(nums, i, j+1, j) ;
			}
			else {
				selectionSortRec(nums, i, j+1, max) ;
			}
		}
		else {
			int temp = nums[max] ;
			nums[max] = nums[i-1] ;
			nums[i-1] = temp ;
			selectionSortRec(nums, i-1, 0, 0) ;
		}
	}
	
}

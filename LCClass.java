package leetcode.archive;

public class LCClass {
	public static int peakinArray(int[] arr) {
		for (int i=0 ; i < arr.length ; i++) {
			if (arr[i]>arr[i+1]) {
				return arr[i] ;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		int[] lst = {1,2,6,6,7,7,7,2,1} ;
		LCClass obj = new LCClass() ;
		System.out.println(obj.peakinArray(lst)) ;
		
			
			
		}
}
		

	



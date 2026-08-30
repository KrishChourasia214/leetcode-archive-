package recursion;

public class MergeRecInPlace {

	public static void main(String[] args) {
		int[] arr = {4,3,2,1,9,76,35} ;
		mergeRecInPlace(arr, 0, arr.length) ;
		System.out.println(arr) ;
	}
	public static void mergeRecInPlace(int[] arr, int s, int e) {
		if(e-s==1) {
			return ;
		}
		int mid = s+(e-s)/2 ;
		
		mergeRecInPlace(arr, s, mid) ;
		mergeRecInPlace(arr, mid, e) ;
		
		mergeInPlace(arr, s, mid, e) ;
	}
	public static void mergeInPlace(int[] arr, int s, int m, int e) {
		int i = s ;
		int j = m ;
		int k = 0 ;
		int[] mix = new int[e-s] ;
		
		while(i<m && j<e) {
			if(arr[i]<arr[j]) {
				mix[k] = arr[i] ;
				i++ ;
			}else {
				mix[k] =  arr[j] ;
				j++ ;
			}
			k++ ;
		}
		
		while(i<m) {
			mix[k] = arr[i] ;
			i++ ;
			k++ ;
		}
		
		while(j<e) {
			mix[k] = arr[j] ;
			j++ ;
			k++ ;
		}
		
		for(int l=0 ; l<mix.length ; l++) {
			arr[l+s] = mix[l] ;
		}
	}

}

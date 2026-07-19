package leetcode.archive;

public class SumOfPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 5 ;
		int answer = sumofPrimes(value) ;
		System.out.println(answer) ;

	}
	public static int sumofPrimes(int n) {
		int sum = 0 ;
		if(n==0) {
			return 0 ;
		}
		for(int i = 1 ; i<n ; i++) {
			if(isPrime(i, i-1)) {
				sum+= i ;
			}
		}
		return sum ;
	}
	public static boolean isPrime(int i, int j) {
		if(i<=1) {
			return false ;
		}
		if(j==1) {
			return true ;
		}
		if(i%j==0) {
			return false ;
		}
		return isPrime(i,j-1) ;
	}

}

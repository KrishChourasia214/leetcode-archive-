// Amazon medium level question for number of ways to throw a dice to add up to the target value n
//Where 1<=n<=6
//Output : all the ways in an array
package recursion;

import java.util.List;
import java.util.* ;

public class Amazon {

	public static void main(String[] args) {
		List<String> ans = new ArrayList<>() ;
//		f("",4,ans);
//		System.out.println(ans) ;
		System.out.println(fh("",6)) ;
	}
	public static void f(String p, int up, List<String> arr) {
		if(up==0) {
			arr.add(p) ;
			return ;
		}
		int i = up ;
		for(int j=1 ; j<=up ; j++) {
			f(p+j,up-j,arr) ;
		}
	}
	public static List<String> fh(String p, int up) {
		if(up==0) {
			ArrayList<String> list = new ArrayList<>() ;
			list.add(p) ;
			return list ;
		}
		ArrayList<String> list = new ArrayList<>() ;
		int i = up ;
		for(int j=1 ; j<=up ; j++) {
			list.addAll(fh(p+j,up-j)) ;
		}
		return list ;
	}

}

package recursion;
import java.util.* ;
public class Permutation {

	public static void main(String[] args) {
		String str = "abc" ;
		permRec("",str) ;
		System.out.println(permRecList("", "abc")) ;
	}
	
	public static void permRec(String p, String up) {
		if(up.isEmpty()) {
			System.out.println(p) ;
			return ;
		}
		char ch = up.charAt(0) ;
		for(int i = 0; i<=p.length(); i++) {
			String f = p.substring(0,i) ;
			String s = p.substring(i, p.length()) ;
			permRec(f+ch+s, up.substring(1)) ;
			
		}
		
	}
	public static ArrayList<String> permRecList(String p, String up){
		if(up.isEmpty()) {
			ArrayList<String> list = new ArrayList<>() ;
			list.add(p) ;
			return list ;
		}
		char ch = up.charAt(0) ;
		ArrayList<String> ans = new ArrayList<>() ;
		for(int i = 0 ; i<p.length()+1 ; i++) {
			String f = p.substring(0,i) ;
			String s = p.substring(i, p.length()) ;
			ans.addAll(permRecList(f+ch+s, up.substring(1))) ;
		}
		return ans ;
	}

}

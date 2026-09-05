package recursion;
import java.util.ArrayList ;

public class Subset {

	public static void main(String[] args) {
		String up = "abc" ;	         //Unprocessed
		String p = "" ;              //Processed
		ArrayList<String> set = new ArrayList<>() ;
		subseqeasy(up, set, p) ;
		System.out.println(set) ;
		System.out.println(subseqhard(p, up)) ;

	}
	//Taking an arrayloist in the argument is easier, but it creates different reference variables pointing to the same arraylist hence smaller space complexity
	//shared-list/backtracking approach
	public static void subseqeasy(String up, ArrayList<String> set, String p){
		if(up.isEmpty()) {
			set.add(p) ;
			return ;
		}
		char ch = up.charAt(0) ;
		
		subseqeasy(up.substring(1),set, p+ch) ;
		subseqeasy(up.substring(1), set, p) ;
		
	}
	// returning-list approach
	public static ArrayList<String> subseqhard(String p, String up){
		if(up.isEmpty()) {
			ArrayList<String> list = new ArrayList<>() ;
			list.add(p) ;
			return list ;
		}
		
		char ch = up.charAt(0) ;
		ArrayList<String> left = subseqhard(p+ch, up.substring(1)) ;
		ArrayList<String> right = subseqhard(p, up.substring(1)) ;
		
		left.addAll(right) ;
		return left ;

	}

}

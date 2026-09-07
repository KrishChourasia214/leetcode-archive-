package recursion;

//Questions practiced in gfg that can't be submitted and already with an solution. So i solved here without watching the solution.
public class GFG {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		String str = "aaaaabbbbbbbbb" ;
		System.out.println(removeDuplicates(sb, str)) ;
		
	}
	public static String removeDuplicates(StringBuilder p, String str) {
		if(str.isEmpty()) {
			return p.toString();
		}
		if(p.length()==0 || p.charAt(p.length()-1)!=str.charAt(0)) {
			return removeDuplicates(p.append(str.charAt(0)), str.substring(1)) ;
		}
		return removeDuplicates(p, str.substring(1)) ;
		
	}

}

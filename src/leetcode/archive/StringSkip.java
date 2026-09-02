package recursion;

public class StringSkip {

	public static void main(String[] args) {
		String str = "bbacbaa" ;
		StringBuilder sb = new StringBuilder() ;
		String str1 = stringSkip(str, sb, 'b', 0) ;
		System.out.println(str1) ;

	}
	public static String stringSkip(String str, StringBuilder sb,  char s, int i) {
		if(i>=str.length()) {
			return sb.toString() ;		}
		if(str.charAt(i)!=s) {
			sb.append(str.charAt(i)) ;
		}
		return stringSkip(str, sb, s, i+1) ;
	}

}

package recursion;

public class StringSkip {

	public static void main(String[] args) {
		String str = "bbachbaa" ;
		String str2 = "ApplePie" ;
		StringBuilder sb = new StringBuilder() ;
		String str1 = charSkip(str, sb, 'b', 0) ;
		System.out.println(str1) ;
		StringBuilder sb1 = new StringBuilder() ;
		String str3 = stringSkip(str2,"Apple", 0, sb1) ;
		System.out.println(str3) ;

	}
	// Skip only a character
	public static String charSkip(String str, StringBuilder sb,  char s, int i) {
		if(i>=str.length()) {
			return sb.toString() ;		}
		if(str.charAt(i)!=s) {
			sb.append(str.charAt(i)) ;
		}
		return charSkip(str, sb, s, i+1) ;
	}
	// Skip a string i.e. "Apple"
	public static String stringSkip(String str, String skip, int i, StringBuilder sb) {
		if(i>=str.length()) {
			return sb.toString() ;
		}
		if(str.startsWith(skip, i)) {
			return stringSkip(str, skip, i+skip.length(), sb) ;
		}
		sb.append(str.charAt(i)) ;
		return stringSkip(str, skip, i+1, sb) ;
		
	}
	
	

}

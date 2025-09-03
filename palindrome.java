class Solution {
    public boolean isPalindrome(int x) {
        int y = x ;
        int ans = 0 ;
        while (x>0) {
            int rem = x % 10 ; 
            x /= 10 ;
            ans = ans*10+rem ;
        }
        if (y==ans) {
            return true ;
        } else {
            return false ;
        }
    }
}

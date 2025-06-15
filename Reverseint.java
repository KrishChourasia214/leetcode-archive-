class Solution {
    public int reverse(int x) {
        int ans = 0 ;
        int y = x ;
        x = Math.abs(x);
        
        
        while(x != 0) {
            int rem = x%10 ;
            if (ans > (Integer.MAX_VALUE-rem)/10) {
                 return 0 ;
            }
            x/=10 ;
            ans = ans*10+rem ;
        }
         if (y<0) {
            ans = -ans ;

        }
        return ans ;
    }
}

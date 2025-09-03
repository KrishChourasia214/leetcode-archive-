class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int lengthj = jewels.length() ;
        int lengths = stones.length() ;
        int count = 0 ;
        for(int i=0;i<lengthj;i++) {
            for(int j=0;j<lengths;j++) {
                if (jewels.charAt(i) == stones.charAt(j)) {
                    count++ ;
                }
            }
        }
        
        
    return count ;
    }

}

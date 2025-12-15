class Solution3146 {
    public int findPermutationDifference(String s, String t) {
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        int count =0;
        for(int i =0; i<ss.length;i++){
            for(int j =0; j<tt.length;j++){
                if(ss[i]==tt[j]){
                    count += Math.abs(i-j);
                }
            }
        }
        return count;
        
    }
}
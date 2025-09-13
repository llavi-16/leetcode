class Solution {
    public int maxFreqSum(String s) {
        int[] fre = new int[26];
        for(int ch: s.toCharArray()){

            fre[ch - 'a'] +=1;
        }

        int vmax =0;
        int cmax =0;
        String v ="aeiou";

        for(int i =0;i<26;i++){
            char ch = (char)(i+'a');
            int f = fre[i];

            if(v.indexOf(ch) != -1){
                vmax = Math.max(vmax,f);
            }else{
                cmax =Math.max(cmax,f);
            }
        }
        return vmax + cmax;
        
    }
}
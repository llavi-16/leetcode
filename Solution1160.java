class Solution1160 {
    public int countCharacters(String[] words, String chars) {
        int[] cou = new int[26];
        for(char chh :chars.toCharArray()){
            cou[chh-'a']++;
        }
        int ans =0;
        for(String st :words){
            int[] fre = new int[26];
            for(char ch : st.toCharArray()){
                fre[ch - 'a']++;
            }
        
            boolean ok = true;
            for(int i =0; i<26;i++){
                if(fre[i] > cou[i]){
                    ok = false;
                    break;
                }
            }
        
            if(ok){
                ans += st.length();
            }
        }

        return ans;

        
    }
}
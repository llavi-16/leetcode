class Solution2000 {
    public String reversePrefix(String word, char ch) {
        int ind = word.indexOf(ch);
        if(ind<0){
            return word;
        }
        
        String pre = word.substring(0,ind+1);
        StringBuilder sb = new StringBuilder(pre);
        sb.reverse();
        sb.append(word.substring(ind+1));
        return sb.toString();

        
    }
}
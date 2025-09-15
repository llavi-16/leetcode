class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int count =0;
        for(String word :words){
            for(char ch : word.toCharArray() ){
                if(brokenLetters.indexOf(ch)!=1){
                    count += 1;
                    break;
                }
            }
        }
        return words.length - count;  
    }
}
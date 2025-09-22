class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> fre = new HashMap<>();
        int mfre = 0;
        for(int num:nums){
            int count = fre.getOrDefault(num,0)+1;
            fre.put(num,count);
            mfre = Math.max(count, mfre);
        }
        int rel =0;
        for(int val:fre.values()){
            if(val==mfre){
                rel+=val;
            }
        }
        return rel;
        
    }
}
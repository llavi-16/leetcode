class Solution1365{
    public int[] smallerNumbersThanCurrent(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i<nums.length;i++){
            int count =0;
            for(int j =0; j<nums.length;j++){
                if(i==j){
                    continue;
                }
                if(nums[i]>nums[j]){
                    count++;   
                }    
            }
            list.add(count);
        }
        int[] res = new int[list.size()];
        for(int i =0; i<list.size();i++){
            res[i] = list.get(i);
        }
        return res;
    }
}
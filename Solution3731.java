class Solution3731 {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i =0; i<nums.length;i++){
            if(nums[i]<min){
                min = nums[i];
            }
            if(nums[i]>max){
                max = nums[i];
            }
        }
        while(min<max){
            boolean found = false;
            for(int i =0; i<nums.length;i++){
                if(nums[i]==min){
                    found = true;
                    break;
                }
            }
            if(!found){list.add(min);}
            min++;
        }
        return list;
    }
}
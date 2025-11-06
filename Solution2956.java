class Solution2956 {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        int m =nums1.length;
        int n = nums2.length;
        int count =0;
        for(int i =0; i<m;i++){
            for(int j =0;j<n;j++){
                if(nums1[i]==nums2[j]){
                    count++;
                    break;
                }
            }
        }
        list.add(count);
        int cc =0;
        for(int i =0; i<n;i++){
            for(int j =0;j<m;j++){
                if(nums2[i]==nums1[j]){
                    cc++;
                    break;
                }
            }
        }
        list.add(cc);

        int[] res = new int[list.size()];
        for(int x =0;x<list.size();x++){
            res[x]= list.get(x);
        }
        return res;
        
    }
}
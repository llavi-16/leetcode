class Solution1317 {
    public int[] getNoZeroIntegers(int n) {
        for(int i =1;i<n;i++){
            int j = n-i;
            if(helper(i) && helper(j)){
                return new int[]{i,j};
            }
        }
        return new int[0];

        
    }
    private boolean helper(int num){
        while(num>0){
            if(num%10==0)return false;
            num /= 10;
        }
        return true;

    }
}
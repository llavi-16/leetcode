class Solution2197 {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> stac = new ArrayList<>();
        for(int num:nums){
            stac.add(num);
            while(stac.size()>=2){
                int b = stac.remove(stac.size()-1);
                int a = stac.remove(stac.size()-1);
                int g = gcd(a,b);
                if(g>1){
                    long l =(long) a / g * b;
                    stac.add((int) l);
                }else{
                    stac.add(a);
                    stac.add(b);
                    break;
                }
            }
        } 
        return stac;       
    }
    private int gcd(int a,int b){
        while(b>0){
            int temp =  a%b;
            a=b;
            b= temp;
        }
        return a;
    }
}
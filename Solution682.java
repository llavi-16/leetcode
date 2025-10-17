class Solution682 {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();
        for(String ch : operations){
            
            if(ch.equals("+")){
                int first = s.peek();
                s.pop();
                int second = s.peek();
                s.push(first);
                s.push(first+second);
            }
            else if(ch.equals("D")){
                int dou = s.peek();
                s.push(2*dou);
            }
            else if(ch.equals("C")){
                s.pop();
            }
            else{
                s.push(Integer.parseInt(ch));
            }
        }
        int sum =0;
        for(int num:s){
            sum+=num;
        }
        return sum;
    }
}
class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> s = new Stack<>();

        for(int i=0;i<tokens.length;i++){
            String curr = tokens[i];

            if(curr.equals("+")|| curr.equals("-")||
            curr.equals("*")|| curr.equals("/")){
                int a = s.pop();
                int b = s.pop();
                int ans =0;

                if(curr.equals("+")){
                    ans = b+a;
                    
                }
                else if(curr.equals("-")){
                    ans = b-a;
                    
                }
                else if(curr.equals("*")){
                    ans = b*a;
                }
                else{
                    ans = b/a;
                }

                s.push(ans);

            }
            else{
s.push(Integer.parseInt(curr));

            }   
        }

        return s.peek();
        
    }
}

class Solution {

    public class Pair{

        int value;
        int index;

        public Pair(int value, int index){
            this.value = value;
            this.index = index;
        }
    }

    public int[] dailyTemperatures(int[] temp) {

        int[] ans = new int[temp.length];
        Stack<Pair> s = new Stack<>();
        int[] ind = new int[temp.length];

        for(int i=temp.length-1;i>=0;i--){

            while(!s.isEmpty() && s.peek().value <= temp[i]){
                s.pop();
            }

            if(s.isEmpty()){
                ind[i] =-1;
            }
            else{
                ind[i] = s.peek().index;
            }

            s.push(new Pair(temp[i],i));
        }

        for(int i=0;i<ans.length;i++){
            if(ind[i]==-1){
                ans[i] =0;
            }
            else{
                ans[i] = ind[i]-i;
            }
        }

        return ans;
        
    }
}
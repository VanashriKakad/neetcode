class Solution {
    public String minWindow(String s, String t) {

        HashMap<Character,Integer> mapt = new HashMap<>();
        HashMap<Character,Integer> maps = new HashMap<>();
        int minLength = Integer.MAX_VALUE;
        int start =0;

        for(char ch: t.toCharArray()){
            mapt.put(ch,mapt.getOrDefault(ch,0)+1);
        }

        int left =0;

        for(int right=0;right<s.length();right++){

            char ch = s.charAt(right);

            maps.put(ch,maps.getOrDefault(ch,0)+1);

            while(ifPresent(mapt,maps)){

                int len = right-left+1;

                if(len<minLength){
                    minLength = len;
                    start = left;
                }

                char c = s.charAt(left);
                maps.put(c,maps.get(c)-1);

                if(maps.get(c)==0){
                    maps.remove(c);
                }

                left++;
            }
        }

        String ans ="";

        if(minLength == Integer.MAX_VALUE ){
            return "";
        }
        
        int count = 0;

        while(count < minLength){
            ans = ans + s.charAt(start);
            start++;
            count++;
        }


return ans;


        
    }

    public boolean ifPresent(HashMap<Character,Integer> map1,
                         HashMap<Character,Integer> map2){

    for(char ch : map1.keySet()){

        if(map2.getOrDefault(ch,0) < map1.get(ch)){
            return false;
        }
    }

    return true;
}
    
}
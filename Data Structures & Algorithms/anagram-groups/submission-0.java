class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> map = new HashMap<>();

        for(int i=0;i<strs.length;i++){

            String s = strs[i];

            int[] freq = new int[26];

            for(int p=0;p<s.length();p++){
                freq[s.charAt(p)-'a']++;
            }

            String key = Arrays.toString(freq);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);

        }
        
        return new ArrayList<>(map.values());
    }
}
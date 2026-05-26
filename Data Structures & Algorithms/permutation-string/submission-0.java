class Solution {
    public boolean checkInclusion(String s1, String s2) {

        int n = s1.length();
        int m = s2.length();

        if (m < n) {
            return false;
        }

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        // frequency of s1
        for (int i = 0; i < n; i++) {
            count1[s1.charAt(i) - 'a']++;
            count2[s2.charAt(i) - 'a']++;
        }

        // first window check
        if (Arrays.equals(count1, count2)) {
            return true;
        }

        int left = 0;

        // sliding window
        for (int right = n; right < m; right++) {

            // add new character
            count2[s2.charAt(right) - 'a']++;

            // remove old character
            count2[s2.charAt(left) - 'a']--;

            left++;

            if (Arrays.equals(count1, count2)) {
                return true;
            }
        }

        return false;
    }
}
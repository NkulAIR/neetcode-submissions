class Solution {
    public int lengthOfLongestSubstring(String s) {

        boolean[] seen = new boolean[128];
        int l = 0;
        int max_length = 0;

        for (int r = 0; r < s.length(); r ++){
            while (seen[s.charAt(r)]){
                seen[s.charAt(l)] = false;
                l ++;
            }
            seen[s.charAt(r)] = true;
            int current = r - l + 1;
            if (current > max_length){
                max_length = current;
            }


        }
        return max_length;

    }
}

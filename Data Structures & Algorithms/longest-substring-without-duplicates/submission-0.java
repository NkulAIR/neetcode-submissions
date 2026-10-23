class Solution {
    public int lengthOfLongestSubstring(String s) {
        boolean[] seen = new boolean[128];
        int max_length = 0;

        int l = 0;
        for (int r = 0; r < s.length(); r ++){

            while (seen[s.charAt(r)]){            
                seen[s.charAt(l)] = false;
                l++;
            }
            seen[s.charAt(r)] = true;

            int window_size = (r-l+1);
            if (window_size > max_length){
                max_length = window_size;
            }
        }
        return max_length;

        


        
        
    }
}

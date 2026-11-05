class Solution {
    public int scoreOfString(String s) {

        int l = 0;
        int r = 1;

        int score = 0;

        while (r <= s.length()-1){
            score += Math.abs(s.charAt(r) - s.charAt(l));
            r++;
            l++;
        }
        return score;
        
    }
}
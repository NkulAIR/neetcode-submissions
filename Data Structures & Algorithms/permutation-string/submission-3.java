class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()){
            return false;
        }

        int[] manifest_tally = new int[26]; 
        int[] window_tally = new int[26];


        for (int i = 0; i < s1.length();i++){
            int address = s1.charAt(i) - 'a';
            manifest_tally[address] += 1;

            int address2 = s2.charAt(i) - 'a';
            window_tally[address2] += 1;


        }
        if (Arrays.equals(manifest_tally, window_tally)){
            return true;
        }

        for(int i = s1.length(); i < s2.length(); i ++){
            char oldCharacter = s2.charAt(i - s1.length());
            char newChar = s2.charAt(i);

            int charAddress = oldCharacter - 'a';
            int newCharAddress = newChar - 'a';

            window_tally[charAddress] -= 1;
            window_tally[newCharAddress] += 1;

            if (Arrays.equals(manifest_tally, window_tally)){
                return true;
            }
        
        }
        return false;
        
    }
}

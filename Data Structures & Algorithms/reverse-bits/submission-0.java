class Solution {
    public int reverseBits(int n) {
        int reversed = 0;
        int i = 0;

        while (i < 32){
            reversed = (reversed << 1) | (n & 1);
            n >>= 1;
            i++;
        }
        return reversed;
        
    }
}

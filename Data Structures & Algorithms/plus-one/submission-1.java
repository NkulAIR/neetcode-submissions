class Solution {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i --){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        
        return newDigits;
        // StringBuilder number = new StringBuilder();

    //     for (Integer dig: digits){
    //         number.append(dig);
    //     }

    //     int newNumber = Integer.parseInt(number.toString())+1; 

        
    //     return Integer.toString(newNumber)
    //                   .chars()
    //                   .map(Character::getNumericValue)
    //                   .toArray();
    // }
    }
}

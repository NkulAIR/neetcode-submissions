class Solution:
    def isPalindrome(self, s: str) -> bool:
        exclamation = "@#+\{\}[]$%~*^><_()!&.;:`,-\"\'?/"
        alphabets = "abcdefghijklmnopqrstuvwxyz"
        new_string = []

        for i in s.lower():
            if i not in exclamation and i != " ":
                new_string.append(i)
        
        new_string = "".join(new_string)
        
        if new_string[::-1] == new_string:
            return True
        else:
            return False

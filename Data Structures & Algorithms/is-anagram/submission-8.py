class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        letter_count = {}

        if len(s) != len(t):
            return False
        
        if sorted(s) == sorted(t):
            return True;
        
        return False
        
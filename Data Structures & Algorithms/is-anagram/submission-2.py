class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        count = 0
        if len(s) != len(t):
            return False
        for i in s:
            if s.count(i) == t.count(i) and i in t:
                count += 1
        
        if count == len(s) and count == len(t):
            return True
        
        return False

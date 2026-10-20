class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        s_list = [i for i in s.lower()]
        t_list = [j for j in t.lower()]

        if len(s) != len(t):
            return False
        
        if sorted(s_list) == sorted(t_list):
            return True
        else:
            return False

        # for i in range(len(s)):
        #     countS[s[i]] = 1 + countS.get(s[i], 0)
        #     countT[t[i]] = 1 + countT.get(t[i], 0)

        # for c in countS:
        #     if countS[c] != countT.get(c, 0):
        #         return False
        # return True

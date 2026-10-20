class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        res, sol = [],[]


        def backtrack(i):
            if i == len(nums):
                res.append(sol[:])
                return
            
            # Dont pick nums[i]
            backtrack(i+1)

            # Pick the nums[i]
            sol.append(nums[i])
            backtrack(i + 1)
            sol.pop() # Reversing the decision of picking the number
        
        backtrack(0)
        return res
class Solution:
    def combine(self, n: int, k: int) -> List[List[int]]:
        res, sol = [],[]

        def backtrack(i):
            nums = [i for i in range(1, n+1)]
            if i == len(nums):
                res.append(sol[:])
                return

            backtrack(i+1)
            
            if len(sol) < k:
                sol.append(nums[i])
                backtrack(i+1)
                sol.pop()

            
            
        backtrack(0)
        res = [i for i in res if len(i) == k]
        return res
class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        if len((list(set(nums)))) == len(nums):
            return False
        
        return True

        # if list(set(nums)) == nums:
        #     return True
        # else:
        #     return False


         
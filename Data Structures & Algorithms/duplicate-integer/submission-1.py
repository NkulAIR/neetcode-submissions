class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        nums_set = set()
        dupes = False

        for r in range(len(nums)):
            if nums[r] not in nums_set:
                nums_set.add(nums[r])
            else:
                dupes = True
        
        return dupes

         
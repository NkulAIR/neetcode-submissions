class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        dupes = False
        numbers = sorted(nums)
        for i in range(len(numbers)-1):
            if numbers[i] == numbers[i + 1]:
                dupes = True
        return dupes

         
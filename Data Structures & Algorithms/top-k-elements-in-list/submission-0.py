class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        char_count = {}
        for num in nums:
            char_count[num] = 1 + char_count.get(num, 0)
        return sorted(char_count.keys(), key=char_count.get, reverse=True)[:k]
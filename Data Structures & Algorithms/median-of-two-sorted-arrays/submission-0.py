class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        res = nums1 + nums2
        res.sort()
        l = 0
        r = len(res)-1
        mid  = (l + r) // 2
        if len(res) % 2 == 0:
            median1 = res[mid]
            median2 = res[mid+1]
            median =  (median1 + median2) / 2
        else:
            median = res[mid]
    
        return median

        
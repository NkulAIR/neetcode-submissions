class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        products = []

        for i in range(len(nums)):
            sub = []
            for j in range(len(nums)):
                if j != i:
                    sub.append(nums[j])
            products.append(sub)

        # products = [numpy.prod(u) for u in products]

        for u in range(len(products)):
            if products[u]:
                product = 1
                for j in products[u]:
                    product *= j
                products[u] = product
            else:
                products[u] = 0
        return products

        
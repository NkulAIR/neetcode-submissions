class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        l = 0
        condition = False
        for i in range(len(matrix)):
            if matrix[i][0] <= target and matrix[i][-1] >= target:
                list_1 = matrix[i]
                if target in list_1:
                    condition = True
            else:
                print(matrix[i][-1])

        
        return condition
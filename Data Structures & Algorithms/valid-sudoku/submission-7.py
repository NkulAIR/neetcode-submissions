class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        rows = [{str(i): 0 for i in range(1, 10)} for _ in range(9)]
        columns = [{str(i): 0 for i in range(1, 10)} for _ in range(9)]
        boxes = [{str(i): 0 for i in range(1, 10)} for _ in range(9)]
        output = True

        for i in range(9):
            for j in range(9):
                val = board[i][j]
                if val != ".":
                    box_index = (i // 3) * 3 + j // 3
                    if rows[i][val] > 0 or columns[j][val] > 0 or boxes[box_index][val] > 0:
                        output = False
                    rows[i][val] += 1         
                    columns[j][val]  += 1         
                    boxes[box_index][val] += 1

        return output
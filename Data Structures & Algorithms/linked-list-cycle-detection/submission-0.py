# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        temp = head
        node_set = set()
        while temp is not None:
            if temp in node_set:
                return True
            node_set.add(temp)
            temp = temp.next

        return False

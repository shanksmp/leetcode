# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNodes(self, head: Optional[ListNode]) -> Optional[ListNode]:
        values = []
        while head:
            values.append(head.val)
            head = head.next
        
        # Use a stack to maintain decreasing order of values
        stack = []
        for value in reversed(values):
            if not stack or value >= stack[-1]:
                stack.append(value)
        
        # Reconstruct the linked list from the stack
        new_head = ListNode(stack.pop())
        current = new_head
        while stack:
            current.next = ListNode(stack.pop())
            current = current.next
        
        return new_head



        
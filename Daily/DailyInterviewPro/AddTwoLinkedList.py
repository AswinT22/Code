class ListNode(object):
  def __init__(self, x):
    self.val = x
    self.next = None

class Solution:
  def addTwoNumbers(self, head_a, head_b, c = 0):
    # Fill this in.
    try:
        reminder=0
        currentVal=0

        if(head_a and head_b):
            currentVal=head_a.val+head_b.val
            reminder=currentVal//10
            currentVal=currentVal%10

        result=ListNode(currentVal)
        head_a=head_a.next
        head_b=head_b.next
        temp=result
        while head_a and head_b:
            currentVal=head_a.val+head_b.val+reminder
            reminder=currentVal//10
            currentVal=currentVal%10
            temp.next=ListNode(currentVal)
            temp=temp.next
            head_a=head_a.next
            head_b=head_b.next

        while head_a:
            currentVal=head_a.val+reminder
            reminder=currentVal//10
            currentVal=currentVal%10
            temp.next=ListNode(currentVal)
            temp=temp.next
            head_a=head_a.next

        while head_b:
            currentVal=head_b.val+reminder
            reminder=currentVal//10
            currentVal=currentVal%10
            temp.next=ListNode(currentVal)
            temp=temp.next
            head_b=head_b.next
        
        

        if(reminder>0):
            temp.next=ListNode(reminder)
            temp=temp.next

        return result  

    except TypeError:
        return ListNode(0)

#https://practice.geeksforgeeks.org/problems/add-two-numbers-represented-by-linked-lists/1
# You are given two linked-lists representing two non-negative integers. 
# The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

# Example:
# Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
# Output: 7 -> 0 -> 8
# Explanation: 342 + 465 = 807.
        


l1 = ListNode(2)
l1.next = ListNode(4)
l1.next.next = ListNode(3)

l2 = ListNode(5)
l2.next = ListNode(6)
l2.next.next = ListNode(4)

result = Solution().addTwoNumbers(l1, l2)
while result:
  print (result.val)
  result = result.next
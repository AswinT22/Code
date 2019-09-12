class ListNode(object):
  def __init__(self, x):
    self.val = x
    self.next = None

class Solution:
  def addTwoNumbers(self, l1, l2, c = 0):
    # Fill this in.
    try:
        reminder=0
        currentVal=0

        if(l1 and l2):
            currentVal=l1.val+l2.val
            reminder=currentVal//10
            currentVal=currentVal%10

        result=ListNode(currentVal)
        l1=l1.next
        l2=l2.next
        temp=result
        while l1 and l2:
            currentVal=l1.val+l2.val+reminder
            reminder=currentVal//10
            currentVal=currentVal%10
            temp.next=ListNode(currentVal)
            temp=temp.next
            l1=l1.next
            l2=l2.next

        while l1:
            currentVal=l1.val+reminder
            reminder=currentVal/10
            currentVal=currentVal%10
            temp.next=ListNode(currentVal)
            temp=temp.next
            l1=l1.next

        while l2:
            currentVal=l2.val+reminder
            reminder=currentVal/10
            currentVal=currentVal%10
            temp.next=ListNode(currentVal)
            temp=temp.next
            l2=l2.next
        
        



        return result  

    except TypeError:
        return ListNode(0)

        


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
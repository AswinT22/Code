import sys

class Node:
  def __init__(self, value):
    self.left = None
    self.right = None
    self.value = value

def findCeilingFloor(root_node, k, floor=None, ceil=None):
  # Fill this in.
    ceil=findCeil(root_node,k)
    floor=findFloor(root_node,k)
    
    if(ceil<k):
      ceil=None

    if(floor>k):
      floor=None

    return f'{floor} {ceil}'
        




def findFloor(root,k):

    if(root is None):
      return -1
    
    if(root.value == k):
      return root.value
    
    if(root.value>k):
      return findFloor(root.left,k)
    
    val= findFloor(root.right,k)

    return val if -1<val < k else root.value

    

def findCeil(root,k):

    if(root is None):
      return -1
    
    if(root.value == k):
      return root.value
    
    if(root.value<k):
      return findCeil(root.right,k)
    
    val= findCeil(root.left,k)

    return val if val > k else root.value


root = Node(8) 
root.left = Node(4) 
root.right = Node(12) 
  
root.left.left = Node(2) 
root.left.right = Node(6) 
root.left.right.left= Node(5) 
root.left.right.right = Node(7) 
  
root.right.left = Node(10) 
root.right.right = Node(14) 

print (findCeilingFloor(root, 5))
# (4, 6)
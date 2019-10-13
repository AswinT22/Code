# https://codezen.codingninjas.in/practice/102975/4406/interview-shuriken-7:-unival-trees

# A unival tree (which stands for "universal value") is a tree where all nodes under it have the same value.

# Given the root to a binary tree, count the number of unival subtrees.

# For example, the following tree has 5 unival subtrees:

#    0
#   / \
#  1   0
#     / \
#    1   0
#   / \
#  1   1

class Node:

    def __init__(self,value):
        self.value=value
        self.left=None
        self.right=None
    

def count_unival(root,value):
    
    if(root is None):
        return True,0

    left_valid,left_value=count_unival(root.left,root.value)
    right_valid,right_value=count_unival(root.right,root.value)

    return_value=right_value+left_value
    return_valid=False
    
    if(right_valid and left_valid ):
        return_value+=1

        if(root.value==value):
            return_valid=True
            
    
    

        
    
    return return_valid,return_value

    
        





root=Node(0)
root.right=Node(1)
root.left=Node(0)
root.left.left=Node(0)
root.left.right=Node(1)
root.left.right.left=Node(1)
root.left.right.right=Node(1)
_,ans= count_unival(root,root.value)
print(ans)
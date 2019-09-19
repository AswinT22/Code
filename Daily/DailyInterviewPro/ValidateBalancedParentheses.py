class Solution:
  def isValid(self, s):
    # Fill this in.

    switcher = { 
        '}': '{', 
        ']': '[', 
        ')': '(', 
    } 

    stack=[]
    close_bracket=['}',']',')']
    for bracket in s:
       
        if(bracket in close_bracket):
            if(len(stack)==0):
                return False
            if(stack.pop()!=switcher.get(bracket)):
                return False
        else:
            stack.append(bracket)
    

    if(len(stack)!=0):
        return False
    

    return True


# https://practice.geeksforgeeks.org/problems/parenthesis-checker/0
# t=int(input())
# while(t>0):
#     t-=1
#     s=input()
#     if(Solution().isValid(s)):
#         print("balanced")
#     else:
#         print("not balanced")


# Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid. 
# An input string is valid if:
# - Open brackets are closed by the same type of brackets.
# - Open brackets are closed in the correct order.
# - Note that an empty string is also considered valid.

# Example:
# Input: "((()))"
# Output: True

# Input: "[()]{}"
# Output: True

# Input: "({[)]"
# Output: False


# Test Program
s = "()(){(())" 
# should return False
print(Solution().isValid(s))

s = ""
# should return True
print(Solution().isValid(s))

s = "([{}])()"
# should return True
print(Solution().isValid(s))

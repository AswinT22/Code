#code
class Solution: 
  def getRange(self, arr, target):
    # Fill this in.
    
   
    i=0
    while( i < len(arr)):
        if(arr[i]==target):
            
            start=i
            while(i < len(arr) and arr[i]==target):
                i+=1
            #Python 3.6 and above for f literal
            return f'{start} {i-1}'

        i+=1


    return -1      
#GFG
#https://practice.geeksforgeeks.org/problems/first-and-last-occurrences-of-x/0
t=int(input())
while(t>0):
    t-=1
    n,target=map(int,input().split())
    arr=list(map(int,input().split()))
    print(Solution().getRange(arr,target))   

  
# Test program 
# arr = [1, 2, 2, 2, 2, 3, 4, 7, 8, 8] 
# x = 2
# print(Solution().getRange(arr, x))
# [1, 4]


# Given a sorted array, A, with possibly duplicated elements, find the indices of the first and last occurrences of a target element, x. Return -1 if the target is not found.

# Example:
# Input: A = [1,3,3,5,7,8,9,9,9,15], target = 9
# Output: [6,8]

# Input: A = [100, 150, 150, 153], target = 150
# Output: [1,2]

# Input: A = [1,2,3,4,5,6,10], target = 9
# Output: [-1, -1]
# Given a list of numbers, where every number shows up twice except for one number, find that one number.

# Example:
# Input: [4, 3, 2, 4, 1, 3, 2]
# Output: 1


# Challenge: Find a way to do this using O(1) memory.

#https://practice.geeksforgeeks.org/problems/element-appearing-once/0

#This will work even with an unsorted array

def singleNumber(arr,arr_size):
  # Fill this in.
  missingVal=arr[0]
  for i in range(1,arr_size):
      missingVal^=arr[i]
  
  return missingVal


for _ in int(input()):
    arr_size=int(input())
    arr=list(map(int,input().split()))
    print (singleNumber(arr,arr_size))

# This problem was asked by Stripe.

# Given an array of integers, find the first missing positive integer in linear time and constant space. 
# In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.

# For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.

# You can modify the input array in-place.

# https://practice.geeksforgeeks.org/problems/smallest-positive-missing-number/0


from sys import stdin, stdout  
def smallestPositiveMissingNum(arr,arr_size):

    for i in arr:
        t=int(i)
        
        while(t>0 and t<arr_size and t!=int(arr[t-1])):
            next_val=int(arr[t-1])
            arr[t-1]=t
            t=next_val
            
    for i in range(1,arr_size+1):

        if(int(arr[i-1])!=i):
            return i
    
    return arr_size+1

  
 
for _ in range(int(input())):

    arr_size= int(stdin.readline())
    arr = [x for x in stdin.readline().split()] 
    print(smallestPositiveMissingNum(arr,arr_size))












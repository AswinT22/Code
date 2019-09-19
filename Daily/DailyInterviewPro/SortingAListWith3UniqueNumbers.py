


def sortNums(arr,arr_size):
  # Fill this in.
    high=arr_size-1
    low=0
    mid=0

    while mid<=high:

        if(arr[mid]==0):
           arr[low],arr[mid]=arr[mid],arr[low]
           low+=1
           mid+=1
        elif(arr[mid]==2):
           arr[high],arr[mid]=arr[mid],arr[high]
           high-=1
        else:
            mid+=1


    return ' '.join(map(str,arr))


#https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s/0
t=int(input())
while(t>0):
    t-=1
    
    arr_size=int(input())
    arr=list(map(int,input().split()))
    print (sortNums(arr,arr_size)) 

# [1, 1, 2, 2, 3, 3, 3]



# Given a list of numbers with only 3 unique numbers (1, 2, 3), sort the list in O(n) time.

# Example 1:
# Input: [3, 3, 2, 1, 3, 2, 1]
# Output: [1, 1, 2, 2, 3, 3, 3]

# Challenge: Try sorting the list using constant space.
# Given an array of integers, return a new array such that each element at index i of 
# the new array is the product of all the numbers in the original array except the one at i.


# For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. 
# If our input was [3, 2, 1], the expected output would be [2, 3, 6].

# Follow-up: what if you can't use division?


def findProductWOI(arr,arr_size):

    left=[1]*n
    right=[1]*n

    curMult=1
    for i in range(0,arr_size):
        left[i]=curMult
        curMult*=arr[i]
    

    curMult=1
    for i in range(1,arr_size+1):

        right[i*-1]=curMult
        curMult*=arr[i*-1]

    
    for i in range(0,arr_size):

        arr[i]=left[i]*right[i]


    return " ".join(map(str,arr))
    




# https://practice.geeksforgeeks.org/problems/product-array-puzzle/0
t=int(input())
while(t>0):
    t-=1
    n=int(input())
    arr=list(map(int,input().split()))
    print(findProductWOI(arr,n))

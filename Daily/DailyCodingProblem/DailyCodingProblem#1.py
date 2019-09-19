class Solution:
    def isAPairOfSumK(self,array,k):

        table=set()

        for num in array:

            if((k-num)in table):
                return True
            table.add(num)
        return False






        



t=int(input())
while(t>0):
    t-=1
    n,k=map(int,input().split())
    arr=list(map(int,input().split()))

    if(Solution().isAPairOfSumK(arr,k)):
        print("Yes")
    else:
        print("No")


#https://practice.geeksforgeeks.org/problems/key-pair/0

# You are given a list of numbers, and a target number k. Return whether or not there are two numbers in the list that add up to k.

# Example:
# Given [4, 7, 1 , -3, 2] and k = 5, 
# return true since 4 + 1 = 5.

# Try to do it in a single pass of the list.

# Given a list of integers, write a function that returns the largest sum of non-adjacent numbers. Numbers can be 0 or negative.
#
# For example, [2, 4, 6, 2, 5] should return 13, since we pick 2, 6, and 5. [5, 1, 1, 5] should return 10, since we pick 5 and 5.
#
# Follow-up: Can you do this in O(N) time and constant space?



# def findMaxSum(n,input_list):
#
#       N Space 
#
#     sum_array=[0]*(n+1)
#     sum_array[0], sum_array[1]=0,input_list[0]
#
#
#     for i in range(2,n+1):
#         sum_array[i]=max(sum_array[i-1],input_list[i-1]+sum_array[i-2])
#
#
#     return sum_array[n]


def findMaxSum(n,input_list):

    #Constant Space
    prev, current=0,input_list[0]
    for i in range(2,n+1):
        temp=max(current,input_list[i-1]+prev)
        prev=current
        current=temp


    return current




for _ in range(int(input())):

    n = int(input())
    input_list = list(map(int, input().split()))
    print(findMaxSum(n,input_list))
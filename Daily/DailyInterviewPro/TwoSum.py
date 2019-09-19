def two_sum(list, k):

        table=set()

        for num in array:

            if((k-num)in table):
                return True
            table.add(num)
        return False



print (two_sum([4,7,1,-3,2], 5))

#https://practice.geeksforgeeks.org/problems/key-pair/0
# You are given a list of numbers, and a target number k. Return whether or not there are two numbers in the list that add up to k.

# Example:
# Given [4, 7, 1 , -3, 2] and k = 5, 
# return true since 4 + 1 = 5.
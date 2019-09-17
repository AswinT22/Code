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





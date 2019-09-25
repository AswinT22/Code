# Given the mapping a = 1, b = 2, ... z = 26, and an encoded message, count the number of ways it can be decoded.

# For example, the message '111' would give 3, since it could be decoded as 'aaa', 'ka', and 'ak'.

# You can assume that the messages are decodable. For example, '001' is not allowed

# https://practice.geeksforgeeks.org/problems/total-decoding-messages/0


def numberOfWays(string,n):
    
    
    arr=[0]*n-1

    arr[0]=1
    arr[1]=1

    for i in range(2,n+1):

        if(string[i-1]>'0'):
            arr[i]=arr[i-1]
        
        if(string[i-2]=='1'or(string[i-2]=='2'and string[i-1]<'7')):
            arr[i]+=arr[i-2]
    
    return arr[n]

for _ in range(int(input())):
        n=int(input())
        string=input()
        if(string[0]=='0'):
            print(0)
        else:
            print(numberOfWays(string,n))
            

        
#code
# https://practice.geeksforgeeks.org/problems/majority-element/0

def findMajorityElement(arr,arr_size):
    
    count=0
    majorityElement=arr[0]
    for i in arr:
        if(majorityElement==i):
            count+=1
        else:
            if count>0:
                count-=1
            else:
                majorityElement=i
                count=1
    
    if count>0:
        return checkCandidate(majorityElement,arr,arr_size)
    
    return -1

def checkCandidate(candidate,arr,arr_size):
    
    eligibility=arr_size//2
    
    count=0
    for i in arr:
        if(i==candidate):
            count+=1
    
    if(count>eligibility):
        return candidate
    return -1


for _ in range(int(input())):
    
    arr_size=int(input())
    arr=list(map(int,input().split()))
    
    print(findMajorityElement(arr,arr_size))
    
   

from typing import List


class Solution:
    def checkPossibility(self, nums: List[int]) -> bool:
        
        modify=0

       
        for i in range(1,len(nums)):
            if(nums[i]<nums[i-1]):
                modify+=1
                if(i==1 or nums[i-2]<=nums[i]):
                        nums[i-1]=nums[i]
                else:
                    nums[i]=nums[i-1]
         
                
                
        
        
        return modify<=1


print(Solution().checkPossibility([4,2,1]))
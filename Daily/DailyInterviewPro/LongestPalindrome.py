class Solution: 
    def longestPalindrome(self, s):
        # Fill this in.
        #Adding '*' to handle even
        starS=[ s[i//2 ] if i%2!=0 else '*'  for i in range(0,2*len(s)+1) ]
        
        
       
       
        counterArray=[1]*len(starS)
        center=1
        #pointers
        start=center
        end=center
        while(center<len(starS)):
            
            

            while(end<len(starS)-1 and start>0 and (starS[end+1]==starS[start-1])):
                end+=1
                start-=1
            
            counterArray[center]=end-start+1
            
            #This is will be the longest palindrome
            if(end==len(starS)-1):
                  break

            newCenter=end+( end%2==0  and 1 or 0)
            
            #Include end in the hunt for new center
            for x in range(center+1,end+1):

                counterArray[x]=min( counterArray[ center-(x-center) ] , (2*(end-x)) +1 )   

                #Eligibility of next center
                if( counterArray[ center-(x-center) ]//2 + x == end):
                    newCenter=x
                    break    


            center=newCenter
            start=center-counterArray[center]//2
            end=center+counterArray[center]//2


        

        lenOfpalindrom=max(counterArray)
        maxIndex=counterArray.index(lenOfpalindrom)
        maxCenterOfS=maxIndex//2

        start=maxCenterOfS-(lenOfpalindrom//4)
        end=1+maxCenterOfS+(lenOfpalindrom//4)
        
        if(maxIndex%2==0):
            end-=1



        return s[start:end] 

      
     
# A palindrome is a sequence of characters that reads the same backwards and forwards. 
# Given a string, s, find the longest palindromic substring in s.
        
# # Test program
s = "tracecars"
print(str(Solution().longestPalindrome(s)))



# https://practice.geeksforgeeks.org/problems/longest-palindrome-in-a-string/0/?track=sp-strings&batchId=152
# testcases=input()
# while(testcases > 0):
#     testcases-=1
#     s=input()

#     print(str(Solution().longestPalindrome(s)))
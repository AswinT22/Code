class Solution:
  def lengthOfLongestSubstring(self, s):
    # Fill this in.
    max_count=0
    str=""

    for i in s:
        if(i in str):
            str_len=len(str)
            if(max_count<str_len):
                max_count=str_len

            str=str.split(i,2)[1]+i
        else:
            str+=i    

    str_len=len(str)
    if(max_count<str_len):
                max_count=str_len
    
    return max_count


# Given a string, find the length of the longest substring without repeating characters.

print (Solution().lengthOfLongestSubstring('abrkaabcdefghijjxxx'))


# https://practice.geeksforgeeks.org/problems/length-of-the-longest-substring/0
# testcases=int(input())
# while(testcases > 0):
#     testcases-=1
#     s=input()
#     print(str(Solution().lengthOfLongestSubstring(s)))
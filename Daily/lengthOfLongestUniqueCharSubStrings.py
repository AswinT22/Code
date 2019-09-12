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


    return max_count

print (Solution().lengthOfLongestSubstring('abrkaabcdefghijjxxx'))
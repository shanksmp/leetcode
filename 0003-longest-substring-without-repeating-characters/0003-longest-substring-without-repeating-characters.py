class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        strset = set()
        l = 0
        longest = 0
        
        for r in range(len(s)):
            while s[r] in strset:
                strset.remove(s[l])
                l += 1
            
            w = r-l+1
            longest = max(longest,w)
            strset.add(s[r])
        return longest







        
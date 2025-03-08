class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        length = len(nums)*2
        ans = [None] * length
        j = 0 + len(nums)
        for i in range(0,len(nums)):
            ans[i] = nums[i]
            ans[j] = nums[i]
            j = j+1
        return ans
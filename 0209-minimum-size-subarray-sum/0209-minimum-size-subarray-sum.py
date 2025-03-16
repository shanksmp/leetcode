class Solution:
    def minSubArrayLen(self, target: int, nums: List[int]) -> int:
        l = 0
        
        min_size = float("inf")
        total = 0

        for r in range(len(nums)):
            total += nums[r]
            while total >= target:
                min_size = min(r-l+1, min_size)
                total -= nums[l]
                l += 1
        
        return 0 if min_size == float("inf") else min_size
        
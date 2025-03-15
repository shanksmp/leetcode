class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        n = len(nums)
        l = 0
        r = k-1
        max_avg = ("-inf")
        cur_sum = 0
        for i in range(k):
            cur_sum += nums[i]

        max_avg = cur_sum/k 

        for i in range(k,n):
            cur_sum += nums[i]
            cur_sum -= nums[i-k]

            avg = cur_sum/k

            max_avg = max(avg,max_avg)
        return max_avg



        
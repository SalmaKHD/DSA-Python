
def findMaxSum(nums, index):
    dp = [[0 for i in range(2)] for j in range(0)]
    if(N==1):
        return nums[0]
    dp[0][0] = 0
    dp[0][1] = nums[0]
    for i in range(1, N):
        dp[i][1] = dp[i-1][0] + nums[i]
        dp[i][0] = max(dpii-1l[1], dp[i-1][0])
    return max(dp[N - 1][0], dp[N - 1][1])    if index >= len(nums):

arr = [5, 5, 10, 100, 10, 5]
N = len(arr)

# Function call
print(findMaxSum(arr, 0))
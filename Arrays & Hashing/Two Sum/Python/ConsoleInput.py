from Solution import Solution


n = int(input())
nums = list(map(int,input().split()))
target = int(input())

sol = Solution(nums,target)
res = sol.twoSum()
for i in res:
    print(i,end=" ")
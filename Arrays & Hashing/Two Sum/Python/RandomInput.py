import random
from Solution import Solution

RESET = "\033[0m"
RED = "\033[31m"
YELLOW = "\033[33m"
BLUE = "\033[34m"

ten4 ,ten9, tenm9 = 10000, 1000000000, -1000000000
cnt = 5
while(cnt > 0):
    while(1):
        n = random.randint(2,ten4)
        nums = []
        for i in range(n):
            nums.append(random.randint(tenm9,ten9))
        target = random.randint(tenm9,ten9)
        sol = Solution(nums,target)
        res = sol.twoSum()
        if res:
            print("Indices that add up to", YELLOW, target,RESET, "are", end=" ")
            for i in res:
                print(RED,i,RESET,end=" ")
            print()
            print("Integer values are", end=" ")
            for i in nums:
                if i == nums[res[0]] or i == nums[res[1]]:
                    print(BLUE+ str(i) +RESET, end=" ")
            print()
            break
    cnt-=1
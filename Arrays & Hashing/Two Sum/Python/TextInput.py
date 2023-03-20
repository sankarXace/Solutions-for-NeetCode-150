from Solution import Solution

RESET = "\033[0m"
RED = "\033[31m"
YELLOW = "\033[33m"
BLUE = "\033[34m"

with open("./inputexample.txt",'r') as file:
    t = int(file.readline())
    for _ in range(t):
        n = int(file.readline())
        nums = [int(x) for x in file.readline().split()]
        target = int(file.readline())
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
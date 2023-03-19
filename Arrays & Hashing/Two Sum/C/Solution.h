int* twoSum(int* nums, int numsSize, int target, int* returnSize){
    int* index = malloc(2 * sizeof(int));
    *returnSize = 2;
    for(int i=0;i<numsSize;i++){
        for(int j=0;j<numsSize;j++){
            if (i==j){
                continue;
            }
            if(nums[i]+nums[j]==target){
                index[0] = i;
                index[1]= j;
                return index;
            }
        }
    }
    return NULL;
}
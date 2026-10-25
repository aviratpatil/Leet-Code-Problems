class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        int n=nums.length;

        int closestSum=nums[0]+nums[1]+nums[2];

        for(int i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;

            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];

                if(Math.abs(sum-target)<Math.abs(closestSum-target)){
                    closestSum=sum;
                }
                 if(sum<target){
                    left++;
                }
                else if(sum>target){
                    right --;
                }   
                else    return sum;
            }
        }
        return closestSum;
    }
    //Sort the array in ascending order.
//Initialize closestSum using the first three elements. This gives us an initial answer to improve.
//Use a for loop to fix the first number, nums[i].
//Set left = i + 1 and right = nums.length - 1.
//Calculate the sum of the three selected numbers.
//If this sum is closer to the target than closestSum, update closestSum.
//Move the pointers:
//- If sum < target, move left to the right to increase the sum.
//- If sum > target, move right to the left to decrease the sum.
//- If sum == target, return immediately because we found the best possible answer.
//Continue until all possible fixed starting positions have been checked, then return closestSum.
}

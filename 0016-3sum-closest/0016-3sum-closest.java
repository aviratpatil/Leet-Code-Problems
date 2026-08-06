class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int resultSum=nums[0]+nums[1]+nums[2];
        int minDifference =Integer.MAX_VALUE;

        //fix the first pointer
        for(int i=0;i<nums.length-2;i++){
            int left=i+1;
            int right=nums.length-1;

            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];

                if(sum==target){
                    return target; //perfect match fount 
                }
                if(sum<target){ 
                    left++;    // sum is too small then left++
                }else right--; //else right --

                // Track the sum with minimum difference from target
                int diffToTarget=Math.abs(sum-target);
                if(diffToTarget<minDifference){
                    resultSum=sum;
                    minDifference=diffToTarget;
                }

            }
        }
        return resultSum;
        
    }
}
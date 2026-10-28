class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer>window=new HashSet<>();
        int left=0;
        //stores sum of all the elements in window
        long windowSum=0;
        long maxSum=0;

        for(int right=0;right<nums.length;right++){
            while(window.contains(nums[right])){
                window.remove(nums[left]);
                windowSum-=nums[left];
                left++;
            }

            //add right elment
            window.add(nums[right]);
            windowSum+=nums[right];
            

            if(right -left+1 >k){
                window.remove(nums[left]);
                windowSum-=nums[left];
                left++; 
            }
            if(right-left+1==k){
                maxSum=Math.max(maxSum,windowSum);
            }
        }

        return maxSum;
        
    }
}
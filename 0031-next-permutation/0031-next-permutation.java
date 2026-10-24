class Solution {
    public void nextPermutation(int[] nums) {

        // [1 , 3, 5, 4, 2]
        int n=nums.length;

        int pivot=n-2;

        while(pivot >= 0){
            if(nums[pivot] < nums[pivot+1]){
                break;
            }
            pivot--;
        }
        //Step 2 : Find the next greater element
        if(pivot >=0){
            int nextGreater=n-1;

            while(nums[nextGreater] <= nums[pivot]){
                nextGreater--;
            }
            swap(nums,pivot,nextGreater);
            
        }

        // Step 3: Reverse The suffix
        int left=pivot+1;
        int right=n-1;

        while(left<right){
            swap(nums,left,right);
            left++;
            right--;
        }

        
    }
    private void swap(int[] nums,int i, int j){
            int temp=nums[i];
            nums[i]=nums[j];    
            nums[j]=temp;
        }

}
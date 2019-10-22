1.
给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的连续
子数组。如果不存在符合条件的连续子数组，返回 0。
class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int left=0;
        int right=0;
        int sum=0;
        int count=nums.length+1;
        while(right<nums.length){
            sum+=nums[right];
            while(sum>=s&&left<=right){
                count=Math.min(count,right-left+1);
                sum-=nums[left];
                left++;
            }
            right++;
        }
        if(count==nums.length+1){
            return 0;
        }
        return count;
    }
}


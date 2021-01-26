package com.example.demo.l_201;

/**
 * @author sunrui
 * @description LeetCode 281-290
 * @date 2021/1/20
 */
public class l_281_290 {

    public static void main(String[] args) {
        int nums[] = new int[]{1,0,1};
        nums = moveZeroes(nums);
        for (int num:nums){
            System.out.println(num);
        }
    }
    //283.移动零  给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
    public static int[] moveZeroes(int[] nums){
        int j = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        return nums;
    }
}

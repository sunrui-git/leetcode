package com.example.demo.l_001;

import java.util.HashSet;
import java.util.Set;

/**
 * @author sunrui
 * @description
 * @date 2021/2/2
 */
public class l_021_230 {
    // 26. 删除排序数组中的重复项
    //给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
    //不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int j = 0;
        for(int i = 1;i < nums.length;i++){
            if(nums[j] != nums[i]){
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1;
    }
    //27. 移除元素
    //给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
    //不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int j = 0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i] != val){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        removeElement(nums,2);
    }
}

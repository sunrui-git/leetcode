package com.example.demo.to_offer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sunrui
 * @description
 * @date 2021/1/20
 */
public class offer_01 {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 5, 1, 0, 5, 5, 7};
        System.out.println(findRepeatNumber(nums));
    }
    // 剑指offer 03 数组中重复数字
    //在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了
    // 也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
    public static int findRepeatNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap();
        for(int i = 0;i<nums.length;i++){
            int count = 1;
            if(map.containsKey(nums[i])){
                return nums[i];
            }
            map.put(nums[i],count);
        }
        return -1;
    }
}

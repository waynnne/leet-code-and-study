package cn.wayne.solutions.leetcode;

import java.util.Arrays;

/**
 * Author: Waynnne
 * Date: 2020/6/13 14:29
 * Desc: Q26_RemoveDuplicates
 */

public class Q26_RemoveDuplicates {

    /**
     * 给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
     *
     * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public static int removeDuplicates(int[] nums) {
        // 两个指针
        int i = 0, j = 1;
        while (j < nums.length) {
            // 判断j所在元素与i所在的元素是否相等
            // 如果不相等，将j所在元素赋值给i+1，j和i都加1
            if (nums[i] != nums[j]) {
                nums[i + 1] = nums[j];
                i++;
            }
            // 如果相等，只有j向后移动1位
            j++;
        }
        // 返回去重后的新数组长度
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 6, 7};
        int len = removeDuplicates(nums);
        System.out.println(len);
    }
}


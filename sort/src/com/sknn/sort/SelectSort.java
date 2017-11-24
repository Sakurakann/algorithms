package com.sknn.sort;

import java.util.logging.Level;

/**
 * Created with IntelliJ IDEA.
 * Project: algorithms.
 * Package: com.sknn.sort.
 * User: Administrator.
 * Date: 2017-11-23 16:51.
 * Author: Haiyangp.
 *
 * 选择排序是最简单直观的排序.
 *
 */
public class SelectSort {

  /**
   * 算法步骤：<p>
   * 在未排序序列中找到最小（大）元素，拿出后存放到排序序列的起始位置。<br>
   * 再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。<br>
   * 以此类推，直到所有元素均排序完毕。<br>
   * @param arr 待排序数组
   */
  public void selectSort(int[] arr) {
    int arrLength = arr.length;
    for (int i = 0; i < arrLength; i++) {

      int targetIndex = i;

      // 找出最大数的索引位置.
      for (int j = i + 1; j < arrLength; j++) {
        if (arr[targetIndex] < arr[j]) {
          targetIndex = j;
        }
      }

      // 如果是最大的 交换
      if (targetIndex != i) {
        SortUtil.swap(arr, i, targetIndex);
      }
    }
  }

  public static void main(String[] args) {

    SortUtil.print(SortUtil.ARR);
    new SelectSort().selectSort(SortUtil.ARR);
    SortUtil.print(SortUtil.ARR);
  }

}

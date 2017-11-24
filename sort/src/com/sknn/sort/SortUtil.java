package com.sknn.sort;

/**
 * Created with IntelliJ IDEA. Project: algorithms. Package: com.sknn.sort. User: Administrator.
 * Date: 2017-11-23 16:31. Author: Haiyangp.
 */
public class SortUtil {

  public static final int[] ARR =  new int[] {2, 3, 5, 4, 6, 1};

  /**
   * 交换索引位置上的数字.
   * @param arr 数组
   * @param original 要交换的索引位置1
   * @param target 要交换的索引位置2
   */
  public static void swap(int[] arr, int original, int target) {
    if (arr.length <= 0 || original < 0 || target < 0
        || arr.length <= original || arr.length <= target) {
      throw new IllegalArgumentException("非法参数");
    }

    int temp = arr[original];
    arr[original] = arr[target];
    arr[target] = temp;
  }

  public static void print(int[] arr) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println("\n");
  }
}

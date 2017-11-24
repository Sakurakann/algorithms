package com.sknn.sort;

/**
 * Created with IntelliJ IDEA.
 * Project: algorithms.
 * Package: com.sknn.sort.
 * User: Administrator.
 * Date: 2017-11-24 10:22.
 * Author: Haiyangp.
 *
 * 快速排序:通常明显比同为Ο(n log n)的其他算法更快，因此常被采用，而且快排采用了分治法的思想.
 * 分治概念!`把一个复杂的问题分成两个或更多的相同或相似的子问题，再把子问题分成更小的子问题……
 *  直到最后子问题可以简单的直接求解，原问题的解即子问题的解的合并.
 */
public class QuickSort {

  /**
   * 算法步骤：<br>
   * 从数列中挑出一个元素作为基准数。<br>
   * 分区过程，将比基准数大的放到右边，小于或等于它的数都放到左边。<br>
   * 再对左右区间递归执行第二步，直至各区间只有一个数。<br>
   * @param arr
   * @param left
   * @param right
   */
  public void quickSort(int[] arr, int left, int right) {
    if (left >= right || arr == null || arr.length <= 1) {
      return;
    }

    // 设置哨兵点
    int pivotValue = arr[left];
    System.out.println("哨兵点 " + pivotValue + "  索引: " + left);
    int low = left;
    int high = right;

    int newPivotIndex = newPivotIndex(arr, left, right, pivotValue);
    //对左半部分
    quickSort(arr, left, newPivotIndex - 1);
    //对有半部分
    quickSort(arr, newPivotIndex + 1, right);
  }

  /**
   * 新哨兵位置索引
   * @param arr
   * @param head
   * @param tail
   * @param pivotValue
   * @return
   */
  public int newPivotIndex(int[] arr, int head, int tail, int pivotValue) {
    while (head < tail) {
      while (head < tail && arr[tail] > pivotValue) {
        tail--;
      }
      if (head < tail) {
        arr[head] = arr[tail];
        head++;
      }

      while (head < tail && arr[head] < pivotValue) {
        head++;
      }
      if (head < tail)
        arr[tail] = arr[head];
    }
    arr[head] = pivotValue;
    SortUtil.print(arr);
    return head;
  }

  public void quickSort(int[] arr) {
    quickSort(arr, 0, arr.length - 1);
  }

  public static void main(String[] args) {
    /**
     * 处理过程:
     * 原数组 :{2,3,5,4,6,1}
     * @see SortUtil.ARR
     *
     * 第一个循环:以 index=0为哨兵点,将小于它的全部放到其左边
     */
    new QuickSort().quickSort(SortUtil.ARR);
  }

}

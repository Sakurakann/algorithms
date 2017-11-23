package com.sknn.sort;

/**
 * Created with IntelliJ IDEA.
 * Project: algorithms.
 * Package: com.sknn.sort.
 * User: Administrator.
 * Date: 2017-11-23 16:31.
 * Author: Haiyangp.
 *
 * 冒泡排序可谓是最经典的排序算法了,它是基于比较的排序算法,时间复杂度为O(n^2),其优点是实现简单,n较小时性能较好.
 *
 */
public class BubbleSort {

  /**
   * 算法步骤:<p>
   * 比较相邻的元素.如果第一个比第二个大,就交换他们两个.<br/>
   * 对第0个到第n-1个数据做同样的工作.这时,最大的数就像气泡“浮”到了数组最后的位置上.<br/>
   * 针对所有的元素重复以上的步骤,除了最后一个.<br/>
   * 持续每次对越来越少的元素重复上面的步骤,直到没有任何一对数字需要比较.<br/>
   * @param arr 带排序数组
   */
  public void bubbleSort(int[] arr) {

    int arrLength = arr.length;
    for (int i = 0; i < arrLength; i++) {
      for (int j = i + 1; j < arrLength; j++) {
        // 升序冒泡排序               // if (arr[i] < arr[j]){...} 降序冒泡
        if (arr[i] > arr[j]) {
          SortUtil.swap(arr, i, j);
        }
      }
    }
  }

  public static void main(String[] args) {
    int[] arr = new int[]{2, 3, 1, 5, 9, 6};
    new BubbleSort().bubbleSort(arr);
    SortUtil.print(arr);
  }

}

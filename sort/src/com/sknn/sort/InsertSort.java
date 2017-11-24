package com.sknn.sort;

/**
 * Created with IntelliJ IDEA.
 * Project: algorithms.
 * Package: com.sknn.sort.
 * User: Administrator.
 * Date: 2017-11-24 09:02.
 * Author: Haiyangp.
 *
 * 插入排序:对于每个未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。
 */
public class InsertSort {

  /**
   * 算法步骤：<br>
   * 从第一个元素开始，该元素可以认为已经被排序<br>
   * 取出下一个元素，在已经排序的元素序列中从后向前扫描<br>
   * 如果被扫描的元素（已排序）大于新元素 --(绛序)，将新元素后移一位<br>
   * 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置<br>
   * 将新元素插入到该位置后<br>
   * 重复步骤2~5<br>
   *
   * @param arr 待排序数组
   */
  public void insertSort(int[] arr) {
    int arrLength = arr.length;
    // 将第一位默认为已排序,可以将i的初始值设置1,放弃从0索引为开始向前扫描
    for (int i = 1; i < arrLength; i++) {
      int j = i - 1;
      int key = arr[i];

      //向前扫描,只有比插入值大或者已经是数组开始,停止扫描
      while (j > -1 && key > arr[j] ) {
        // 如果值比要插入的数字小 后移一位
        arr[j + 1] = arr[j];
        // 扫描标记前移一位
        j--;
      }

      // 交换扫描中止位和已做临时存储的插入值
      arr[j + 1] = key;
    }
  }

  public static void main(String[] args) {

    SortUtil.print(SortUtil.ARR);
    new InsertSort().insertSort(SortUtil.ARR);

    SortUtil.print(SortUtil.ARR);
  }

}

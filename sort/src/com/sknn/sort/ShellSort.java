package com.sknn.sort;

/**
 * Created with IntelliJ IDEA.
 * Project: algorithms.
 * Package: com.sknn.sort.
 * User: Administrator.
 * Date: 2017-11-24 09:48.
 * Author: Haiyangp.
 *
 * 希尔排序是插入排序的升级版<br>
 * 将数组列在一个表中并对列分别进行插入排序，重复这过程，不过每次用更长的列（步长更长了，列数更少了）来进行。<br>
 * 最后整个表就只有一列了。进行这些排序时的数据项之间的间隔被称为增量.<br>
 * 将数组转换至表是为了更好地理解这算法，算法本身还是使用数组进行排序。<br>
 * @see InsertSort
 */
public class ShellSort {

  public void shellSort(int arr[]) {
    int arrLength = arr.length;
    // 增量常用h来表示 常用的h序列由Knuth提出，该序列从1开始，通过如下公式产生：
    // h = 3 * h +1
    // 反过来程序需要反向计算h序列，应该使用
    // h=(h-1)/3
    int h = 1;
    while(h < arrLength / 3) {
      h = h * 3 + 1;
    }

    while (h > 0) {
      for (int i = h; i < arrLength; i += h) {

        // 升序
        if (arr[i] < arr[i - h]) {
          int temp = arr[i];
          int j = i - h;

          // 该部分要与上层结合来写,如果升序,则需要
          // 如果值比要插入的数字大 后移一位
          while (j > -1 && temp < arr[j]) {
            arr[j + h] = arr[j];
            j -= h;
          }
          // 将较小的值交换到前面
          arr[j + h] = temp;

          SortUtil.print(arr);
        }
      }
      // 减小步进增量 直到为最小为1 进行简单插入排序.后不符合while环境 退出循环,排序结束
      h = (h - 1) / 3;
    }
  }

  public static void main(String[] args) {
    new ShellSort().shellSort(SortUtil.ARR);
  }

}

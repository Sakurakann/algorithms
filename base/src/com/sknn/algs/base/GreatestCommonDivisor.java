package com.sknn.algs.base;

/**
 * Create with IntelliJ IDEA. Author haiyangp. Date 2017-11-21 19:53:44
 * 最大公约数
 */
public class GreatestCommonDivisor {

  /**
   * <P>
   *   计算两个非负整数q，p的最大公约数：若q是0，则最大公约数为p。
   *   否则，将p除以q得到余数r，p和q的最大公约数即为q和r的最大公约数。
   * </P>
   * @param q 参数1
   * @param p 参数2
   * @return 参数1 和 参数2 的最大公约数
   */
  private static int gcd(int q, int p) {
    //判断参数合法性
    if (q < 0 || p <0) {
      throw new IllegalArgumentException("参数只能为非负整数");
    }

    //判断是否有零值
    if (q == 0) {
      return p;
    }
    if (p == 0) {
      return q;
    }

    // 用较大的数字与较小的数字相除，得余数，余数使用零时变量接收
    int r;
    if (q > p) {

      r = q % p;
      //递归，知道出现余数为零的情况。  递归的重点是边界条件，已知条件判断要往边界靠拢才不会出现死循环。
      return gcd(p, r);

    } else {
      //包含了相等的情况，余数为零，按照前面的判断，结果数字应该为其本身
      r = p % q;
      return gcd(q, r);
    }
  }

  public static void main(String[] args) {
    int a = 5;
    int b = 13;
    int gcd = gcd(b, a);
    System.out.println(gcd);
  }

}

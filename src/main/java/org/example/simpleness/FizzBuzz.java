package org.example.simpleness;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 写一个程序，输出从 1 到 n 数字的字符串表示。
 * <p>
 * 1. 如果n是3的倍数，输出“Fizz”；
 * <p>
 * 2. 如果n是5的倍数，输出“Buzz”；
 * <p>
 * 3.如果n同时是3和5的倍数，输出 “FizzBuzz”。
 * <p>
 * 示例：
 * <p>
 * n = 15,
 * <p>
 * 返回:
 * [
 * "1",
 * "2",
 * "Fizz",
 * "4",
 * "Buzz",
 * "Fizz",
 * "7",
 * "8",
 * "Fizz",
 * "Buzz",
 * "11",
 * "Fizz",
 * "13",
 * "14",
 * "FizzBuzz"
 * ]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/fizz-buzz
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class FizzBuzz {

    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        Map<Integer, String> map = new HashMap();
        map.put(3, "Fizz");
        map.put(5, "Buzz");
        for (int num = 1; num <= n; num++) {
            String result = "";
            for (Integer key : map.keySet()) {
                if (num % key == 0) {
                    result += map.get(key);
                }
            }
            if (result.equals("")) {
                result += Integer.toString(num);
            }
            list.add(result);
        }
        return list;
    }


    public static void main(String[] args) {
        fizzBuzz(15).forEach((str) -> {
            System.out.println(str);
        });
    }


}

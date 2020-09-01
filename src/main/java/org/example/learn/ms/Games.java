package org.example.learn.ms;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Games {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        if (m <= 1 || m >= 100) {
            System.out.println("ERROR!");
            return;
        }
        List<Integer> result = last(m);
        result.sort((o1, o2) -> {
            return o1.compareTo(o2);
        });
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.size(); i++) {
            sb.append(result.get(i));
            if (i != (result.size() - 1)) {
                sb.append(",");
            }
        }
        System.out.println(sb.toString());
    }


    public static List<Integer> last(int m) {
        int n = 100;
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        while (list.size() != m - 1) {
            for (int i = 0; i < m; i++) {
                Integer pre = list.pollFirst();
                if (i != m - 1) {
                    list.add(pre);
                }
            }
        }
        return list;
    }
}

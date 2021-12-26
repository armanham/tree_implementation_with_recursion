package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        DefaultTree<Integer> defaultTree = new DefaultTree<>();
        defaultTree.addNode(10);
        defaultTree.addNode(20);
        defaultTree.addNode(15);
        defaultTree.addNode(13);
        defaultTree.addNode(17);
        defaultTree.addNode(30);
        defaultTree.addNode(40);
        defaultTree.deleteNode(20);

        BigDecimal k = BigDecimal.valueOf(2 * Long.MAX_VALUE);
        System.out.println(BigDecimal.valueOf(Long.MAX_VALUE).add(BigDecimal.valueOf(Long.MAX_VALUE)));
        System.out.println("lONG " + k);


        List<String> list = new ArrayList<>();
        list.add("d");
        list.add("t");
        list.add("g");
        list.add("a");
        System.out.println(max(list));
        sort(list);
        System.out.println(list.toString());

        List<Number> list1 = Arrays.asList(1, 2, 6, 7, 8);
        System.out.println(sum(list1));
    }

    public static <T extends Comparable<T>> T max(List<T> list) {
        if (list.isEmpty()) {
            return null;
        }
        if (list == null) {
            return null;
        }
        T max = list.get(0);
        for (T elements : list) {
            if (elements.compareTo(max) > 0) {
                max = elements;
            }
        }
        return max;
    }

    public static <T extends Comparable<T>> void sort(List<T> list) {
        if (list.isEmpty() || list == null) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < list.size() - i; j++) {
                if (list.get(j - 1).compareTo(list.get(j)) > 0) {
                    T current = list.get(j - 1);
                    list.set(j - 1, list.get(j));
                    list.set(j, current);
                }
            }
        }
    }

    private static BigDecimal sum(List<? extends Number> list) {
        BigDecimal sum = BigDecimal.ZERO;
        for (Number nums : list) {
            sum = sum.add(new BigDecimal(nums.toString()));
        }
        return sum;
    }
}

package com.shildt.collections.treeSet;

import java.util.TreeSet;

/*
p.588
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        System.out.println(ts);
        System.out.println(ts.subSet("E", "F"));
    }
}
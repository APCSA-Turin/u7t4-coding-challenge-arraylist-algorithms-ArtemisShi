package com.example.project;

import java.util.ArrayList;
import java.util.Collections;

public class test {
    public static void main(String[] args) {
        ArrayList<String> blo= new ArrayList<>();
        blo.add("saf");
        blo.add("bafaifs");
        blo.add("saf");
        blo.add("baf");
        blo.add("bafaifs");
        blo.add("safafsais");
        blo.add("baf");
        ArrayList<Integer> pol= new ArrayList<>();
        // pol.add(new Integer(1));
        // pol.add(new Integer(3));
        // pol.add(new Integer(1));
        // pol.add(new Integer(4));
        // pol.add(new Integer(4));
        // pol.add(new Integer(3));
        // pol.add(new Integer(1));
        // pol.add(new Integer(45));
        // pol.add(new Integer(1));
        pol.add(new Integer(3));
        pol.add(new Integer(2));
        pol.add(new Integer(2));
        pol.add(new Integer(4));
        int[] boop ={1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6};
        System.out.println("Orig:   [1, 3, 1, 4]");
        System.out.println("got:    "+ Main.fix34(pol));
        System.out.println("Expect: [1, 3, 4, 1]");
        System.out.println();
        System.out.println("Orig:   [1, 3, 1, 4, 4, 3, 1]");
        System.out.println("got:    "+ Main.fix34(pol));
        System.out.println("Expect: [1, 3, 4, 1, 1, 3, 4]");
        System.out.println();
        System.out.println("Orig:   [3, 2, 2, 4]");
        System.out.println("got:    "+ Main.fix34(pol));
        System.out.println("Expect: [3, 4, 2, 2]");
    }
}

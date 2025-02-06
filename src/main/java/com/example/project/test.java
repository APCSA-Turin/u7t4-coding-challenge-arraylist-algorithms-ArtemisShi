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
        pol.add(new Integer(2));
        pol.add(new Integer(3));
        pol.add(new Integer(20));
        pol.add(new Integer(0));
        // pol.add(new Integer(2));
        // pol.add(new Integer(7));
        // pol.add(new Integer(2));
        // pol.add(new Integer(45));
        // pol.add(new Integer(2));
        // pol.add(new Integer(6));
        // pol.add(new Integer(2));

        System.out.println(Main.shiftLeft(pol));
    }
}

package org.example.corejavasamples.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Fat");
        hs.add("MAT");
        hs.add("BAT");
        hs.add("RAT");
        hs.add("RAT");
        hs.add("GAT");
        System.out.println(hs);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Fat");
        lhs.add("MAT");
        lhs.add("BAT");
        lhs.add("RAT");
        lhs.add("RAT");
        lhs.add("GAT");
        System.out.println(lhs);


        TreeSet<String> ts = new TreeSet<>();
        ts.add("FAT");
        ts.add("MAT");
        ts.add("BAT");
        ts.add("RAT");
        ts.add("RAT");
        ts.add("GAT");
        System.out.println(ts);


        TreeSet<Integer> nts = new TreeSet<>();
        nts.add(1);
        nts.add(9);
        nts.add(7);
        nts.add(5);
        nts.add(11);
        System.out.println(nts);

    }

}

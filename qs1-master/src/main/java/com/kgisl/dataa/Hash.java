package com.kgisl.dataa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hash
 */
public class Hash {
    String name;
    public static void main(String[] args) {
        List<String> l=new ArrayList<String>();
        l.add("e");
        l.add("d");
        l.add("f");
        l.add("e");
        List<Object> l1 = l.stream().distinct().collect(Collectors.toList());
System.out.println(l1);
    }
}

    // public static void main(String[] args) {
    //     HashSet <String> i=new HashSet<String>();
    //     i.add("A");
    //     i.add("M");
    //     i.add("I");
    //     i.add("A");
    //     i.add("R");
    //  Iterator <String>in=i.iterator();
    //  while(in.hasNext());
    //  System.out.println(in.next());

    // }

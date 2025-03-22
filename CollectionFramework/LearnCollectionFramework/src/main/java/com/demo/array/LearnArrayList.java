package com.demo.array;

import java.util.*;

public class LearnArrayList {
    public static void main(String[] args) {
        System.out.println("This is array list");

        // declaration of ArrayList
        ArrayList arrlist = new ArrayList();
        ArrayList arrlist1 = new ArrayList(30);

        ArrayList<String> arrayList2 = new ArrayList<>();

        //Vector
        Vector v = new Vector();
        Vector vc = new Vector(60);

        //Stack
        Stack<Integer>stack = new Stack<>();

        stack.push(1);
        stack.push(23);

        Object obj= stack.pop();

        //cursor in collection framework
        Scanner sc = new Scanner(System.in);
        Vector v1 = new Vector();
        System.out.println("Enter Vector elements");
        for (int i = 0; i < 5; i++) {
            v1.add(sc.nextInt());
        }
        System.out.println("Vector v1 = :"+v1);
        Enumeration e = v1.elements();

        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

        //  hash set
        HashSet hs = new HashSet();
        HashSet hs1 = new HashSet(100,.80f); // here if 80 percent of the hash set is filled then the new hash set is created

        ArrayList ls = new ArrayList();
        HashSet hs4 = new HashSet(ls); // here arraylist hashset is created and stored in hs4 hashSet

        //linkedHashSet

        LinkedHashSet lhs = new LinkedHashSet();
        LinkedHashSet lhs1 = new LinkedHashSet(100);
        LinkedHashSet lhs2 = new LinkedHashSet(100,.80f);

        // combination of linked list and hashset
        //insertion order is conserved

        //Sorted set
        SortedSet s = new TreeSet(); // Tree set is the implementation of interface sorted Set

        //Tree set
        TreeSet tree = new TreeSet(); // declaration of tree set




    }
}

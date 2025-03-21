package com.demo.array;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

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


    }
}

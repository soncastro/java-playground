package com.songomes.javatraining.aleatorio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Teste09 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original list: " + list);

        Collections.reverse(list);

        System.out.println("Reversed list: " + list);
    }

}

package com.abstractclass;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(null);
        String  input = "2 5 1 9 6 8 7 0";
        String[] data = input.split(" ");

        for(String s: data){
            //System.out.println(s);
            list.addItem(new Node(s));
            //System.out.println(list.getRoot().getValue());
        }

        list.traverse(list.getRoot());
    }

}

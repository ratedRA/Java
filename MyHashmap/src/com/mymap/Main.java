package com.mymap;

public class Main {
    public static void main(String[] args) {
        customMap<Integer, String> checkMap = new MyHashMap<>(5);
        checkMap.put(1,"first value" );
        checkMap.put(2,"second value" );
        System.out.println(checkMap.get(1));
        System.out.println(checkMap.containsKey(2));
        System.out.println(checkMap.size());
        checkMap.remove(1);
        System.out.println(checkMap.get(1));

        // storing employee information using map;
        // key -> employee id, value -> employee object

        Employee john = new Employee(1,"John", "john@mail.com");
        customMap<Integer, Employee> empMap= new MyHashMap<>(10);
        empMap.put(john.getEmpId(),john);
        System.out.println(empMap.get(1).getEmpName());
    }
}

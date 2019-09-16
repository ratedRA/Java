package com.annotations;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setfName("aman");
        person.setlName("prasad");
        person.setAge("23");
        person.setAddress("Bangaluru");

        ObjectToJsonConvertor obj = new ObjectToJsonConvertor();
        String result = obj.objectToJson(person);
        System.out.println(result);
    }
}

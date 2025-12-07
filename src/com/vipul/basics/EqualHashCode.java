package com.vipul.basics;

import com.vipul.data.HashCodeImplement;

public class EqualHashCode {

    public static void main(String[] args) {
        // If there is no implemenatation of hashcode and equals methods
        // both objects are not equal
        // hashcode and equal are used in Collections API
        // here objects are equal are based on equal method
        HashCodeImplement obj1 = new HashCodeImplement();
        HashCodeImplement obj2 = new HashCodeImplement();

        System.out.println(obj1 == obj2);
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1.equals(obj1));
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
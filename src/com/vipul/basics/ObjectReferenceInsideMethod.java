package com.vipul.basics;

public class ObjectReferenceInsideMethod {

    public static void main(String[] args) {
        GenericsBasics baseModel = new GenericsBasics();
        System.out.println("before caller: " + baseModel);
        methodReference(baseModel);
        System.out.println("after caller: " + baseModel);
    }

    private static void methodReference(GenericsBasics baseModel) {
        /*
        this method argument is new variable sharing original mmTransfer
        as we have updated this variable it will point to new mmTransfer object
         */
        System.out.println("before called: " + baseModel);
        System.out.println(baseModel);
        baseModel = new GenericsBasics();
        System.out.println("before called: " + baseModel);
    }
}

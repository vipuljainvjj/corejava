package com.vipul.annotation.impl;

import com.vipul.annotation.RuntimeAnnotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class AnnotationReflection {
	
	public String baby = "baby";
	
	@RuntimeAnnotation(source="baby")
	public void someMethod(String str) {
		
		this.baby = str;
		System.out.println("this is the String: " + str);
	}
	
	
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, ClassNotFoundException {
		AnnotationReflection annotationReflection = new AnnotationReflection();
		Class cl = annotationReflection.getClass();
		for (Method m : cl.getDeclaredMethods()) {
			System.out.println("m: " + m);
			RuntimeAnnotation at =  m.getAnnotation(RuntimeAnnotation.class);
			if(at != null) {
				System.out.println(at.source());
				Field f = cl.getDeclaredField(at.source());
				System.out.println(f);
			}
		}
		
		System.out.println(annotationReflection.getClass());

        Class classRetention = Class.forName("com.vipul.annotation.impl.ClassRetentionProcessor");
        System.out.println(classRetention);

        System.out.println(Arrays.toString(classRetention.getAnnotations()));
//		ClassRetention actualObj = (ClassRetention) classRetention.newInstance();
//		System.out.println(actualObj);

        Class runtimeRetention = Class.forName("com.vipul.annotation.impl.RuntimeRetentionProcessor");
        System.out.println(Arrays.toString(runtimeRetention.getAnnotations()));

        Class sourceRetention = Class.forName("com.vipul.annotation.impl.SourceRetentionProcessor");
        System.out.println(Arrays.toString(sourceRetention.getAnnotations()));
	}
}


package com.vipul.annotation.impl;

import com.vipul.annotation.ClassRetentionAnnotation;

@ClassRetentionAnnotation(classRetention = "Class retention")
public class ClassRetentionProcessor {

	@Override
	public String toString() {
		return "CLASS RETENTION";
	}

	public static void main(String[] args) {

	}

}
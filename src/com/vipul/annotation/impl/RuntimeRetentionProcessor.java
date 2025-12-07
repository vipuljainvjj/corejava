package com.vipul.annotation.impl;

import com.vipul.annotation.RuntimeRetentionAnnotation;

@RuntimeRetentionAnnotation(runtimeRetention = "Runtime Retention")
public class RuntimeRetentionProcessor {

	@Override
	public String toString() {
		return "Runtime Retention";
	}

	public static void main(String[] args) {
		
	}

}
package com.vipul.lambda.exercise;

import java.util.List;

public interface MyInterface {

}

@FunctionalInterface
interface SortingInterface<E> {
	public void sort(List<E> list);
}

@FunctionalInterface
interface PrintInterface<E> {
	public void print(List<E> list);
}

@FunctionalInterface
interface SpecificFilter<E> {
	public void printSpecific(String s, List<E> list);
}
package com;

import java.util.*;

class bean<t> {
	private t name;
	private int age;

	public bean(t name) {
		this.name = name;
	}

	public t getName() {
		return name;
	}

	public void setName(t name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

public class Parent {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		bean<String> boy = new bean<>("tom");
		bean<Integer>in = new bean<>(5);
		list.add(2);
		list.add(-3);
		list.add(5);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print((Integer)list.get(i) + " ");
		}
		System.out.println(boy.getName()+" "+in.getName());
		System.out.println(Collections.binarySearch(list,5));
	}
}
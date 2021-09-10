package com.java.week2_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Fruit> list = new ArrayList<Fruit>();
		System.out.println("Fruit List (ordered by name): ");
		list.add(new Fruit(1, "Apple", 1500));
		list.add(new Fruit(2, "Peach", 2000));
		list.add(new Fruit(3, "Watermelon", 2500));
		list.add(new Fruit(4, "Lemon", 2000));
		list.add(new Fruit(5, "Banana", 1200));
		list.add(new Fruit(6, "Orange", 2300));
		list.add(new Fruit(7, "Grape", 1800));
		list.add(new Fruit(8, "Strawberry", 2000));
		list.add(new Fruit(9, "Blueberry", 1900));
		list.add(new Fruit(10, "Kiwi", 2100));
		list.add(new Fruit(11, "Mango", 1600));
		
		System.out.println(list.get(1));
		
		Collections.sort(list, new FruitComparator());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println("Fruit "+list.get(i).toString());
		}

		System.out.println("\nReverse: \n");

		Collections.sort(list, new FruitComparatorDesc());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println("Fruit "+list.get(i).toString());
		}
	}

}

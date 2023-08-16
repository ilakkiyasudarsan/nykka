package Selenium;

import java.util.ArrayList;

public class pgm51 {
	
	public static void main(String[] args) {
		ArrayList<String>al=new ArrayList<String>();
		al.add("apple");
		al.add("manago");
		al.add("cova");
		al.add("orange");
		al.add("pinapple");
		al.add("graps");
		al.add("banana");
		String particular=al.get(0);
		System.out.println(particular);
		al.add("veg");
		al.set(1, "car");
		System.out.println(al);
		al.remove(1);
		System.out.println(al);
		int count=al.size();
		System.out.println(count);
		al.clear();
		System.out.println(al);
	}

}

package GenericPractice;


import java.util.ArrayList;
import java.util.List;

import GenericPractice.MyCostomList;

public class GenericRunner {

	
	static <X> X doubleValue(X value) {
		return value;
	}

	
	public static void main(String[] args) {

		MyCostomList<String> list = new MyCostomList<>();
		list.addElement("Item 1");
		list.addElement("Item 2");
		String value = list.get(0);
		System.out.println(list);
		System.out.println(value);
		
		
		MyCostomList<Integer> list1 = new MyCostomList<>();
		list1.addElement(Integer.valueOf(1));
		list1.addElement(Integer.valueOf(2));
		Integer number = list1.get(0);
		System.out.println(list1);
		System.out.println(number);
		
		String str = doubleValue(new String());
		Integer number1 = doubleValue(Integer.valueOf(5));
		ArrayList list2 = doubleValue(new ArrayList());
		
	}

}

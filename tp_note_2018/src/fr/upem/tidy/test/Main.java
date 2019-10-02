package fr.upem.tidy.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

	public static void lessThanThreeLetters(List<String> list) {
		String result = "";
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).length() <= 3)
				result += list.get(i) + " ";
		}
		System.out.println(result);
	}
	

	public static void removeFromListIf(List<String> list, Predicate<String> filter) {
		list.removeIf(filter);
	}

	public static void removeFromListLessThanThreeLetters(List<String> list) {
		removeFromListIf(list, (s) -> s.length() > 3);
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("toto");
		list.add("bla");
		list.add("foo");
		list.add("bar");
		list.add("titi");

		removeFromListLessThanThreeLetters(list);
		System.out.println(list); // [bla, foo, bar]
	}

}

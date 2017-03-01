package main.java;

import java.util.ArrayList;
import java.util.List;

public class MyMainSrc {

	private void aMethod(int i) {
		System.out.println("az-zxcv Method. i=" + i);
	}

	private void bMethod() {
		System.out.println("xb-Method-ccc-ddd---stash test");

	}

	public List<String> getBaseList() {
		List<String> myList = new ArrayList();
		myList.add("this is the first String");
		myList.add("this is second String");
		myList.add("this is third String");
		return myList;
	}
}

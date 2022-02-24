package main;

import java.util.ArrayList;

public class Queue {

	ArrayList<String> qArr = new ArrayList<String>();

	public void add(String str) {

		qArr.add(str);
		System.out.println(str);

	}

	public String show() {

		String str = null;

		if (qArr.size() != 0) {
			str = qArr.get(0);
			qArr.remove(0);

		}
		return str;

	}

}

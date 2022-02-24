package main;

import java.util.ArrayList;

public class Stack {
	
	ArrayList<String> sArr = new ArrayList<>();
	
	public void add(String str) {
		
		sArr.add(0, str); // 밀어내서 넣기 위해
//		System.out.println(str);
		
	}
	
	public String show() {

		String str = null;

		if (sArr.size() != 0) {
			str = sArr.get(0);
			sArr.remove(0);

		}
		return str;

	}

}

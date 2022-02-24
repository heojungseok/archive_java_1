package main;

import java.util.ArrayList;

public class HashMap {

	ArrayList<String> keyArr = new ArrayList<>(); // key
	ArrayList<String> valueArr = new ArrayList<>(); // value

	public void put(String key, String value) {
		int idx = keyArr.indexOf(key);
		//키에 데이터가 아무것도 없다면 키와 값을 모두 입력
		if (idx == -1) {
			keyArr.add(key);
			valueArr.add(value);
		}
		//키가 데이터가 있다고 하면 값에 중복으로 입력
		else {
			valueArr.add(value);
		}

	}

	public String get(String key) {

		int idx = keyArr.indexOf(key);
		return valueArr.get(idx);

	}

}

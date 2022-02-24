package main;

import java.util.ArrayList;

public class HashMap {

	ArrayList<String> keyArr = new ArrayList<>(); // key
	ArrayList<String> valueArr = new ArrayList<>(); // value

	public void put(String key, String value) {
		int idx = keyArr.indexOf(key);
		//Ű�� �����Ͱ� �ƹ��͵� ���ٸ� Ű�� ���� ��� �Է�
		if (idx == -1) {
			keyArr.add(key);
			valueArr.add(value);
		}
		//Ű�� �����Ͱ� �ִٰ� �ϸ� ���� �ߺ����� �Է�
		else {
			valueArr.add(value);
		}

	}

	public String get(String key) {

		int idx = keyArr.indexOf(key);
		return valueArr.get(idx);

	}

}

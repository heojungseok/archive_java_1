package main;

import java.util.ArrayList;
import java.util.Random;

public class HashSet {

	ArrayList<Integer> arr = new ArrayList<>();

	// 중복체크
	public void add(int num) {
		int idx = arr.indexOf(num);
		if (idx == -1) {
			arr.add(num);
		}
	}
	//데이터를 반환
	public int next() {
		int ranIdx = new Random().nextInt(arr.size());
		int value = arr.get(ranIdx);
		arr.remove(ranIdx);
		return value;
	}
	// 읽어올 데이터가 남아있는지 없는지 확인함
	public boolean hasNext() {
		return arr.size() == 0? false : true;
	}
	// 길이 설정
	public int size() {
		return arr.size();
	}
}

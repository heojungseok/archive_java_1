package main;

import java.util.ArrayList;
import java.util.Random;

public class HashSet {

	ArrayList<Integer> arr = new ArrayList<>();

	// �ߺ�üũ
	public void add(int num) {
		int idx = arr.indexOf(num);
		if (idx == -1) {
			arr.add(num);
		}
	}
	//�����͸� ��ȯ
	public int next() {
		int ranIdx = new Random().nextInt(arr.size());
		int value = arr.get(ranIdx);
		arr.remove(ranIdx);
		return value;
	}
	// �о�� �����Ͱ� �����ִ��� ������ Ȯ����
	public boolean hasNext() {
		return arr.size() == 0? false : true;
	}
	// ���� ����
	public int size() {
		return arr.size();
	}
}

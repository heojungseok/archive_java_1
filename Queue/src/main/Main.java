package main;

import java.util.Iterator;
import java.util.Random;


public class Main {

	public static void main(String[] args) {
		
		Random rd = new Random();
		int [] lotto = new int [6];
		boolean [] isDup = new boolean[45];
		
		for (int i = 0; i < lotto.length; i++) {
			int ranNum = rd.nextInt(45);
			if (isDup[ranNum] ==  false) {
				System.out.println(isDup[ranNum]);
				isDup[ranNum] = true;
				System.out.println(isDup[ranNum]);
				lotto[i] = ranNum;
				System.out.println(lotto[i]);
				System.out.println(ranNum+1);
			}else {
				i--;
			}
		}
		
//		HashSet h = new HashSet();
//		
//		while(h.size() < 6) {
//			h.add(new Random().nextInt(45)+1);
//		}
//		
//		while(h.hasNext()) {
//			System.out.println(h.next());
//		}
//		
					
		
		
//		HashMap h = new HashMap();
//		
//		h.put("�̸�","h");
//		h.put("����","M");
//		h.put("����","15");
//		
//		System.out.println(h.get("�̸�"));
//		System.out.println(h.get("����"));
//		System.out.println(h.get("����"));
		
//		HashSet �ߺ��� ������� ����
//		HashSet<Integer> lotto = new HashSet<>();
//		while(lotto.size() < 6) {
//			lotto.add(new Random().nextInt(45)+1);
//		}
//		
//		Iterator <Integer> ito = lotto.iterator();
//		while(ito.hasNext()) {
//			System.out.println(ito.next());
//		}
		
//		HashMap <String, String> hash = new HashMap<>();
//		
//		hash.put("�̸�", "������");
//		hash.put("����", "29");
//		hash.put("����", "��");
//		hash.put("���", "�ڹ�");
//		
//		System.out.println(hash.get("�̸�"));
//		System.out.println(hash.get("29"));
		
//		Queue q = new Queue();
//		
//		q.add("r");
//		q.add("e");
//		q.add("a");
//		q.add("l");
//		
//		System.out.println();
//		System.out.println(q.show());
//		System.out.println(q.show());
//		System.out.println(q.show());
//		System.out.println(q.show());
//		System.out.println(q.show());
//		
		Stack s = new Stack();
		
		s.add("r");
		s.add("e");
		s.add("a");
		s.add("l");
		
		System.out.println();
		System.out.println(s.show());
		System.out.println(s.show());
		System.out.println(s.show());
		System.out.println(s.show());
		System.out.println(s.show());

		
		
	}

}

package Main;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Control {

	public void start() {
		// �о����
		String data = "";
		BufferedReader br = null; // ������ try �ۿ�
		try {
			br = new BufferedReader(new FileReader("c:/gjwjdtjr2/test.txt"));

			while (true) {
				String line = br.readLine();
				System.out.println();
				if (line == null)
					break;
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

//}

//	//����Ʈ�� �б�
//	byte [] b = new byte[1024];
//	FileInputStream input;
//	
//	try {
//		
//		input = new FileInputStream("c:/gjwjdtjr2/test.txt");
//		input.read(b);
//		String str = new String(b);
//		System.out.println(str);
//		input.close();
//		
//		
//		
//		
//	} catch (IOException e) {
//		e.printStackTrace();
//		���� ����
//	FileWriter fw;
//
//	try
//	{
//		fw = new FileWriter("c:/gjwjdtjr2/test.txt", false);
//
//		data = "������ \r\n";
//		fw.write(data);
//
//		data = "���� ������ �ض� \r\n";
//		fw.write(data);
//
//		data = "�� �غ��� \r\n";
//		fw.write(data);
//
//		data = "ȭ���� \r\n";
//		fw.write(data);
//		fw.close();
//
//		System.out.println("��������");
//
//	}catch(
//	IOException e)
//	{
//		e.printStackTrace();
//	}
//
//}

}

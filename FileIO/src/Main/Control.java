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
		// 읽어오기
		String data = "";
		BufferedReader br = null; // 선언은 try 밖에
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

//	//바이트로 읽기
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
//		파일 쓰기
//	FileWriter fw;
//
//	try
//	{
//		fw = new FileWriter("c:/gjwjdtjr2/test.txt", false);
//
//		data = "허정석 \r\n";
//		fw.write(data);
//
//		data = "공부 열심히 해라 \r\n";
//		fw.write(data);
//
//		data = "잘 해봐라 \r\n";
//		fw.write(data);
//
//		data = "화이팅 \r\n";
//		fw.write(data);
//		fw.close();
//
//		System.out.println("정상종료");
//
//	}catch(
//	IOException e)
//	{
//		e.printStackTrace();
//	}
//
//}

}

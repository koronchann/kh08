package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test03 {
	public static void main(String[] args) throws IOException {

		File file = new File("sample", "origin.txt");
		file.createNewFile();

		FileOutputStream out = new FileOutputStream(file);

		for (int i = 0; i < 5; i++) {
			out.write(104);
			out.write(101);
			out.write(108);
			out.write(108);
			out.write(111);
			out.write(9);
			out.write('J');
			out.write('a');
			out.write('v');
			out.write('a');
			out.write('!');
			out.write('\n');
		}
		out.close();

		File file_1 = new File("sample", "copy.txt");

		FileInputStream in = new FileInputStream(file);
		FileOutputStream outFile = new FileOutputStream(file_1);
		
	
		while (true) {
			int data = in.read();
			if (data == -1)
				break;
			else {
				outFile.write(data);
			}

		}

		in.close();
		outFile.close();
	}
}

//for이나 if 작업을 계속 반복한다면 파일 용량이 크면 문제가 될것 같습니다
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//문제점
//1.한글 1자 >> 2byte , 2byte >> Stream(1Byte) >> 한글이 통과불가
//2.통로 하나 더 만들어 줄게 >> 2byte 통로 >> reader, writer라는 이름으로 다가 가즈아\

public class Ex05_Reader_Writer_kor {
	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("Ex01_Stream.java");
			fw = new FileWriter("copy_Ex02.txt");
			
			int data = 0;
			while((data = fr.read()) != -1) {
//				System.out.println(data);
//				fw.write(data);
				//요구사항 파일을 만드는데 공백, 엔터, 텝은 제거하고
				if(data != '\t' && data != '\r' && data != ' ') {
					fw.write(data);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			try {
				fw.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

import java.io.BufferedReader;
import java.io.BufferedInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Ex06_FIleReader_FileWriter_Buffer {
	public static void main(String[] args) {
//		try {
//			FileWriter fw = new FileWriter("today.txt");
//			BufferedWriter bw = new BufferedWriter(fw);
//			bw.write("로또");
//			bw.newLine();//개행
//			bw.write("1,2,3,4,5");
//			bw.flush(); //bw.close() 걸면 자동적으로 실행 된다링
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("Ex01_Stream.java");
			br = new BufferedReader(fr);//그럼 버퍼 여러번걸면 더 빨라져?
			String line = "";
			//br.readLine(); 엔터를 기준으로 한줄씩 read
			for(int i = 0; (line = br.readLine()) != null; i++) { //왜 포문썼어?
//				System.out.println(line);
// 				;포함된 문장만 read 하고 싶어요
				if(line.indexOf(";") != -1) {
					System.out.println(line);
				}
				
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ex03_String_Copy_File {
	public static void main(String[] args) throws Exception {
		String orifile = "C:\\Temp\\1.gif";
		String targetfile = "copy.gif";
		
		//default 경로 : 프로젝트 주소
		//경로를 명시하지 않으면 >> 프로젝트 폴더로다가 가버린다 이말이죠~
		
		FileInputStream fis = new FileInputStream(orifile);
		FileOutputStream fos = new FileOutputStream(targetfile);
		
		int data = 0;
		while((data = fis.read())!=-1) {
			fos.write(data);
		}
		fos.close();
		fis.close();
		System.out.println("Done");
	}
}

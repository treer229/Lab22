 import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*\
 스트림의 대상이 File(read, write) : 디스크에 존재하는 물리적 파일
 FileInputStream, FileOutputStream
 text 기반 작업 : C:\\Temp\\a.txt.....
 */


public class Ex02_Point_File_Read_Write {
	public static void main(String[] args) {
		
		//1단계 
		//POINT : I/O 작업은 GC 대상이 아니다
		//파일작업에 있어서는요 키면 무조껀 꺼야되요 아니면 메차쿠차해버릴거야
		//(함수 : close() -> 내부적으로 소멸자 함수 호출);
		FileInputStream fs = null;
			
//		try {
//			fs = new FileInputStream("C:\\Temp\\a.txt");
//			int data = 0;
//			while((data = fs.read()) != -1) {
//				System.out.println("정수(숫자)" + data); //에스키 코드로 나옴 정수로 변환해줘야 된다링
//				//read 정수값으로 전달
//				//에스키 코드표 기준으로 한 정수값;
//				System.out.println((char)data);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				fs.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
		
		 FileInputStream fis = null;
		 FileOutputStream fos = null;
		 String path = "C:\\Temp\\난쓰래기.txt";
		 
		 try {
			fis = new FileInputStream(path);
			fos = new FileOutputStream("C:\\Temp\\병신평신난쓰래기.txt");
			//write
			//FileOutputStream 클래스는 Temp 폴더 안에 new.txt가 존재하지 않으면
			//자동으로 파일을 생성합니다 >> 생성된 파일에 쓰기(write)
			
			//new FileOutputStream("C:\\Temp\\new.txt", true);
			//생성자의 두번째 인자가 (true)
			//기존 데이터 : append 번식
			
			//new FileOutputStream("C:\\Temp\\new.txt", true);
			//default는 (false)
			//기존 데이터 : overwrite 덮어쓰기
			int data = 0;
			while((data = fis.read())!=-1) {
				fos.write(data); //new.txt; 텍스트는 인코딩으로 자동으로 아스키코드형식으로다가 ㅎㅎ
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally{
			try {
				fos.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}
}

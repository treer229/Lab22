import java.io.File;
import java.util.Scanner;

public class Ex08_File_Directory {
	public static void main(String[] args) {
//		System.out.println(args.length);
//		System.out.println(args[0]);
//		System.out.println(args[1]);
		if(args.length != 1) {
			System.out.println("사용법 : java 파일명 [디렉토리명]");
			System.exit(0);//프로세스 강제종료
// 		java Ex08_File_Directory C:\\kkkk
		}
		File f = new File(args[0]);
		if(!f.exists() || !f.isDirectory()) {
			System.out.println("유효하지 않은 경로얌~");
			System.exit(0);
		}
		
		//이제서야 분석
		//Point 
		File[] file=f.listFiles(); // 요놈 dir아니뇨? 이놈은 파일 타입 배열 주소값을 보내준다.
		for(int i = 0; i < file.length; i++) {
		 	String name = file[i].getName();
		 	System.out.println(file[i].isDirectory() ? "Dir-" + name : "File-" + name);
		}
		
		
			
	}
}

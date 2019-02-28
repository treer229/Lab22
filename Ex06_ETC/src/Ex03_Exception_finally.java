import java.io.IOException;

public class Ex03_Exception_finally {
	static void startInstall() {
		System.out.println("INSTALL");
	}
	static void copyFiles() {
		System.out.println("COPY FILES");
	}
	static void fileDelete() {
		System.out.println("DELETE FILES");
	}
	public static void Main(String[] args) {
		
		try {
			
			copyFiles();
			startInstall();
			throw new IOException();
			//개발자가 임의로 예외를 생성 할 수 있다.
			//A,B,C 정상입력	D 비정상 입력
			//사용자 예외 던지기(예외 객체를 개발자 직접 생성 (new)
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			//예외가 발생, 발생 하지 않던 강제적 실행 블
			fileDelete();
		}
		System.out.println("Main End");
		
		copyFiles();
		startInstall();
		
	}
}

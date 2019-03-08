import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 컴퓨터 가장 느린 작업(I/O 파일 read, write : Disk) 
 1.File 작업(Disk) >> read, write >> byte 단위 >> 넘나넘나 느리다링
 문제 해결
 Buffer 메모리(쌓아두고 한번에 뿌려버리자 상쾌 통쾌)
 
 2.고민하지마러 그냥 buffer 쓰시오...
 
 3.File I/O 성능 개선
 4.Line 단위 처리 (엔터 기반....)
 5.JAVA API에서 제공한다링//보조스트림
 보조스트림이란? 독자적으로 new를 못해ㅜㅜ 고자임 ㅜㅜ(Parameter 강제자너)
 default 생성자를 구현하지 않다 오버로딩만 구현
 */

public class Ex04_Stream_file_buffer {
	
	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream("data.txt");
			bos = new BufferedOutputStream(fos);
			
			for(int i =0; i<10; i++) {
				bos.write('A');
			}
			/*
			 귱금점
			 버퍼에 썼는데 버퍼는 당시당최 은제 Write한답디까?
			 java buffer 8kbyte -> 8192byte
			 1.buffer = 안에 내용이 채워지면 자동으로 비운다(꽉 차면)
			 2.buffer 강제로 비우는 방법 : flush() 강제
			 3.bos.close() >> 내부적으로 flush()를 호출 남아있는 데이터를 빼간다.
			 
			 */
		//	bos.flush();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				bos.close();
				fos.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}

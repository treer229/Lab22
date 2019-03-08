import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/*
stream(연결통로, 입출력통로, 중간매개체) ex) 빨대
stream(통로의 크기가 제한적 >> 입력 출력 크기 정해져있다. >> 1byte >> Byte 단위 입출력 >> Byte[] 배열이용해서 배출!)

Java API 제공하는 입력 출력 클래스

Stream(Byte);
InputStream(read), OutPutStream(Write);
두개의 추상클래스는 상속을 통한 재정의 목적(강제 구현)

대상(memory)
ByteArrayInputStream : ByteArrayOutputStream;

대상(file)
FileInputStream, FileOutPutStream;

추가적으로 프로세스(pipe), 오디오(audio) 등이 있다리

도움을 주는 클래스(성능)
Buffer (I/O) 성능향상
BufferdInputStream, BufferdOutPutStream;




*/
public class Ex01_Stream {
	public static void main(String[] args) {
//		Memory(Array, Collection)
//		Byte(-128~+127) 정수값
		
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(inSrc[5]);
		
		byte[] outSrc = null;//메모리를 가지고 있지 않다.
		ByteArrayInputStream input = null; //데이터 통로를 통해서 read();
		ByteArrayOutputStream output = null; //데이터 통로를 통해서 write();
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		System.out.println("outSrc = before >>" + Arrays.toString(outSrc));
		
		int data = 0;
		while((data=input.read()) != -1) { //배열의 값이 읽을 것이 없다 -1; , read()함수 실행하면 인덱스를 ++한다.
			System.out.println(data);
			output.write(data);//data값을 자기자신(output)에게 write
			//write 대상이 : ByteArrayOutputStream
		}
		
		outSrc = output.toByteArray();
		//자신이 가지고 있는 값을 배열로 만들어서 누구에게? outSrc에게 주소값 할당
		System.out.println("outSrc = After >>" + Arrays.toString(outSrc));
		
		
		
	}
}

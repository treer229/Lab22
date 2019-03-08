import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/*
stream(�������, ��������, �߰��Ű�ü) ex) ����
stream(����� ũ�Ⱑ ������ >> �Է� ��� ũ�� �������ִ�. >> 1byte >> Byte ���� ����� >> Byte[] �迭�̿��ؼ� ����!)

Java API �����ϴ� �Է� ��� Ŭ����

Stream(Byte);
InputStream(read), OutPutStream(Write);
�ΰ��� �߻�Ŭ������ ����� ���� ������ ����(���� ����)

���(memory)
ByteArrayInputStream : ByteArrayOutputStream;

���(file)
FileInputStream, FileOutPutStream;

�߰������� ���μ���(pipe), �����(audio) ���� �ִٸ�

������ �ִ� Ŭ����(����)
Buffer (I/O) �������
BufferdInputStream, BufferdOutPutStream;




*/
public class Ex01_Stream {
	public static void main(String[] args) {
//		Memory(Array, Collection)
//		Byte(-128~+127) ������
		
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(inSrc[5]);
		
		byte[] outSrc = null;//�޸𸮸� ������ ���� �ʴ�.
		ByteArrayInputStream input = null; //������ ��θ� ���ؼ� read();
		ByteArrayOutputStream output = null; //������ ��θ� ���ؼ� write();
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		System.out.println("outSrc = before >>" + Arrays.toString(outSrc));
		
		int data = 0;
		while((data=input.read()) != -1) { //�迭�� ���� ���� ���� ���� -1; , read()�Լ� �����ϸ� �ε����� ++�Ѵ�.
			System.out.println(data);
			output.write(data);//data���� �ڱ��ڽ�(output)���� write
			//write ����� : ByteArrayOutputStream
		}
		
		outSrc = output.toByteArray();
		//�ڽ��� ������ �ִ� ���� �迭�� ���� ��������? outSrc���� �ּҰ� �Ҵ�
		System.out.println("outSrc = After >>" + Arrays.toString(outSrc));
		
		
		
	}
}

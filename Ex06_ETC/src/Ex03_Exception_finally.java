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
			//�����ڰ� ���Ƿ� ���ܸ� ���� �� �� �ִ�.
			//A,B,C �����Է�	D ������ �Է�
			//����� ���� ������(���� ��ü�� ������ ���� ���� (new)
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			//���ܰ� �߻�, �߻� ���� �ʴ� ������ ���� ��
			fileDelete();
		}
		System.out.println("Main End");
		
		copyFiles();
		startInstall();
		
	}
}

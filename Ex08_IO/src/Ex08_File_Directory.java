import java.io.File;
import java.util.Scanner;

public class Ex08_File_Directory {
	public static void main(String[] args) {
//		System.out.println(args.length);
//		System.out.println(args[0]);
//		System.out.println(args[1]);
		if(args.length != 1) {
			System.out.println("���� : java ���ϸ� [���丮��]");
			System.exit(0);//���μ��� ��������
// 		java Ex08_File_Directory C:\\kkkk
		}
		File f = new File(args[0]);
		if(!f.exists() || !f.isDirectory()) {
			System.out.println("��ȿ���� ���� ��ξ�~");
			System.exit(0);
		}
		
		//�������� �м�
		//Point 
		File[] file=f.listFiles(); // ��� dir�ƴϴ�? �̳��� ���� Ÿ�� �迭 �ּҰ��� �����ش�.
		for(int i = 0; i < file.length; i++) {
		 	String name = file[i].getName();
		 	System.out.println(file[i].isDirectory() ? "Dir-" + name : "File-" + name);
		}
		
		
			
	}
}

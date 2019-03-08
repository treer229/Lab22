import java.io.File;

/*
 �ڹٴ� �̻��ϰԵ� ���� Ŭ������°� �����Ѵ�.
 ���� > ����, ����, ���� ���� ����~ ����ũ
 ���丮(����)(C:\\Temp : ����, ����)
 ��� : ��������, ���� ����
 
 
 C# : File Ŭ����, Directory Ŭ����
 */

//Point : FileOutputStream, FileWriter (���� ���� �����ϴٸ� ����ũ) ������ �ָ����� �ƴϴٸ�

public class Ex07_File_Directory {
	public static void main(String[] args) {
		String path = "C:\\Temp\\file"; // file.txt�� ��������ִ� �������� �۾�  ����� �ּҸ� �ǹ�
		String path2 = "C:\\Temp\\copy";
		File f = new File(path); // ����� �����ּҿ� ���� �м��� �䱸
		File f2 = new File(path2);
		
		
		String filename = f.getName(); //���� �̸� ������!
		System.out.println("�����̸�: " + filename); //����߽��ϴ�~~!!
		System.out.println("��ü���: " + f.getPath());
		System.out.println("�� ������?: " + f.isDirectory());
		System.out.println("������: " + f.getAbsolutePath());
		System.out.println("�� �����̴�? " + f.isFile());
		System.out.println("�� ������ �ڽ��̴�? " + f.isHidden());
		System.out.println("�� ũ�Ⱑ ����? " + f.length()+ "byte");
		System.out.println("�� �θ�� �ҷ��Ͷ�! " + f.getParent());
		System.out.println("�� �ֱ��ϴ�? " +f.exists());
		System.out.println(f.renameTo(f2));
		f.renameTo(f2);
		//f.createNewFile() ���ϻ���
//		f.delete(); ���ϻ���(return true, false)
//		f.canExecute(); ��! �� ������ �����ϳ�? �Ϳ�
		f.canExecute();
		
		
		
		
	}
}

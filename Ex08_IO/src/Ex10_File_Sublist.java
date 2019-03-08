import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Ex10_File_Sublist {
	static int totalFiles = 0; //��ä�� ���� �ڿ� �ƴϰ� ����ƽ ����
	static int totaldirs= 0; //��ä�� ���� �ڿ� �ƴϰ� ����ƽ ����
	
	public static void main(String[] args) {
		if(args.length != 1) {
			System.out.println("���� �ڽľ�! �ȵ� ���ϳ�!");
			System.out.println("java [���ϸ�] [��θ�] �̸��϶� ��ī��");
			System.out.println("java Ex10_File_Sublist C:\\Temp �� �̱��� ���ִ°� ������ �˾ƶ�");
			System.exit(0); // ���μ��� ����!
		}
		
		File f = new File(args[0]); // args[0] > C:\\Temp
		if(!f.exists() || !f.isDirectory()) {
			System.out.println("����!");
			System.exit(0);
		}
		//������� �ǴܵǴ� ����
		printFileList(f);
		System.out.println("�� ���� �� :" + totalFiles);
		System.out.println("�� ���� ��" + totaldirs);
	}
	
	static void printFileList(File dir) {
		System.out.println("[Full Path : " + dir.getAbsolutePath() + "]");
		//�� �ݷ����� �ǹ̴� �����ϱ�
		List<Integer> subDir = new ArrayList<Integer>();
		File[] files = dir.listFiles();
		
		for(int i = 0; i < files.length; i++) {
			String filename = files[i].getName();
			if(files[i].isDirectory()) {
				filename = "<DIR> [" + filename +"]";
				//Point
				//������ �ǹ̴� �����ϱ� ������ ������ ������Ų��
				subDir.add(i);
			} else {
				filename = filename + " / " + files[i].length() + "Byte";
			}
			System.out.println("   " + filename);
		}
		//����
		int dirnum = subDir.size();
		int filenum = files.length - dirnum;
		
		//������
		totaldirs += dirnum; // ���� ���� ����
		totalFiles += filenum; // ���� ���� ����
		
		System.out.println("[Current dirnum]: " +dirnum);
		System.out.println("[Current Filenum]: " + filenum);
		System.out.println("++++++++++++++++++++++++++++++++");
		
		
		//������ �ؼ� subDir �� ���� ���� ������ ���� ��ŭ �ٽ� �Լ��� �����ϵ��� �ϴ� �Լ�
		for(int j=0; j<subDir.size(); j++) {
			int index = subDir.get(j);
			printFileList(files[index]);
		}
		
	}
}

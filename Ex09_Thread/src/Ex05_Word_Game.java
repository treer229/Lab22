
/*
 ������ ������
 main�� ������ ������ �ΰ��� ������
 1. 1��������� �ð��� ����
 2. 2��������� �ܾ��Է��� ó���ϴ� ������
 3. ���� �Լ����� 2�� �����带 ��ŸƮ �ɾ�
 4. �� �ܾ �ϳ��� �Է��ؼ� Ȯ�� ��ư�� ������ �ð��� ���߰� �ϼ���
 5. ���α׷��� ����ǰ� �Ͻÿ�
 */
import javax.swing.JOptionPane;

class WordInsert extends Thread {
	@Override
	public void run() {
		do{
		String i = JOptionPane.showInputDialog("���� �Է��ϼ���");
		if (WordTime.stop == 1) {
			continue;
		} else if (WordTime.stop == 0) {
			String inputdata = i;
			System.out.println("�Է°� : " + inputdata);
			WordTime.stop = 1;
		}
		}while(WordTime.sis = true);
	}
}

class WordTime extends Thread {
	public static int stop = 0;
	public static boolean state = false;
	WordInsert i = new WordInsert();
	static boolean sis = false;
	
	@Override
	public void run() {
		while (true) {
			int i;
			for ( i = 10; i > 0; i--) {
				if (stop == 0) {
					System.out.println(stop + "ssss");
					System.out.println("���� �ð� : " + i);
				} else if (stop == 1) {
					System.out.println(stop + "aaaa5");
					i = 11;
					WordTime.stop = 0;
				}
				try {
					Thread.sleep(1000);// cpu�� �����ϴ� �ʴ� ��� ����
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			System.out.println(stop);
			System.out.println("Ÿ�̸� ����");
			sis = true;
			i = 10;
		}
	}
}

public class Ex05_Word_Game {
	public static void main(String[] args) {
		WordInsert wi = new WordInsert();
		WordTime wt = new WordTime();

		wi.start();
		wt.start();

	}
}

import javax.swing.JOptionPane;

//�ܾ� ���߱� ������ ���
//�ð��� �����ְ����
//������ ���� ����Ǹ鼭 �ð��� ���� �����ִ°�
class Thread_Time extends Thread{
	@Override
	public void run() {
		for(int i = 0; i<10; i++) {
			System.out.println("Thread_Time" + i);
		}
	}
}

public class Ex03_Single_Word_Game {
	
	public static void main(String[] args) {
		Thread_Time tt = new Thread_Time();
		String inputdata = JOptionPane.showInputDialog("���� �Է��ϼ���");
			System.out.println("�Է°� : "  + inputdata);
	}
		
	
	static void timer() {
		for(int i = 10; i>0; i--) {
			System.out.println("���� �ð� : " + i);
			try {
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

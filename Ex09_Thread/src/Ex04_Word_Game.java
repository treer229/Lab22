import javax.swing.JOptionPane;

public class Ex04_Word_Game {
	public static void main(String[] args) {
		WordTime timer = new WordTime();
		timer.start();

		String inputdata = JOptionPane.showInputDialog("���� �Է��ϼ���");
		System.out.println("�Է°� : " + inputdata);

	}
}

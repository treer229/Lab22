import javax.swing.JOptionPane;

public class Ex04_Word_Game {
	public static void main(String[] args) {
		WordTime timer = new WordTime();
		timer.start();

		String inputdata = JOptionPane.showInputDialog("값을 입력하세요");
		System.out.println("입력값 : " + inputdata);

	}
}

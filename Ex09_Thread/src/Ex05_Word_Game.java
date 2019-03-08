
/*
 문제가 문제다
 main을 제외한 쓰래드 두개를 만들어라
 1. 1번쓰래드는 시간을 제어
 2. 2번쓰래드는 단어입력을 처리하는 쓰래드
 3. 메인 함수에서 2개 쓰래드를 스타트 걸어
 4. 단 단어를 하나라도 입력해서 확인 버튼을 누르면 시간을 멈추게 하세여
 5. 프로그램이 종료되게 하시오
 */
import javax.swing.JOptionPane;

class WordInsert extends Thread {
	@Override
	public void run() {
		do{
		String i = JOptionPane.showInputDialog("값을 입력하세요");
		if (WordTime.stop == 1) {
			continue;
		} else if (WordTime.stop == 0) {
			String inputdata = i;
			System.out.println("입력값 : " + inputdata);
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
					System.out.println("남은 시간 : " + i);
				} else if (stop == 1) {
					System.out.println(stop + "aaaa5");
					i = 11;
					WordTime.stop = 0;
				}
				try {
					Thread.sleep(1000);// cpu를 점유하는 너는 잠깐 쉬어
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			System.out.println(stop);
			System.out.println("타이머 종료");
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

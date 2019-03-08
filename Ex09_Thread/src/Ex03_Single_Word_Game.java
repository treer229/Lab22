import javax.swing.JOptionPane;

//단어 맞추기 구구단 등등
//시간을 보여주고시퍼
//문제도 같이 실행되면서 시간도 같이 보여주는것
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
		String inputdata = JOptionPane.showInputDialog("값을 입력하세요");
			System.out.println("입력값 : "  + inputdata);
	}
		
	
	static void timer() {
		for(int i = 10; i>0; i--) {
			System.out.println("남은 시간 : " + i);
			try {
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

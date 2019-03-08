import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

class QuizInfo {
	String question;
	String answer;
	String result;
	HashMap quiz;

	public QuizInfo(String question, String answer, String result) {
		this.question = question;
		this.answer = answer;
		this.result = result;
	}

	public String toString() {
		return "문제:" + this.question + " 쓴답:" + this.answer + " 채점:" + this.result;
	}
}

class CheckQuiz {

	HashMap quiz;
	int Ccount;
	int Wcount;
	int result;
	String[] answer;

	public void solvequiz(int index) {
			Scanner scan = new Scanner(System.in);
			String answer = scan.nextLine();
			
	}
//
//	public void checkquiz(int index) {	
//		 
//	
//	}

	public void checkresult() {
		System.out.println(Ccount);
		System.out.println(Wcount);
	}

	public void CheckEngine(int index) {
			if (!(answer[index].equals(quiz.get(quiz.keySet().toArray()[index])))) {
				System.out.println(index + "번 문제 틀렸습니다.");
			} else {
				System.out.println(index + "번 문제 정답입니다.");
			}
	}

}

public class Ex15_HashMap_Quiz_Object {
	public static void main(String[] args) {

		HashMap<String, String> quiz = new HashMap<>();
		quiz.put("1+1", "2");
		quiz.put("1+2", "3");
		quiz.put("1+3", "4");

		CheckQuiz cq = new CheckQuiz();
		for (int i = 0; i < quiz.size(); i++) {
			Set set = quiz.keySet();
			Object[] obj = set.toArray();
			System.out.println(quiz.keySet().toArray()[i]);
			cq.solvequiz(i);
			cq.checkquiz(i);
			
			// System.out.println(obj[i]);

//           System.out.println(quiz.get(quiz.keySet().toArray()[i]));
		}

	}
}

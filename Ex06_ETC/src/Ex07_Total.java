import java.util.Scanner;

//주민번호 입력 스캐너
//앞 6자리 뒷 7자리
//1.자리수 체크
//2.뒷번호 첫번째 자리값 1~4까지의 값만 허용
//3.1,3남자 2,4여자 출력 가능함수
//3개의 함수 static으로다가

public class Ex07_Total {

	static boolean juminCheck(String ssn) {
		String[] arry = ssn.split("");
		boolean result = false;

		result = (arry.length == 14) ?  true : false;
		return result;
	}

	static boolean checkSex(String ssn) {
		boolean result;
		if(ssn.charAt(7)=='1' || ssn.charAt(7)=='3' ) {
			result = true;
			System.out.println("당신은 남성입니다.");
		} else if(ssn.charAt(7)=='2' || ssn.charAt(7)=='4') {
			result = true;
			System.out.println("당신은 여자입니다.");
		} else {
			result = false; 
			System.out.println("잘못입력하셨습니다.");
		}
		return result;
	}


	public static void main(String[] args) {
		String ssn = "";
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("주민 번호 입력");
			ssn = sc.nextLine();
		} while (!(juminCheck(ssn) && checkSex(ssn)));
		System.out.println("주민등록번호 타당성확인 끝");
		System.out.println("시스템 종료");
		// 출력

	}
}

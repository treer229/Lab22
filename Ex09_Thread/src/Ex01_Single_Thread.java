


//한번에 하나의 함수만 시랭
//함수를 순차적으로 실행

public class Ex01_Single_Thread { // 요뇨속을 프로그램이라 부룬다
	
	public static void main(String[] args) {
		
		System.out.println("나 메인 일꾼이자너~"); 
		worker();
		worker2();
		System.out.println("난 여기서 주거... 안녕...ㅜㅜ");
		
	}
	
	static void worker() {
		System.out.println("나 1번 일꾼이자너~");
	}
	
	static void worker2() {
		System.out.println("나 2번 일꾼이자너~");
	}
}

import java.util.Vector;

/*
 표준화된 인터페이스를 구현하는 클래스 집합
 
 
 		collection
 
 			 |
 	list(상속)  set(상속)				map(인터페이스)
 		|			|				 |
 	Vector		set(상속)				[HashMap]
 	[ArrayList]	Treeset
 		
 	List interface [줄을 서시오~~~~]
 	순서(0), 중복허용(0) > 내부적으로 데이터 관리(배열로 한다~ 이말이야) > Array[0][1][2].......~
 	
 	1.vector(구버전) -> 동기화(멀티 쓰레드) -> Lock 보장(default) -> 데이터 보호가 중점 띠리린
 	2.ArrayList(신버전) -> 동기화(멀티 쓰레드) => Lock 보장X => 필요에 따라 유연하게 Lock저굥 가능  => 성능강조 두둥두두두우둥
 	Ex)동기화
 	
 	
 	Array(배열) : 정적배열(크기가 고정되어 있다)
 	방을 열개 생성 고정 변경불가 ㅜㅜㅜㅜ
 	int[] arr = new int[10];
 	int[] arr = {10,20,30};
 	
 	Ararry(고정, 정적) => 초기설정한 크기 변경 불가
 	1.배열의  크기 고정 : Car[] cars = {new Car(), new Car()};
 	2.배열의 접근 : index(첨자) : cars[0], car[0].color
 	
 	List 인터페이스 구현한 클래스 (Vector, ArrayList) : 동적 배열
 	1. 배열의 크기를 동적 확장 , 축소 가능 => 배열의 재할당 => 아라서 해줌 ㅎ;
 	2.순서를 유지(Array), 순서(index), 중복값 허용
 	3.데이터 저장공간 Array사용
 	4.List 인터페이스를 구현한 클래스( new를 통해 객체 생성 사용)
 	5.구현 클래스(ArrayList)가 가지는 데이터 타입 : Object[] arr = new Object[10] 타입으로다가 합니다.
 		장점 : 모든 타입의 부모 타입(int, Car, String....) 모든 자료 삽입
 		단점 : 끄낼때 object를 따운께스팅해서 사용해야된다는 슬픈 ㅜㅜㅜㅜㅜ
 	6. 단점을 극복하기 위한 방법 제너뤽ㄷㄷㄷㄷ?(타입강제) 통해 문제 해결
 	
 	
 */


public class Ex01_Vector {
	
	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println("초기 디폴트 용량 :" + v.capacity());
		v.add("AA");//[0]
		v.add("BB");//[1]
		v.add("AA");//[2]
		v.add(100); //[3]
		System.out.println(v);
		
		for(int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i)); //get 함수의 return type = Object;
		}
		System.out.println("get함수 사용");
		
		for(Object obj : v) {
			System.out.println(obj);
		}
		System.out.println("향상된 포문 사용");
		
		Vector<String> v2 = new Vector<String>();
		v2.add("Hell");
		v2.add("war");
		for(String s : v2) {
			System.out.println(s);
		}
		System.out.println("제너릭 사용");
		System.out.println();
		
		System.out.println("사이즈"+v2.size());
		System.out.println("캐퍼시티"+v2.capacity());
		System.out.println();
		
		System.out.println("v3 벡터 시작");
		Vector v3 = new Vector();
		System.out.println(v3.capacity());
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		System.out.println("10번쨰 카파시티 "+v3.capacity());
		v3.add("A");
		System.out.println("11번째 저장시 사이즈"+v3 .size());
		System.out.println("11번째 저장시 카파시티"+v3 .capacity());
		
	}
}

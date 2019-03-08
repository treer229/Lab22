import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 Map 인터페이스를 구현하는 클래스
 
 Map이라는 녀석은 말이죠? key, value 가 하나양 쌍배열이란 마리징 
 ex) 지역번호 : (02, 서울) , 우편번호 : (155, 우리집) 이런거 말이지
 Key 값 : 중복(x);
 value : 중복(o);
 키값을 던져 벨류값을 찾는거양 ㅎ
 
 Map >> Generic 지원
 
 HashTable(구버전임ㅎ) : 동기화 보장 (보험 사기꾼같자너)
 HashMap(신버전ㅎㅎ) : 동기화 강제 안해용ㅎㅎ 필요에 따라 동기화 할 수 있어영
 
 */

public class Ex12_Map_HashMap {
	
	public static void main(String[] args) {
	
		HashMap map = new HashMap();
		map.put("타이거", "1004");
		map.put("오마이", "갓");
		map.put("홀리몰리", "갓");
		//활용 : 회원의 아이디, 비밀번호를 담아두려고
		//메모리(heap) >> 종료 보전(파일기반) login.txt 관리문제가 생긴다 >> RDBMS(관계형DB) ㅎㄷ?! 이런게 있어>!!:!:>!>!!??!
		System.out.println(map.containsKey("오마이")); 
		System.out.println(map.containsKey("홀리몰리"));
		System.out.println(map.containsValue("갓"));
		
		//Point : key값을 가지고 value값을 찾는다~~~~~~
		System.out.println("++++++++++++++");
		System.out.println(map.get("타이거")); // 홍이라는 key값을 map이 가지고 있지 않다.
		
		//사고친대 ㅜㅜ 외그레 ㅜㅜㅜ
		//put
		map.put("타이거", 1008);//키가 같은 경우는 벨류를 덮어써버린다. 오버라이트해버려용 
		System.out.println("오버라이트 되버린 타이거 찡 ㅜㅜ");
		System.out.println(map.get("타이거"));
		System.out.println("before map.size() " + map.size());
		
		System.out.println("삭제되어버린 홀리몰리 ㅜㅡㅜ 너무 슬퍼");
		Object result = map.remove("홀리몰리");
		System.out.println("remove() 는 리턴값으로 지우는 벨류값을 리턴해준다리 : " + result );
		System.out.println("after map.size() " + map.size());
		System.out.println(map.get("홀리몰리"));
		
		System.out.println("map.keyset() 함수는 아래처럼 나온다리");
		System.out.println(map.keySet());
		
		Set set = map.keySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		System.out.println("벨류스~~");
		Collection col = map.values();
		Iterator it2=col.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
	}
}

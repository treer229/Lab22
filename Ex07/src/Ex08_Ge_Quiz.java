import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import kr.or.bit.Copy_Emp2;
import kr.or.bit.Emp;

public class Ex08_Ge_Quiz {
	public static void main(String[] args) {
		//1. Emp 클래스를 사용해서 사원 3명 생성
		//단 ArrayList 제너릭을 사용하세요
		
		List<Emp> m = new ArrayList<Emp>();
		
		m.add(new Emp(100, "김", "It"));
		m.add(new Emp(200, "이", "It"));
		m.add(new Emp(300, "박", "It"));
		
		//2. 3명의 사원 정보를 개선된 포문을 사용해서 출력
		for(Emp n : m) {
			System.out.println(n);
		}
		//3. 일반포문써서 사원 정보 출력 정말 너무하십니다
		for(int i = 0; i<m.size(); i++) {
			System.out.println(m.get(i));
		}
		
		//4.Copy Emp라는 클래스를 만드는데 Emp랑 구조는 똑같다. 그러나 !! 
		//잡이라는 멤버필드 대신에 private int sal 추가하고 getter setter 만들어라
		
		List<Copy_Emp2> m2 = new ArrayList<Copy_Emp2>();
		
		m2.add(new Copy_Emp2(100, "김", 1000));
		m2.add(new Copy_Emp2(200, "이", 2000));
		m2.add(new Copy_Emp2(300, "박", 3000));
		
		System.out.println("++++++++++++");
		for(Copy_Emp2 a : m2) {
			System.out.println(a);
		}
		
		//200번사원의 급여를 500으로 바꿔서 출력
		for(int i=0; i<m2.size(); i++) {
			if(m2.get(i).getEmpno() == 200) {
				m2.get(i).setsal(5000);
			}
		}
		
		System.out.println("====================");
		for(Copy_Emp2 e : m2) {
			System.out.println(e);
		}
		
		System.out.println("==================");
		
		for(Copy_Emp2 e : m2) {
			if(e.getEname().equals("박")) {
				e.setEname("궁금해");
			}
			
		}
		for(Copy_Emp2 e : m2) {
			System.out.println(e);
		}
		
		System.out.println("리터레이터 실행");
		Iterator<Copy_Emp2> i = m2.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("리스트이터레이터 실행");
		ListIterator<Copy_Emp2> s = m2.listIterator();
		while(s.hasNext()) {
			System.out.println(s.next());
		}
		System.out.println("종료");
		
		while(s.hasPrevious()) {
			System.out.println(s.previous());
		}
		
	}
}

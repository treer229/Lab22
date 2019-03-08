import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
 set 인터페이스를 구현하고 있는 클래스
 set 순서(x), 중복(x) 데이터 집합을 다룰때....
 구현하는 클래스 : HashSet , TreeSet
 순서 보장하지 않았요 랜덤은도 패턴이 있는데.....
 
 */

public class Ex10_Set_Interface {
	public static void main(String[] args) {
		HashSet<Integer> hs1 = new HashSet<Integer>();
		hs1.add(1);
		hs1.add(2);
		hs1.add(55);
		hs1.add(43);
		
		//1.중복데이터 처리(Point)
		
		boolean bo = hs1.add(1);
		System.out.println("중복된 데이터가 들어가는지 확인");
		System.out.println(bo);
		System.out.println("데이터 출력");
		System.out.println(hs1);
		System.out.println("데이터가 순서대로 들어가는지 확인");
		hs1.add(3);
		System.out.println(hs1);
		
		HashSet<String> ii = new HashSet<String>();
		ii.add("b");
		ii.add("a");
		ii.add("f");
		ii.add("F");
		ii.add("c");
		ii.add("z");
		ii.add("A");
		ii.add("oA");
		System.out.println("순서를 유지하지 않음");
		System.out.println(ii.toString());
		
		byte bbb = (byte)((int)(Math.random()*45)+1);
		System.out.println(bbb);
		
		
		String[] obj = {"A", "B", "A", "C", "D", "B", "A"};
		HashSet<String> hs3 = new HashSet<String>();
		for(int i = 0; i<obj.length; i++) {
			hs3.add(obj[i]);
		}
		System.out.println(hs3.toString());
		
		
//		for(int s : i) {
//			System.out.println(s);
//		} 문제가 있다고 하내용ㅎㅎ;
		
		//Quiz
		//HashSet 사용해서 1~45까지 난수 6개를 넣으세요
		
		HashSet Ma = new HashSet();
		Set set = Ma;
		for(int i = 0; set.size() < 6; i++) {
			int math = (int)(Math.random()*45+1);
			set.add(math);
		}
		System.out.println(set.toString());
		
		Set<Integer> ma2 = new HashSet();	
		
		while(ma2.size() < 6) {
			int math = (int)(Math.random()*45+1);
			ma2.add(math);
		}
		
		for(Integer se : ma2) {
			System.out.println(se);
		}
		System.out.println();
		
		Set set2 = Ma;
		int count = 0;
		while(set2.size() < 6) {
			count++;
			int math2 = (int)(Math.random()*45+1);
			set2.add(math2); 
		}
		System.out.println(set2.toString());
		System.out.println(count+"회만큼 실행했다리");
		
		HashSet<String> set3 = new HashSet<String>();
		set3.add("AA");
		set3.add("DD");
		set3.add("ABC");
		set3.add("FFFF");
		System.out.println(set3.toString());
		
		Iterator<String> s = set3.iterator();
		while(s.hasNext()) {
			System.out.println(s.next());
		}
		//add된 순서를 보장하지 않아요 (배열이 아니에요)

//		Collections.sort(List<T> list); List 인터페이스를 구현하는 모든 객체 parameter로
		System.out.println("++++++++++++++++++++++++");
		System.out.println("콜렉션 소트를 사용해 해쉬를 리스트에 넣어서 정렬해버림");
		List list = new ArrayList(set3);
		System.out.println("무작위"+list);
		 Collections.sort(list);
		System.out.println("after : 정렬 " + list);
		
		//HashSet 확장 > LinkedHashSet (순서를 유지하는 방법) : 주소값을 가지고 서로 연결(node) > 개념
		Set<String> hs2 = new LinkedHashSet<String>();
		hs2.add("B");
		hs2.add("A");
		hs2.add("F");
		hs2.add("K");
		hs2.add("G");
		hs2.add("D");
		hs2.add("P");
		hs2.add("A");
		System.out.println("데이터를 add한 순서지 데이터가 정렬되는 것은 아니다");
		System.out.println(hs2.toString());
		
		//순서(X) , 중복(X) , 정렬(sort) : 오름차순 기본적 제공
		//TreeSet : 검색과 정렬 두가지 요소를 필요로 하는 구조 
		//이진트리 : 정렬되고 많은 양의 데이터 저장 효율적이당
		//로또 조건 : 1~45까지 난수 >> 6개 >> 중복(X) >> 정렬(0)
		
		Set<Integer> lotto = new TreeSet<Integer>();
		for(int i = 0; lotto.size() < 6; i++) {
			lotto.add((int)(Math.random()*45)+1);
		}
		System.out.println("로또~");
		System.out.println(lotto.toString());
		
		int sum = 0;
		Iterator<Integer> lo = lotto.iterator();
		while(lo.hasNext()) {
//			System.out.println(lo.next());
			sum += lo.next();
		}
		System.out.println("lotto의 총합 "+sum);
	}
}

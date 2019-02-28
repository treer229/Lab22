import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//Collection Framework;
//나열된 자원에대해 순차적으로 접근해서 값을 리턴하는 표준 정의
//Iterator 인터페이스 설계
//예를 들어 A클래스 Iterator 구현
//		 B클래스 Iterator 구현
// 내가 보장 받는 것은 : hasNext(); Next(); 구현되어 있을 것이다.

//ArrayList() >> Iterator를 구현하고 있다.
////표준화된 인터페이스를 통해서 리턴값을 받을 수 있닫. ㅎ
//포문을 쓰는 사람 마음대루 하지만 그걸 막고싶은거야~ 
//막써도되는다 표준화된 접근방식으로 세련되게 가자는거야 알겠니?
//표준화된 접근 알겠냐고? 몰라? 왜몰라? 뭘 몰라? 오[ㅇㄹㅇ니ㅓㅏㅏㅣㅊ티ㅏㅏㅣ나]

//Iterator : 순방향 데이터 read 표준
//ListIterator : 양방향 데이터 표준

public class Ex09_Collection_Iter {
	public static void main(String[] args) {
		ArrayList e = new ArrayList();
		e.add(1);
		e.add(2);
		e.add(3);
		for (int i = 0; i < e.size(); i++) {
			System.out.println(e.get(i));
		}

		// 표준화된 인터페이스를 사용해서 출룍한다묜
		Iterator it = e.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("우왕ㅋ굳ㅋ hasnext? next?");
		// 콜랙션이란 함수가 이터레이터를 가지고 있다. 이터레이터 타입의 이터레이터라니 ㄷㄷ; 로직을 구현해야되죠 ㅜㅜ 넹 하위 클래스인 어레이
		// 리스트가 구현했다 이게 탬플릿인가 뭐시깽이인가가 그런것같은데그쵸 ㅜㅜ 콜렉션 인터페이스를 누가 상속받았죠??어레이 리스트가 구현한거얌
		// 어레이 리스트가 가지고 있당깨 리터레이 어레이 리스트가 구현했다 ?템플릿?
		// 표준화된 접근을 만들었다능 ㅎㅎ~ 백프로 포문써도 되지만 있어보이는 Iterator 꼭 써야된다. 간지를 위해
		// 넘나넘나 멋잇어 꼭 써야됨 Iterator 꼭 써야됨 ㅎ 넘나넘나 멋져 꼭 써야된다 있어보이는것
		// Iterator
		// Collection (Iterator iterator() } 추상자원이자너
		// List extends Collection
		// ArrayList implement List\
		// ArrayList >> iterator() 함수의 {실행블럭을 구현}

		ArrayList<Integer> intlist = new ArrayList<Integer>();
		intlist.add(44);
		intlist.add(55);
		intlist.add(66);

		System.out.println("정방향");
		Iterator<Integer> list2 = intlist.iterator();
		while (list2.hasNext()) {
			System.out.println(list2.next());
		}
		
		//역방향
		System.out.println("역방향 실행");
		for(int i = intlist.size()-1; i>=0; i--) {
			System.out.println(intlist.get(i));
		}
		//ListIterator (순방향, 역방향) 다가능 그러나! 역방향 하려면! 슌뱡향 한번 하고 해야되기때문에 초 단점이 아닐수 없다 이말이다~ 이말이야~ 라떼는 말이야 포문쓰고 그랬다 이말이지 그런데 요즘것은 아주~ 근성이없어 근성이\
		ListIterator<Integer> lis = intlist.listIterator();
		while(lis.hasNext()) {
			System.out.println(lis.next());
		}
		
		while(lis.hasPrevious()) {
			System.out.println(lis.previous());
		}
		
		//7.사원정보를 
		
		
	}
}

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Ex02_ArrayList {
	public static void main(String[] args) {
		ArrayList arraylist = new ArrayList();
		arraylist.add(100);
		arraylist.add(200);
		arraylist.add(300);
		
		System.out.println(arraylist.toString());
		for(int i = 0; i<arraylist.size(); i++) {
			System.out.println(arraylist.get(i));
		}
		
		System.out.println("현재[0] : " + arraylist.get(0));
		//add 데이터 추가하는 함수 (기본적인 추가 순차적으로다가)
		//비순차적으로 데이터를 추가 할 수 있는 방법이 있다?!
		arraylist.add(0, 1111);
		System.out.println("add : " + arraylist.toString());
		//기존에 있던 자원 자리이동
		//데이터 삽입 add default(맨뒤 순차....)
		//데이터 삽입 add중간에 추가 , 삭제....
		//ArrayList 중간에 데이터를 추가 하거나, 삭제하는 작업은 성능에 악영향을 줍니다용
		//순차적인 데이터 추가 삭제 좋아요
		
		arraylist.remove(0);
		System.out.println("size: " + arraylist.size());
		System.out.println("remove: " + arraylist.toString());
		
		//ArrayList 햄수...
		System.out.println(arraylist.contains(100));
		System.out.println(arraylist.isEmpty());
		arraylist.clear();
		System.out.println("클리어 후 어레이 리스트 사이즈 "+ arraylist.size());
		System.out.println(arraylist.isEmpty());
		
		arraylist.add(101);
		arraylist.add(102);
		arraylist.add(103);
		System.out.println(arraylist.toString());
		
		ArrayList list = new ArrayList();
		
		list.add("가");
		list.add("나");
		list.add("다");
		list.add("라");
		list.add("가");
		
		System.out.println("ArraryList : 선서유지 " + list.toString());
		list.remove("가");//순사적으로 찾아서 걸리면 삭제
		System.out.println(list.toString());
		
		//이 코드는 매우 중요하다
		List li = new ArrayList();
		li.add("가");
		li.add("나");
		li.add("다");
		System.out.println(li.toString());
		
		
		System.out.println("alist 시작");
		ArrayList alist = new ArrayList();
		alist.add(50);
		alist.add(1);
		alist.add(2);
		alist.add(40);
		alist.add(4);
		alist.add(52);
		alist.add(6);
		System.out.println(alist);
		Collections.sort(alist);
		System.out.println("after : "+ alist);
		
		System.out.println((int)alist.get(3)+4);
	}
}

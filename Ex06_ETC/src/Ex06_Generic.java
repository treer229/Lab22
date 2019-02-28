import java.util.ArrayList;

//Today Point
//generic
//JDK 1.5 부터 지원

//1.Object 타입 저항  => Object으~ 넘나넘나 편한것 하지만 꺼낼 떄 문제 생길거라능~~
//2.타입을 강제하는 방법입니다 그래서 > 타입의 안정성을 추구하자너~
//3.형변환 (casting) 문제 해결 : (car)Object downcasting 하지 않겠다..... 넘나 귀찮자너

class MyGen<T>{ // Type parameter MyGen<E>
	T obj;
	void add(T obj) {
		this.obj = obj;
	}
	
	T get() {
		return this.obj;
	}
}

class Person {
	int age = 199;

	@Override
	public String toString() {
		return "Person [age=" + age + "]";
	}
	
}


public class Ex06_Generic {
	public static void main(String[] args) {
		MyGen<String> mygen = new MyGen<String>();
		
		ArrayList<String> li = new ArrayList<String>();
		
		MyGen<Person> mygen2 = new MyGen();
		mygen.add("AAA");
		mygen2.add(new Person());
		Person p = mygen2.get();
		System.out.println(p);
		
		ArrayList list = new ArrayList();
		list.add("550");
		list.add(1);
		list.add(new Person());
		
		ArrayList<Person> alist = new ArrayList<Person>();
		alist.add(new Person());
		System.out.println(alist.get(0).age);
		
	}
}

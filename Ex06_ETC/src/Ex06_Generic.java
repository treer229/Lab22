import java.util.ArrayList;

//Today Point
//generic
//JDK 1.5 ���� ����

//1.Object Ÿ�� ����  => Object��~ �ѳ��ѳ� ���Ѱ� ������ ���� �� ���� ����Ŷ��~~
//2.Ÿ���� �����ϴ� ����Դϴ� �׷��� > Ÿ���� �������� �߱����ڳ�~
//3.����ȯ (casting) ���� �ذ� : (car)Object downcasting ���� �ʰڴ�..... �ѳ� �����ڳ�

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

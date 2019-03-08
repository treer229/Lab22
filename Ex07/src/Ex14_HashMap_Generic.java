import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//Today Point
//HashMap<k,v>
//HashMap<String, String>
//HashMap<Integer, String>
//HashMap<Integer, String>
//HashMap<String, Emp> Point >> value ������ ��ü�� �� �� �ִ�.

//IO , NetWork , Thread >> ArrayList<Emp> , HashMap<String, Emp> �ڵ� Ȱ��

class Student {
	private int Kor=100;
	private int Math=50; 
	private int eng=20;
	private String name;
	
	public Student(String name) {
		this.name = name;
	}
	

	public int getKor() {
		return Kor;
	}


	public void setKor(int kor) {
		Kor = kor;
	}


	public int getMath() {
		return Math;
	}


	public void setMath(int math) {
		Math = math;
	}


	public int getEng() {
		return eng;
	}


	public void setEng(int eng) {
		this.eng = eng;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student [Kor=" + Kor + ", Math=" + Math + ", eng=" + eng + ", name=" + name + "]";
	}
	
	
}

public class Ex14_HashMap_Generic {
	public static void main(String[] args) {
		HashMap<String, Student> students = new HashMap<String, Student>();
		students.put("ksj", new Student("�Ǽ���"));
		students.put("kge", new Student("�ǰ���"));
		System.out.println(students.toString());
		
		Student kwanst = students.get("ksj");
		System.out.println(kwanst.toString());
		
		//Ű�ϰ� ������ �������� ��� ���
		System.out.println("��Ʈ���� ���!");
		Collection set = students.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//��������  case : value ��ü(Object) �϶� 
		//Map.Entry Ÿ���� ���ؼ�
		//getKey(). getValue() ������ ������ ��°���
		for(Map.Entry m : students.entrySet()) {
			System.out.println(m.getKey());
			System.out.println(m.getValue());
			
		}
		
	}
}

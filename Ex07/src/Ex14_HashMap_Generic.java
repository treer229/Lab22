import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//Today Point
//HashMap<k,v>
//HashMap<String, String>
//HashMap<Integer, String>
//HashMap<Integer, String>
//HashMap<String, Emp> Point >> value 값으로 객체가 올 수 있다.

//IO , NetWork , Thread >> ArrayList<Emp> , HashMap<String, Emp> 코드 활용

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
		students.put("ksj", new Student("권순조"));
		students.put("kge", new Student("권개똥"));
		System.out.println(students.toString());
		
		Student kwanst = students.get("ksj");
		System.out.println(kwanst.toString());
		
		//키하고 벨류를 묶은것을 모두 출력
		System.out.println("엔트리셋 출력!");
		Collection set = students.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//예외적인  case : value 객체(Object) 일때 
		//Map.Entry 타입을 통해서
		//getKey(). getValue() 각각의 정보를 출력가능
		for(Map.Entry m : students.entrySet()) {
			System.out.println(m.getKey());
			System.out.println(m.getValue());
			
		}
		
	}
}

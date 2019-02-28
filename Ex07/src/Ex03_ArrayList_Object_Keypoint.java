import java.util.ArrayList;

import kr.or.bit.Emp;

public class Ex03_ArrayList_Object_Keypoint {
	
	public static void main(String[] args) {
		//1.사원 1명의 정보를 담으세요
		
		Emp e = new Emp(100, "김유신", "군인");
		System.out.println(e.toString());
		
		//2. 사원 2명을 만드세요
		
		Emp[] e1 = {new Emp(101, "권순조", "학생"), new Emp(102, "권순2", "개발자")};
		
		for(Emp em : e1) {
			System.out.println(em.toString());
		}
		//실수했엉 한명이 입싸를 더 했어용....
		//위에 있는 정적 배열에다가 추가하는건 불가합니다.
		ArrayList<Emp> e2 = new ArrayList<Emp>();
		e2.add(new Emp(1,"kim", "IT"));
		e2.add(new Emp(2, "na", "IT"));
		
		System.out.println(e2.toString());
		
		System.out.println("향상된포문 시작");
		for(Object emm : e2) {
			System.out.println(emm);
		}
		System.out.println("향상된포문 끝");
		
		
		System.out.println("일반 포문 시작");
		for(int i =0; i<e2.size(); i++) {
			Emp emp = e2.get(i);
			System.out.println(emp.getEmpno()+ "," +emp.getEname()+ "," + emp.getJob());
		}
		System.out.println("일반 포문 끝");
		
	}
}

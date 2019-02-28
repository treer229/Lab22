import java.util.ArrayList;

import kr.or.bit.Emp;

public class Ex03_ArrayList_Object_Keypoint {
	
	public static void main(String[] args) {
		//1.��� 1���� ������ ��������
		
		Emp e = new Emp(100, "������", "����");
		System.out.println(e.toString());
		
		//2. ��� 2���� ���弼��
		
		Emp[] e1 = {new Emp(101, "�Ǽ���", "�л�"), new Emp(102, "�Ǽ�2", "������")};
		
		for(Emp em : e1) {
			System.out.println(em.toString());
		}
		//�Ǽ��߾� �Ѹ��� �Խθ� �� �߾��....
		//���� �ִ� ���� �迭���ٰ� �߰��ϴ°� �Ұ��մϴ�.
		ArrayList<Emp> e2 = new ArrayList<Emp>();
		e2.add(new Emp(1,"kim", "IT"));
		e2.add(new Emp(2, "na", "IT"));
		
		System.out.println(e2.toString());
		
		System.out.println("�������� ����");
		for(Object emm : e2) {
			System.out.println(emm);
		}
		System.out.println("�������� ��");
		
		
		System.out.println("�Ϲ� ���� ����");
		for(int i =0; i<e2.size(); i++) {
			Emp emp = e2.get(i);
			System.out.println(emp.getEmpno()+ "," +emp.getEname()+ "," + emp.getJob());
		}
		System.out.println("�Ϲ� ���� ��");
		
	}
}

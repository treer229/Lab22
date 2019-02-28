import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import kr.or.bit.Copy_Emp2;
import kr.or.bit.Emp;

public class Ex08_Ge_Quiz {
	public static void main(String[] args) {
		//1. Emp Ŭ������ ����ؼ� ��� 3�� ����
		//�� ArrayList ���ʸ��� ����ϼ���
		
		List<Emp> m = new ArrayList<Emp>();
		
		m.add(new Emp(100, "��", "It"));
		m.add(new Emp(200, "��", "It"));
		m.add(new Emp(300, "��", "It"));
		
		//2. 3���� ��� ������ ������ ������ ����ؼ� ���
		for(Emp n : m) {
			System.out.println(n);
		}
		//3. �Ϲ������Ἥ ��� ���� ��� ���� �ʹ��Ͻʴϴ�
		for(int i = 0; i<m.size(); i++) {
			System.out.println(m.get(i));
		}
		
		//4.Copy Emp��� Ŭ������ ����µ� Emp�� ������ �Ȱ���. �׷��� !! 
		//���̶�� ����ʵ� ��ſ� private int sal �߰��ϰ� getter setter ������
		
		List<Copy_Emp2> m2 = new ArrayList<Copy_Emp2>();
		
		m2.add(new Copy_Emp2(100, "��", 1000));
		m2.add(new Copy_Emp2(200, "��", 2000));
		m2.add(new Copy_Emp2(300, "��", 3000));
		
		System.out.println("++++++++++++");
		for(Copy_Emp2 a : m2) {
			System.out.println(a);
		}
		
		//200������� �޿��� 500���� �ٲ㼭 ���
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
			if(e.getEname().equals("��")) {
				e.setEname("�ñ���");
			}
			
		}
		for(Copy_Emp2 e : m2) {
			System.out.println(e);
		}
		
		System.out.println("���ͷ����� ����");
		Iterator<Copy_Emp2> i = m2.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("����Ʈ���ͷ����� ����");
		ListIterator<Copy_Emp2> s = m2.listIterator();
		while(s.hasNext()) {
			System.out.println(s.next());
		}
		System.out.println("����");
		
		while(s.hasPrevious()) {
			System.out.println(s.previous());
		}
		
	}
}

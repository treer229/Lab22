import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//Collection Framework;
//������ �ڿ������� ���������� �����ؼ� ���� �����ϴ� ǥ�� ����
//Iterator �������̽� ����
//���� ��� AŬ���� Iterator ����
//		 BŬ���� Iterator ����
// ���� ���� �޴� ���� : hasNext(); Next(); �����Ǿ� ���� ���̴�.

//ArrayList() >> Iterator�� �����ϰ� �ִ�.
////ǥ��ȭ�� �������̽��� ���ؼ� ���ϰ��� ���� �� �ִ�. ��
//������ ���� ��� ������� ������ �װ� ��������ž�~ 
//���ᵵ�Ǵ´� ǥ��ȭ�� ���ٹ������ ���õǰ� ���ڴ°ž� �˰ڴ�?
//ǥ��ȭ�� ���� �˰ڳİ�? ����? �ָ���? �� ����? ��[�������Ϥä����Ӥ�Ƽ�����ӳ�]

//Iterator : ������ ������ read ǥ��
//ListIterator : ����� ������ ǥ��

public class Ex09_Collection_Iter {
	public static void main(String[] args) {
		ArrayList e = new ArrayList();
		e.add(1);
		e.add(2);
		e.add(3);
		for (int i = 0; i < e.size(); i++) {
			System.out.println(e.get(i));
		}

		// ǥ��ȭ�� �������̽��� ����ؼ� �⏋�Ѵٹ�
		Iterator it = e.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("��դ����� hasnext? next?");
		// �ݷ����̶� �Լ��� ���ͷ����͸� ������ �ִ�. ���ͷ����� Ÿ���� ���ͷ����Ͷ�� ����; ������ �����ؾߵ��� �̤� �� ���� Ŭ������ ���
		// ����Ʈ�� �����ߴ� �̰� ���ø��ΰ� ���ò����ΰ��� �׷��Ͱ��������� �̤� �ݷ��� �������̽��� ���� ��ӹ޾���??��� ����Ʈ�� �����Ѱž�
		// ��� ����Ʈ�� ������ �ִ�� ���ͷ��� ��� ����Ʈ�� �����ߴ� ?���ø�?
		// ǥ��ȭ�� ������ ������ٴ� ����~ ������ �����ᵵ ������ �־�̴� Iterator �� ��ߵȴ�. ������ ����
		// �ѳ��ѳ� ���վ� �� ��ߵ� Iterator �� ��ߵ� �� �ѳ��ѳ� ���� �� ��ߵȴ� �־�̴°�
		// Iterator
		// Collection (Iterator iterator() } �߻��ڿ����ڳ�
		// List extends Collection
		// ArrayList implement List\
		// ArrayList >> iterator() �Լ��� {������� ����}

		ArrayList<Integer> intlist = new ArrayList<Integer>();
		intlist.add(44);
		intlist.add(55);
		intlist.add(66);

		System.out.println("������");
		Iterator<Integer> list2 = intlist.iterator();
		while (list2.hasNext()) {
			System.out.println(list2.next());
		}
		
		//������
		System.out.println("������ ����");
		for(int i = intlist.size()-1; i>=0; i--) {
			System.out.println(intlist.get(i));
		}
		//ListIterator (������, ������) �ٰ��� �׷���! ������ �Ϸ���! ������ �ѹ� �ϰ� �ؾߵǱ⶧���� �� ������ �ƴҼ� ���� �̸��̴�~ �̸��̾�~ �󶼴� ���̾� �������� �׷��� �̸����� �׷��� ������� ����~ �ټ��̾��� �ټ���\
		ListIterator<Integer> lis = intlist.listIterator();
		while(lis.hasNext()) {
			System.out.println(lis.next());
		}
		
		while(lis.hasPrevious()) {
			System.out.println(lis.previous());
		}
		
		//7.��������� 
		
		
	}
}

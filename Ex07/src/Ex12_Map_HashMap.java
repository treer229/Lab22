import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 Map �������̽��� �����ϴ� Ŭ����
 
 Map�̶�� �༮�� ������? key, value �� �ϳ��� �ֹ迭�̶� ����¡ 
 ex) ������ȣ : (02, ����) , �����ȣ : (155, �츮��) �̷��� ������
 Key �� : �ߺ�(x);
 value : �ߺ�(o);
 Ű���� ���� �������� ã�°ž� ��
 
 Map >> Generic ����
 
 HashTable(�������Ӥ�) : ����ȭ ���� (���� ���۰��ڳ�)
 HashMap(�Ź�������) : ����ȭ ���� ���ؿ뤾�� �ʿ信 ���� ����ȭ �� �� �־
 
 */

public class Ex12_Map_HashMap {
	
	public static void main(String[] args) {
	
		HashMap map = new HashMap();
		map.put("Ÿ�̰�", "1004");
		map.put("������", "��");
		map.put("Ȧ������", "��");
		//Ȱ�� : ȸ���� ���̵�, ��й�ȣ�� ��Ƶη���
		//�޸�(heap) >> ���� ����(���ϱ��) login.txt ���������� ����� >> RDBMS(������DB) ����?! �̷��� �־�>!!:!:>!>!!??!
		System.out.println(map.containsKey("������")); 
		System.out.println(map.containsKey("Ȧ������"));
		System.out.println(map.containsValue("��"));
		
		//Point : key���� ������ value���� ã�´�~~~~~~
		System.out.println("++++++++++++++");
		System.out.println(map.get("Ÿ�̰�")); // ȫ�̶�� key���� map�� ������ ���� �ʴ�.
		
		//���ģ�� �̤� �ܱ׷� �̤̤�
		//put
		map.put("Ÿ�̰�", 1008);//Ű�� ���� ���� ������ ����������. ��������Ʈ�ع����� 
		System.out.println("��������Ʈ �ǹ��� Ÿ�̰� �� �̤�");
		System.out.println(map.get("Ÿ�̰�"));
		System.out.println("before map.size() " + map.size());
		
		System.out.println("�����Ǿ���� Ȧ������ �̤Ѥ� �ʹ� ����");
		Object result = map.remove("Ȧ������");
		System.out.println("remove() �� ���ϰ����� ����� �������� �������شٸ� : " + result );
		System.out.println("after map.size() " + map.size());
		System.out.println(map.get("Ȧ������"));
		
		System.out.println("map.keyset() �Լ��� �Ʒ�ó�� ���´ٸ�");
		System.out.println(map.keySet());
		
		Set set = map.keySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		System.out.println("������~~");
		Collection col = map.values();
		Iterator it2=col.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
	}
}

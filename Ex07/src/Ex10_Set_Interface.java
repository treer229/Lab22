import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
 set �������̽��� �����ϰ� �ִ� Ŭ����
 set ����(x), �ߺ�(x) ������ ������ �ٷ궧....
 �����ϴ� Ŭ���� : HashSet , TreeSet
 ���� �������� �ʾҿ� �������� ������ �ִµ�.....
 
 */

public class Ex10_Set_Interface {
	public static void main(String[] args) {
		HashSet<Integer> hs1 = new HashSet<Integer>();
		hs1.add(1);
		hs1.add(2);
		hs1.add(55);
		hs1.add(43);
		
		//1.�ߺ������� ó��(Point)
		
		boolean bo = hs1.add(1);
		System.out.println("�ߺ��� �����Ͱ� ������ Ȯ��");
		System.out.println(bo);
		System.out.println("������ ���");
		System.out.println(hs1);
		System.out.println("�����Ͱ� ������� ������ Ȯ��");
		hs1.add(3);
		System.out.println(hs1);
		
		HashSet<String> ii = new HashSet<String>();
		ii.add("b");
		ii.add("a");
		ii.add("f");
		ii.add("F");
		ii.add("c");
		ii.add("z");
		ii.add("A");
		ii.add("oA");
		System.out.println("������ �������� ����");
		System.out.println(ii.toString());
		
		byte bbb = (byte)((int)(Math.random()*45)+1);
		System.out.println(bbb);
		
		
		String[] obj = {"A", "B", "A", "C", "D", "B", "A"};
		HashSet<String> hs3 = new HashSet<String>();
		for(int i = 0; i<obj.length; i++) {
			hs3.add(obj[i]);
		}
		System.out.println(hs3.toString());
		
		
//		for(int s : i) {
//			System.out.println(s);
//		} ������ �ִٰ� �ϳ��뤾��;
		
		//Quiz
		//HashSet ����ؼ� 1~45���� ���� 6���� ��������
		
		HashSet Ma = new HashSet();
		Set set = Ma;
		for(int i = 0; set.size() < 6; i++) {
			int math = (int)(Math.random()*45+1);
			set.add(math);
		}
		System.out.println(set.toString());
		
		Set<Integer> ma2 = new HashSet();	
		
		while(ma2.size() < 6) {
			int math = (int)(Math.random()*45+1);
			ma2.add(math);
		}
		
		for(Integer se : ma2) {
			System.out.println(se);
		}
		System.out.println();
		
		Set set2 = Ma;
		int count = 0;
		while(set2.size() < 6) {
			count++;
			int math2 = (int)(Math.random()*45+1);
			set2.add(math2); 
		}
		System.out.println(set2.toString());
		System.out.println(count+"ȸ��ŭ �����ߴٸ�");
		
		HashSet<String> set3 = new HashSet<String>();
		set3.add("AA");
		set3.add("DD");
		set3.add("ABC");
		set3.add("FFFF");
		System.out.println(set3.toString());
		
		Iterator<String> s = set3.iterator();
		while(s.hasNext()) {
			System.out.println(s.next());
		}
		//add�� ������ �������� �ʾƿ� (�迭�� �ƴϿ���)

//		Collections.sort(List<T> list); List �������̽��� �����ϴ� ��� ��ü parameter��
		System.out.println("++++++++++++++++++++++++");
		System.out.println("�ݷ��� ��Ʈ�� ����� �ؽ��� ����Ʈ�� �־ �����ع���");
		List list = new ArrayList(set3);
		System.out.println("������"+list);
		 Collections.sort(list);
		System.out.println("after : ���� " + list);
		
		//HashSet Ȯ�� > LinkedHashSet (������ �����ϴ� ���) : �ּҰ��� ������ ���� ����(node) > ����
		Set<String> hs2 = new LinkedHashSet<String>();
		hs2.add("B");
		hs2.add("A");
		hs2.add("F");
		hs2.add("K");
		hs2.add("G");
		hs2.add("D");
		hs2.add("P");
		hs2.add("A");
		System.out.println("�����͸� add�� ������ �����Ͱ� ���ĵǴ� ���� �ƴϴ�");
		System.out.println(hs2.toString());
		
		//����(X) , �ߺ�(X) , ����(sort) : �������� �⺻�� ����
		//TreeSet : �˻��� ���� �ΰ��� ��Ҹ� �ʿ�� �ϴ� ���� 
		//����Ʈ�� : ���ĵǰ� ���� ���� ������ ���� ȿ�����̴�
		//�ζ� ���� : 1~45���� ���� >> 6�� >> �ߺ�(X) >> ����(0)
		
		Set<Integer> lotto = new TreeSet<Integer>();
		for(int i = 0; lotto.size() < 6; i++) {
			lotto.add((int)(Math.random()*45)+1);
		}
		System.out.println("�ζ�~");
		System.out.println(lotto.toString());
		
		int sum = 0;
		Iterator<Integer> lo = lotto.iterator();
		while(lo.hasNext()) {
//			System.out.println(lo.next());
			sum += lo.next();
		}
		System.out.println("lotto�� ���� "+sum);
	}
}

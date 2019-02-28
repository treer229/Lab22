import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Ex02_ArrayList {
	public static void main(String[] args) {
		ArrayList arraylist = new ArrayList();
		arraylist.add(100);
		arraylist.add(200);
		arraylist.add(300);
		
		System.out.println(arraylist.toString());
		for(int i = 0; i<arraylist.size(); i++) {
			System.out.println(arraylist.get(i));
		}
		
		System.out.println("����[0] : " + arraylist.get(0));
		//add ������ �߰��ϴ� �Լ� (�⺻���� �߰� ���������δٰ�)
		//����������� �����͸� �߰� �� �� �ִ� ����� �ִ�?!
		arraylist.add(0, 1111);
		System.out.println("add : " + arraylist.toString());
		//������ �ִ� �ڿ� �ڸ��̵�
		//������ ���� add default(�ǵ� ����....)
		//������ ���� add�߰��� �߰� , ����....
		//ArrayList �߰��� �����͸� �߰� �ϰų�, �����ϴ� �۾��� ���ɿ� �ǿ����� �ݴϴٿ�
		//�������� ������ �߰� ���� ���ƿ�
		
		arraylist.remove(0);
		System.out.println("size: " + arraylist.size());
		System.out.println("remove: " + arraylist.toString());
		
		//ArrayList �ܼ�...
		System.out.println(arraylist.contains(100));
		System.out.println(arraylist.isEmpty());
		arraylist.clear();
		System.out.println("Ŭ���� �� ��� ����Ʈ ������ "+ arraylist.size());
		System.out.println(arraylist.isEmpty());
		
		arraylist.add(101);
		arraylist.add(102);
		arraylist.add(103);
		System.out.println(arraylist.toString());
		
		ArrayList list = new ArrayList();
		
		list.add("��");
		list.add("��");
		list.add("��");
		list.add("��");
		list.add("��");
		
		System.out.println("ArraryList : �������� " + list.toString());
		list.remove("��");//���������� ã�Ƽ� �ɸ��� ����
		System.out.println(list.toString());
		
		//�� �ڵ�� �ſ� �߿��ϴ�
		List li = new ArrayList();
		li.add("��");
		li.add("��");
		li.add("��");
		System.out.println(li.toString());
		
		
		System.out.println("alist ����");
		ArrayList alist = new ArrayList();
		alist.add(50);
		alist.add(1);
		alist.add(2);
		alist.add(40);
		alist.add(4);
		alist.add(52);
		alist.add(6);
		System.out.println(alist);
		Collections.sort(alist);
		System.out.println("after : "+ alist);
		
		System.out.println((int)alist.get(3)+4);
	}
}

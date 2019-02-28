import java.util.Vector;

/*
 ǥ��ȭ�� �������̽��� �����ϴ� Ŭ���� ����
 
 
 		collection
 
 			 |
 	list(���)  set(���)				map(�������̽�)
 		|			|				 |
 	Vector		set(���)				[HashMap]
 	[ArrayList]	Treeset
 		
 	List interface [���� ���ÿ�~~~~]
 	����(0), �ߺ����(0) > ���������� ������ ����(�迭�� �Ѵ�~ �̸��̾�) > Array[0][1][2].......~
 	
 	1.vector(������) -> ����ȭ(��Ƽ ������) -> Lock ����(default) -> ������ ��ȣ�� ���� �츮��
 	2.ArrayList(�Ź���) -> ����ȭ(��Ƽ ������) => Lock ����X => �ʿ信 ���� �����ϰ� Lock���� ����  => ���ɰ��� �εյεεο��
 	Ex)����ȭ
 	
 	
 	Array(�迭) : �����迭(ũ�Ⱑ �����Ǿ� �ִ�)
 	���� ���� ���� ���� ����Ұ� �̤̤̤�
 	int[] arr = new int[10];
 	int[] arr = {10,20,30};
 	
 	Ararry(����, ����) => �ʱ⼳���� ũ�� ���� �Ұ�
 	1.�迭��  ũ�� ���� : Car[] cars = {new Car(), new Car()};
 	2.�迭�� ���� : index(÷��) : cars[0], car[0].color
 	
 	List �������̽� ������ Ŭ���� (Vector, ArrayList) : ���� �迭
 	1. �迭�� ũ�⸦ ���� Ȯ�� , ��� ���� => �迭�� ���Ҵ� => �ƶ� ���� ��;
 	2.������ ����(Array), ����(index), �ߺ��� ���
 	3.������ ������� Array���
 	4.List �������̽��� ������ Ŭ����( new�� ���� ��ü ���� ���)
 	5.���� Ŭ����(ArrayList)�� ������ ������ Ÿ�� : Object[] arr = new Object[10] Ÿ�����δٰ� �մϴ�.
 		���� : ��� Ÿ���� �θ� Ÿ��(int, Car, String....) ��� �ڷ� ����
 		���� : ������ object�� ��������ؼ� ����ؾߵȴٴ� ���� �̤̤̤̤�
 	6. ������ �غ��ϱ� ���� ��� ���ʷ󤧤�����?(Ÿ�԰���) ���� ���� �ذ�
 	
 	
 */


public class Ex01_Vector {
	
	public static void main(String[] args) {
		Vector v = new Vector();
		System.out.println("�ʱ� ����Ʈ �뷮 :" + v.capacity());
		v.add("AA");//[0]
		v.add("BB");//[1]
		v.add("AA");//[2]
		v.add(100); //[3]
		System.out.println(v);
		
		for(int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i)); //get �Լ��� return type = Object;
		}
		System.out.println("get�Լ� ���");
		
		for(Object obj : v) {
			System.out.println(obj);
		}
		System.out.println("���� ���� ���");
		
		Vector<String> v2 = new Vector<String>();
		v2.add("Hell");
		v2.add("war");
		for(String s : v2) {
			System.out.println(s);
		}
		System.out.println("���ʸ� ���");
		System.out.println();
		
		System.out.println("������"+v2.size());
		System.out.println("ĳ�۽�Ƽ"+v2.capacity());
		System.out.println();
		
		System.out.println("v3 ���� ����");
		Vector v3 = new Vector();
		System.out.println(v3.capacity());
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		v3.add("A");
		System.out.println("10���� ī�Ľ�Ƽ "+v3.capacity());
		v3.add("A");
		System.out.println("11��° ����� ������"+v3 .size());
		System.out.println("11��° ����� ī�Ľ�Ƽ"+v3 .capacity());
		
	}
}

/*
 String Ŭ����
 �� ������ ��� �������� Ŭ�����ٶ�� ����� ��������;
 
 1. String Ŭ���� : ������ ����(heap) : �ڷᱸ�� : char[] �迭
 2. String ename : "a�浿"; [a][��][��]
 3. String s = new String("ABCD")
 */


public class Ex05_String {
	public static void main(String[] args) {
	String str = "ABCD";
	System.out.println(str.length());
	System.out.println(str);
	System.out.println(str.toString());
	
	String str1 = "AAA";
	String str2 = "BBB";
	System.out.println(str1);
	
	String str3 = new String("BBB");
	String str4 = new String("BBB");
	System.out.println(str3 == str4);
	}

}

/*
 String 클래스
 이 수업을 듣고 스르링은 클래스다라는 사실을 잊으세요;
 
 1. String 클래스 : 데이터 저장(heap) : 자료구조 : char[] 배열
 2. String ename : "a길동"; [a][길][동]
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

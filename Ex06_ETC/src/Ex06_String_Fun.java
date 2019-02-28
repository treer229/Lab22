import java.util.StringTokenizer;

public class Ex06_String_Fun {
	public static void main(String[] args) {

		String[] strarr = {"aaa","bbb","ccc"};
		
		for(String s : strarr) {
			System.out.println(s);
		}
		
		String ss = "hellow";
		String concatstr = ss.concat(" World");
		System.out.println(concatstr);
		
		boolean bo = ss.contains("ello");
		System.out.println(bo);
		
		String ss2 = "a b c d";
		boolean bo2 = ss2.contains("ab");
		System.out.println(ss2.length());
		System.out.println(bo2);
		
		String filename = "hello. java, world";
		filename.indexOf(",");
		System.out.println(filename.indexOf(" "));
		System.out.println(filename.indexOf("java"));//시작 위치 인덱스~~~
		
		//활용 : 문장내에서 내가 원하는 단어가 포함되어 있는지를 검증할 수 있다.
		//0보다 큰값을 반환하면 최소한 하나의 단어 포함ㅎㄷ;
		System.out.println(filename.lastIndexOf("."));
		//배열에 값이 없다라는 표현은 -1로 한다.
		
		//주로많이 쓰는 함수
		//length(); , indexof(), substring(); , replace(), ....split();
		String result = "superman";
		System.out.println(result.substring(5));
		String filenames = "aaaa.jpg";
		//파일명 >> 홍길동
		//확장자 >> jpg
		
		if(filenames.lastIndexOf(".") > 0) {
				System.out.println(filenames.substring(filenames.lastIndexOf(".")));
		}
		
		String file = filenames.substring(0, filenames.lastIndexOf("."));
		System.out.println(file);
		
		//replace
		String s = "abcd";
		String result5 = s.replace("a", "안녕");
		System.out.println(result5);
		
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(1));
		System.out.println(s.endsWith("c"));
		System.out.println(s.equalsIgnoreCase("ABCD"));
		//POINT
		//split
		String s6 = "슈퍼맨,팬티,빨간색,우하하,우하하";
		String[] namearry =s6.split(",");
		for(String uyh : namearry) {
			System.out.println(uyh);
		}
		
		String filename2 = "bit.hwp";
		String[] arry = filename2.split("\\.");
		System.out.println(arry.length);
		for(String sss : arry) {
			System.out.println(sss);//정규표현식 "." 은 특수문자라서 \\ 를 넣어줘야한다링
		}

		//java, javascript, DB >> 정규표현식
		//0000-{\d4}-0000
		//
		String s7 = "a/b,c.d=f";
		StringTokenizer sto = new StringTokenizer(s7,"/,.=");
		while(sto.hasMoreTokens()) {
			System.out.println(sto.nextToken());
		}
				
		//넌센스
		String ss1 = "홍                     길                     동";
		System.out.println(ss1.replace(" ", ""));
		
		String ss3 = "       홍길동            ";
		System.out.println(ss3.trim());
		
		
		String ss4 = "    홍         길        동          ";
		//여러개의 함수를 적용할 경우 (method chain)기법 사용
		ss4 = ss4.trim().replace(" ", "");
		System.out.println(ss4);
		
		int sum = 0;
		String[] numarr = {"1", "2", "3", "4", "5"};
		//문제 : 배열에 있는 문자값들의 문자값들의 합을 sum변수에 담아서 출력하세요
		for(String so : numarr) {
			sum+=Integer.parseInt(so);
		}
		System.out.println(sum);
		
		String jumin= "123456-1234567";
		//위 주민번호의 합을 구하세요

		int ssum =0;
		String[] arr = {};
		jumin = jumin.replace("-", "");
		System.out.println(jumin.substring(0));
		for(int i =0; i<jumin.length(); i++) {
//			arr[i] ==jumin.substring(0).split("");
		}
		System.out.println(ssum);
	}
}

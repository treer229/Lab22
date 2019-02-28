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
		System.out.println(filename.indexOf("java"));//���� ��ġ �ε���~~~
		
		//Ȱ�� : ���峻���� ���� ���ϴ� �ܾ ���ԵǾ� �ִ����� ������ �� �ִ�.
		//0���� ū���� ��ȯ�ϸ� �ּ��� �ϳ��� �ܾ� ���Ԥ���;
		System.out.println(filename.lastIndexOf("."));
		//�迭�� ���� ���ٶ�� ǥ���� -1�� �Ѵ�.
		
		//�ַθ��� ���� �Լ�
		//length(); , indexof(), substring(); , replace(), ....split();
		String result = "superman";
		System.out.println(result.substring(5));
		String filenames = "aaaa.jpg";
		//���ϸ� >> ȫ�浿
		//Ȯ���� >> jpg
		
		if(filenames.lastIndexOf(".") > 0) {
				System.out.println(filenames.substring(filenames.lastIndexOf(".")));
		}
		
		String file = filenames.substring(0, filenames.lastIndexOf("."));
		System.out.println(file);
		
		//replace
		String s = "abcd";
		String result5 = s.replace("a", "�ȳ�");
		System.out.println(result5);
		
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(1));
		System.out.println(s.endsWith("c"));
		System.out.println(s.equalsIgnoreCase("ABCD"));
		//POINT
		//split
		String s6 = "���۸�,��Ƽ,������,������,������";
		String[] namearry =s6.split(",");
		for(String uyh : namearry) {
			System.out.println(uyh);
		}
		
		String filename2 = "bit.hwp";
		String[] arry = filename2.split("\\.");
		System.out.println(arry.length);
		for(String sss : arry) {
			System.out.println(sss);//����ǥ���� "." �� Ư�����ڶ� \\ �� �־�����Ѵٸ�
		}

		//java, javascript, DB >> ����ǥ����
		//0000-{\d4}-0000
		//
		String s7 = "a/b,c.d=f";
		StringTokenizer sto = new StringTokenizer(s7,"/,.=");
		while(sto.hasMoreTokens()) {
			System.out.println(sto.nextToken());
		}
				
		//�ͼ���
		String ss1 = "ȫ                     ��                     ��";
		System.out.println(ss1.replace(" ", ""));
		
		String ss3 = "       ȫ�浿            ";
		System.out.println(ss3.trim());
		
		
		String ss4 = "    ȫ         ��        ��          ";
		//�������� �Լ��� ������ ��� (method chain)��� ���
		ss4 = ss4.trim().replace(" ", "");
		System.out.println(ss4);
		
		int sum = 0;
		String[] numarr = {"1", "2", "3", "4", "5"};
		//���� : �迭�� �ִ� ���ڰ����� ���ڰ����� ���� sum������ ��Ƽ� ����ϼ���
		for(String so : numarr) {
			sum+=Integer.parseInt(so);
		}
		System.out.println(sum);
		
		String jumin= "123456-1234567";
		//�� �ֹι�ȣ�� ���� ���ϼ���

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

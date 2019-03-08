import java.io.File;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex09_File_Format {
	
	public static void main(String[] args) {
		/*
		DecimalFormat df = new DecimalFormat("#, ###.0");
		String result = df.format(123456789.89);
		System.out.println(result);
		
		//��¥���� ó��
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd��");
		String strDate = sdf.format(new Date());
		System.out.println(strDate);
		
		//���¿� �O���ݸ�
		
		String message = "ȸ��ID:{0}\nȸ���̸�:{1}\nȸ����ȭ:{2}";
		String result2 = MessageFormat.format(message,"Ksg","¯¯��","01099998282");
		System.out.println(result2);
		*/
		File dir = new File("C:\\Temp");
		File[] files = dir.listFiles(); //files ������ ���� ���...
		for(int i = 0; i < files.length; i++) {
			File file = files[i];
			String name = file.getName(); // >> name >> a.txt, name >> NEW
			
			SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd HH-mma");
			String attribute = "";
			String size = "";
			
			if(files[i].isDirectory()) {
				attribute="<DIR>";
			} else {//��� ������ ���°Ŷ���~~
				size = file.length() + "byte";
				attribute += file.canRead() ? "R" : "";
				attribute += file.canWrite() ? "W" : "";
				attribute += file.isHidden() ? "H" : "";
			} 
			System.out.printf("%s    %3s   %10s    %s    \n", 
							 df.format(new Date(file.lastModified())), attribute, size, name);
		}
		
		
		
	}
}

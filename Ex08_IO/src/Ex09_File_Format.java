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
		
		//놜짜형식 처리
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		String strDate = sdf.format(new Date());
		System.out.println(strDate);
		
		//문좌열 횽식쵸리
		
		String message = "회원ID:{0}\n회원이름:{1}\n회원전화:{2}";
		String result2 = MessageFormat.format(message,"Ksg","짱짱맨","01099998282");
		System.out.println(result2);
		*/
		File dir = new File("C:\\Temp");
		File[] files = dir.listFiles(); //files 폴더와 파일 모두...
		for(int i = 0; i < files.length; i++) {
			File file = files[i];
			String name = file.getName(); // >> name >> a.txt, name >> NEW
			
			SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd HH-mma");
			String attribute = "";
			String size = "";
			
			if(files[i].isDirectory()) {
				attribute="<DIR>";
			} else {//요긴 파일이 들어가는거란다~~
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
